package com.shusheng.tihuzhai.biz.hiboss.admin.acuser.impl;

import com.shusheng.tihuzhai.biz.hiboss.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.AcUserService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.info.AcUserInfo;
import com.shusheng.tihuzhai.dao.entity.auto.AcUser;
import com.shusheng.tihuzhai.dao.entity.auto.AcUserExample;
import com.shusheng.tihuzhai.dao.mappers.auto.AcUserMapper;
import com.shusheng.tihuzhai.enums.TiHuZhaiResultEnum;
import com.shusheng.tihuzhai.enums.UserStateEnum;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/25 18:47
 */
@Service
public class AcUserServiceImpl implements AcUserService {

    @Autowired
    private AcUserMapper acUserMapper;

    @Override
    public DataResultBase addAcUser(AcUserInfo acUserInfo){
        DataResultBase addUserResult = new DataResultBase();

        AcUser acUser = new AcUser();
        try {
            BeanUtils.copyProperties(acUser, acUserInfo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        acUser.setRowAddTime(new Date());
        acUser.setRowUpdateTime(new Date());
        acUser.setPasswordErrorTimes(0);
        acUser.setStatus(UserStateEnum.NORMAL.code());

        int result = acUserMapper.insert(acUser);
        if(result==1){
            addUserResult.setSuccess(true);
            addUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            addUserResult.setDescription("新增用户成功");
        }else{
            addUserResult.setSuccess(false);
            addUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addUserResult.setDescription("新增用户失败");
        }
        return addUserResult;
    }

    @Override
    public int deleteAcUser(Long id) {
        return 0;
    }

    @Override
    public int updateAcUser(AcUserInfo acUserInfo) {
        return 0;
    }

    @Override
    public DataResultBase<AcUserInfo> getAcUserList(AcUserInfo acUserInfo) {
        return null;
    }

    @Override
    public DataResultBase<AcUserInfo> getAcUserByName(String username){
        DataResultBase<AcUserInfo> userInfoResult = new DataResultBase<AcUserInfo>();

        AcUserExample acUserExample = new AcUserExample();
        AcUserExample.Criteria criteria = acUserExample.createCriteria();
        criteria.andUserNameEqualTo(username);

        List<AcUser> acUserList = acUserMapper.selectByExample(acUserExample);
        if (acUserList.size() <= 0) {
            userInfoResult.setDescription("没有该用户！");
            userInfoResult.setStatus(TiHuZhaiResultEnum.USER_NOEXIST);
            return userInfoResult;
        } else if (acUserList.size() == 1) {
            AcUserInfo acUserInfo = new AcUserInfo();
            try {
                BeanUtils.copyProperties(acUserInfo, acUserList.get(0));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            userInfoResult.setData(acUserInfo);
            userInfoResult.setDescription("查询成功！");
            userInfoResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            return userInfoResult;
        } else {
            userInfoResult.setDescription("未知错误！");
            userInfoResult.setStatus(TiHuZhaiResultEnum.UN_KNOWN_EXCEPTION);
            return userInfoResult;
        }

    }
}
