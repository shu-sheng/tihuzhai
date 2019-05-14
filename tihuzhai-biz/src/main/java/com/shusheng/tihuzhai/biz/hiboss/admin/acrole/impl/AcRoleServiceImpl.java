package com.shusheng.tihuzhai.biz.hiboss.admin.acrole.impl;

import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.AcRoleService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.info.AcRoleInfo;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleUpdateOrder;
import com.shusheng.tihuzhai.dao.entity.auto.AcRole;
import com.shusheng.tihuzhai.dao.entity.auto.AcRoleExample;
import com.shusheng.tihuzhai.dao.mappers.auto.AcRoleMapper;
import com.shusheng.tihuzhai.enums.RoleStateEnum;
import com.shusheng.tihuzhai.enums.TiHuZhaiResultEnum;
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
public class AcRoleServiceImpl implements AcRoleService {

    @Autowired
    private AcRoleMapper acRoleMapper;

    @Override
    public DataResultBase addAcRole(AcRoleAddOrder acRoleAddOrder){
        DataResultBase addRoleResult = new DataResultBase();

        /**判断该角色是否己存在*/
        AcRoleExample acRoleExample = new AcRoleExample();
        AcRoleExample.Criteria criteria = acRoleExample.createCriteria();
        criteria.andRoleNameEqualTo(acRoleAddOrder.getRoleName());
        criteria.andRoleStatusNotEqualTo(RoleStateEnum.DELETED.code());
        List<AcRole> acRoleList = acRoleMapper.selectByExample(acRoleExample);
        if(acRoleList.size()>0){
            addRoleResult.setSuccess(false);
            addRoleResult.setStatus(TiHuZhaiResultEnum.ROLE_EXIST);
            addRoleResult.setDescription("该角色己存在");
            return addRoleResult;
        }

        AcRole acRole = new AcRole();
        try {
            BeanUtils.copyProperties(acRole, acRoleAddOrder);
        } catch (Exception e) {
            e.printStackTrace();
            addRoleResult.setSuccess(false);
            addRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addRoleResult.setDescription("新增角色失败");
            return addRoleResult;
        }
        acRole.setRowAddTime(new Date());
        acRole.setRowUpdateTime(new Date());
        acRole.setRoleName(RoleStateEnum.NORMAL.code());

        int result = acRoleMapper.insert(acRole);
        if(result==1){
            addRoleResult.setSuccess(true);
            addRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            addRoleResult.setDescription("新增角色成功");
        }else{
            addRoleResult.setSuccess(false);
            addRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addRoleResult.setDescription("新增角色失败");
        }
        return addRoleResult;
    }

    @Override
    public DataResultBase deleteAcRole(Long id) {
        DataResultBase deleteRoleResult = new DataResultBase();

        /**判断该角色是否存在*/
        AcRoleExample acRoleExample = new AcRoleExample();
        AcRoleExample.Criteria criteria = acRoleExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andRoleStatusNotEqualTo(RoleStateEnum.DELETED.code());
        List<AcRole> acRoleList = acRoleMapper.selectByExample(acRoleExample);
        if(acRoleList.size()<1){
            deleteRoleResult.setSuccess(false);
            deleteRoleResult.setStatus(TiHuZhaiResultEnum.ROLE_NOEXIST);
            deleteRoleResult.setDescription("该角色不存在");
            return deleteRoleResult;
        }

        AcRole acRole = new AcRole();
        acRole.setId(id);
        acRole.setRoleStatus("deleted");
        acRole.setRowUpdateTime(new Date());
        int result = acRoleMapper.updateByPrimaryKeySelective(acRole);
        if(result==1){
            deleteRoleResult.setSuccess(true);
            deleteRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            deleteRoleResult.setDescription("删除角色成功");
        }else{
            deleteRoleResult.setSuccess(false);
            deleteRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            deleteRoleResult.setDescription("删除角色失败");
        }

        return deleteRoleResult;
    }

