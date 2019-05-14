package com.shusheng.tihuzhai.biz.hiboss.admin.acuser.impl;

import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.AcUserService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.info.AcUserInfo;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order.AcUserAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order.AcUserListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order.AcUserUpdateOrder;
import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.dao.entity.auto.AcUser;
import com.shusheng.tihuzhai.dao.entity.auto.AcUserExample;
import com.shusheng.tihuzhai.dao.mappers.auto.AcUserMapper;
import com.shusheng.tihuzhai.enums.TiHuZhaiResultEnum;
import com.shusheng.tihuzhai.enums.UserStateEnum;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
    public DataResultBase addAcUser(AcUserAddOrder acUserAddOrder){
        DataResultBase addUserResult = new DataResultBase();

        /**判断该用户是否己存在*/
        AcUserExample acUserExample = new AcUserExample();
        AcUserExample.Criteria criteria = acUserExample.createCriteria();
        criteria.andUserNameEqualTo(acUserAddOrder.getUserName());
        criteria.andStatusNotEqualTo(UserStateEnum.DELETED.code());
        List<AcUser> acUserList = acUserMapper.selectByExample(acUserExample);
        if(acUserList.size()>0){
            addUserResult.setSuccess(false);
            addUserResult.setStatus(TiHuZhaiResultEnum.USER_EXIST);
            addUserResult.setDescription("该用户己存在");
            return addUserResult;
        }

        AcUser acUser = new AcUser();
        try {
            BeanUtils.copyProperties(acUser, acUserAddOrder);
        } catch (Exception e) {
            e.printStackTrace();
            addUserResult.setSuccess(false);
            addUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addUserResult.setDescription("新增用户失败");
            return addUserResult;
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
    public DataResultBase deleteAcUser(Long id) {
        DataResultBase deleteUserResult = new DataResultBase();

        /**判断该用户是否存在*/
        AcUserExample acUserExample = new AcUserExample();
        AcUserExample.Criteria criteria = acUserExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStatusNotEqualTo(UserStateEnum.DELETED.code());
        List<AcUser> acUserList = acUserMapper.selectByExample(acUserExample);
        if(acUserList.size()<1){
            deleteUserResult.setSuccess(false);
            deleteUserResult.setStatus(TiHuZhaiResultEnum.USER_NOEXIST);
            deleteUserResult.setDescription("该用户不存在");
            return deleteUserResult;
        }

        AcUser acUser = new AcUser();
        acUser.setId(id);
        acUser.setStatus("deleted");
        acUser.setRowUpdateTime(new Date());
        int result = acUserMapper.updateByPrimaryKeySelective(acUser);
        if(result==1){
            deleteUserResult.setSuccess(true);
            deleteUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            deleteUserResult.setDescription("删除用户成功");
        }else{
            deleteUserResult.setSuccess(false);
            deleteUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            deleteUserResult.setDescription("删除用户失败");
        }

        return deleteUserResult;
    }

    @Override
    public DataResultBase updateAcUser(AcUserUpdateOrder acUserUpdateOrder) {
        DataResultBase updateUserResult = new DataResultBase();

        AcUser acUser = new AcUser();
        try {
            BeanUtils.copyProperties(acUser, acUserUpdateOrder);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        acUser.setRowUpdateTime(new Date());

        int result = acUserMapper.updateByPrimaryKeySelective(acUser);
        if(result==1){
            updateUserResult.setSuccess(true);
            updateUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            updateUserResult.setDescription("用户更新成功");
        }else{
            updateUserResult.setSuccess(false);
            updateUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            updateUserResult.setDescription("用户更新失败");
        }
        return updateUserResult;
    }

    @Override
    public DataPageResultBase<AcUserInfo> getAcUserList(AcUserListQueryOrder acUserListQueryOrder) {
        DataPageResultBase getAcUserListResult = new DataPageResultBase();

        /**加入查询条件*/
        AcUserExample acUserExample = new AcUserExample();
        AcUserExample.Criteria criteria = acUserExample.createCriteria();
        if (StringUtils.isNotEmpty(acUserListQueryOrder.getUserName())) {
            criteria.andStatusEqualTo(acUserListQueryOrder.getUserName());
        }
        if (StringUtils.isNotEmpty(acUserListQueryOrder.getStatus())) {
            criteria.andStatusEqualTo(acUserListQueryOrder.getStatus());
        }else{
            criteria.andStatusNotEqualTo("deleted");
        }
        if (StringUtils.isNotEmpty(acUserListQueryOrder.getStartTime())) {
            criteria.andRowAddTimeGreaterThan(new Date(acUserListQueryOrder.getStartTime()));
        }
        if (StringUtils.isNotEmpty(acUserListQueryOrder.getEndTime())) {
            criteria.andRowAddTimeLessThan(new Date(acUserListQueryOrder.getEndTime()));
        }
        acUserExample.setOrderByClause("row_add_time desc");

        /**加入分页参数*/
        RowBounds rowBounds = null;
        Integer pageNumber = acUserListQueryOrder.getPageNumber();
        Integer pageSize = acUserListQueryOrder.getPageSize();
        Integer startIndex = null;
        if (pageNumber != null && pageSize != null) {
            startIndex = pageNumber > 0 ? (pageNumber - 1) * pageSize : 0;
            rowBounds = new RowBounds(startIndex, pageSize);
        }

        /**查出满足条件的数据条数*/
        long totalCount = acUserMapper.countByExample(acUserExample);
        /**查出满足条件的数据*/
        if(totalCount>0){
            List<AcUser> acUsers = acUserMapper.selectByExampleWithRowbounds(acUserExample,new RowBounds(startIndex,pageSize));
            List<AcUserInfo> acUserInfolist = new ArrayList<AcUserInfo>();
            if(acUsers!=null&&acUsers.size()>0){
                for(AcUser acuser:acUsers){
                    AcUserInfo acUserInfo = new AcUserInfo();
                    try {
                        BeanUtils.copyProperties(acUserInfo,acuser);
                    } catch (Exception e) {
                        e.printStackTrace();
                        getAcUserListResult.setSuccess(false);
                        getAcUserListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
                        getAcUserListResult.setDescription("查询用户列表失败，对象复制操作出错");
                        return getAcUserListResult;
                    }
                    acUserInfolist.add(acUserInfo);
                }
            }else if(totalCount==0){
                getAcUserListResult.setSuccess(false);
                getAcUserListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
                getAcUserListResult.setDescription("查询用户列表失败,返回数量为0");
                return getAcUserListResult;
            }
            getAcUserListResult.setDatas(acUserInfolist);
            getAcUserListResult.setSuccess(true);
            getAcUserListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            getAcUserListResult.setDescription("查询用户列表成功");
            getAcUserListResult.setPageNumber(pageNumber);
            getAcUserListResult.setPageSize(pageSize);
            getAcUserListResult.setTotalCount(totalCount);
            return getAcUserListResult;
        }

        getAcUserListResult.setSuccess(false);
        getAcUserListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
        getAcUserListResult.setDescription("查询用户列表失败");
        return getAcUserListResult;
    }

    @Override
    public DataResultBase<AcUserInfo> getAcUserByName(String username){
        DataResultBase<AcUserInfo> userInfoResult = new DataResultBase<AcUserInfo>();

        AcUserExample acUserExample = new AcUserExample();
        AcUserExample.Criteria criteria = acUserExample.createCriteria();
        criteria.andUserNameEqualTo(username);
        criteria.andStatusNotEqualTo("deleted");

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
            userInfoResult.setSuccess(true);
            return userInfoResult;
        } else {
            userInfoResult.setDescription("未知错误！");
            userInfoResult.setStatus(TiHuZhaiResultEnum.UN_KNOWN_EXCEPTION);
            return userInfoResult;
        }

    }
}