    @Override
    public DataResultBase updateAcRole(AcRoleUpdateOrder acRoleUpdateOrder) {
        DataResultBase updateRoleResult = new DataResultBase();

        AcRole acRole = new AcRole();
        try {
            BeanUtils.copyProperties(acRole, acRoleUpdateOrder);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        acRole.setRowUpdateTime(new Date());

        int result = acRoleMapper.updateByPrimaryKeySelective(acRole);
        if(result==1){
            updateRoleResult.setSuccess(true);
            updateRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            updateRoleResult.setDescription("角色更新成功");
        }else{
            updateRoleResult.setSuccess(false);
            updateRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            updateRoleResult.setDescription("角色更新失败");
        }
        return updateRoleResult;
    }

    @Override
    public DataPageResultBase<AcRoleInfo> getAcRoleList(AcRoleListQueryOrder acRoleListQueryOrder) {
        DataPageResultBase getAcRoleListResult = new DataPageResultBase();

        /**加入查询条件*/
        AcRoleExample acRoleExample = new AcRoleExample();
        AcRoleExample.Criteria criteria = acRoleExample.createCriteria();
        if (StringUtils.isNotEmpty(acRoleListQueryOrder.getRoleType())) {
            criteria.andRoleTypeEqualTo(acRoleListQueryOrder.getRoleType());
        }
        if (StringUtils.isNotEmpty(acRoleListQueryOrder.getRoleStatus())) {
            criteria.andRoleStatusEqualTo(acRoleListQueryOrder.getRoleStatus());
        }else{
            criteria.andRoleStatusNotEqualTo("deleted");
        }
        if (StringUtils.isNotEmpty(acRoleListQueryOrder.getStartTime())) {
            criteria.andRowAddTimeGreaterThan(new Date(acRoleListQueryOrder.getStartTime()));
        }
        if (StringUtils.isNotEmpty(acRoleListQueryOrder.getEndTime())) {
            criteria.andRowAddTimeLessThan(new Date(acRoleListQueryOrder.getEndTime()));
        }
        acRoleExample.setOrderByClause("row_add_time desc");

        /**加入分页参数*/
        RowBounds rowBounds = null;
        Integer pageNumber = acRoleListQueryOrder.getPageNumber();
        Integer pageSize = acRoleListQueryOrder.getPageSize();
        Integer startIndex = null;
        if (pageNumber != null && pageSize != null) {
            startIndex = pageNumber > 0 ? (pageNumber - 1) * pageSize : 0;
            rowBounds = new RowBounds(startIndex, pageSize);
        }

        /**查出满足条件的数据条数*/
        long totalCount = acRoleMapper.countByExample(acRoleExample);
        /**查出满足条件的数据*/
        if(totalCount>0){
            List<AcRole> acRoles = acRoleMapper.selectByExampleWithRowbounds(acRoleExample,new RowBounds(startIndex,pageSize));
            List<AcRoleInfo> acRoleInfolist = new ArrayList<AcRoleInfo>();
            if(acRoles!=null&&acRoles.size()>0){
                for(AcRole acuser:acRoles){
                    AcRoleInfo acRoleInfo = new AcRoleInfo();
                    try {
                        BeanUtils.copyProperties(acRoleInfo,acuser);
                    } catch (Exception e) {
                        e.printStackTrace();
                        getAcRoleListResult.setSuccess(false);
                        getAcRoleListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
                        getAcRoleListResult.setDescription("查询角色列表失败，对象复制操作出错");
                        return getAcRoleListResult;
                    }
                    acRoleInfolist.add(acRoleInfo);
                }
            }else if(totalCount==0){
                getAcRoleListResult.setSuccess(false);
                getAcRoleListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
                getAcRoleListResult.setDescription("查询角色列表失败,返回数量为0");
                return getAcRoleListResult;
            }
            getAcRoleListResult.setDatas(acRoleInfolist);
            getAcRoleListResult.setSuccess(true);
            getAcRoleListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            getAcRoleListResult.setDescription("查询角色列表成功");
            getAcRoleListResult.setPageNumber(pageNumber);
            getAcRoleListResult.setPageSize(pageSize);
            getAcRoleListResult.setTotalCount(totalCount);
            return getAcRoleListResult;
        }

        getAcRoleListResult.setSuccess(false);
        getAcRoleListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
        getAcRoleListResult.setDescription("查询角色列表失败");
        return getAcRoleListResult;
    }

    @Override
    public DataResultBase<AcRoleInfo> getAcRoleByName(String rolename){
        DataResultBase<AcRoleInfo> userInfoResult = new DataResultBase<AcRoleInfo>();

        AcRoleExample acRoleExample = new AcRoleExample();
        AcRoleExample.Criteria criteria = acRoleExample.createCriteria();
        criteria.andRoleNameEqualTo(rolename);
        criteria.andRoleStatusNotEqualTo("deleted");

        List<AcRole> acRoleList = acRoleMapper.selectByExample(acRoleExample);
        if (acRoleList.size() <= 0) {
            userInfoResult.setDescription("没有该角色！");
            userInfoResult.setStatus(TiHuZhaiResultEnum.ROLE_NOEXIST);
            return userInfoResult;
        } else if (acRoleList.size() == 1) {
            AcRoleInfo acRoleInfo = new AcRoleInfo();
            try {
                BeanUtils.copyProperties(acRoleInfo, acRoleList.get(0));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            userInfoResult.setData(acRoleInfo);
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
