package com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.impl;

import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.AcMenuService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.info.AcMenuInfo;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuUpdateOrder;
import com.shusheng.tihuzhai.dao.entity.auto.AcMenu;
import com.shusheng.tihuzhai.dao.entity.auto.AcMenuExample;
import com.shusheng.tihuzhai.dao.mappers.auto.AcMenuMapper;
import com.shusheng.tihuzhai.enums.MenuStateEnum;
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
public class AcMenuServiceImpl implements AcMenuService {

    @Autowired
    private AcMenuMapper acMenuMapper;

    @Override
    public DataResultBase addAcMenu(AcMenuAddOrder acMenuAddOrder){
        DataResultBase addRoleResult = new DataResultBase();

        /**判断该菜单是否己存在*/
        AcMenuExample acMenuExample = new AcMenuExample();
        AcMenuExample.Criteria criteria = acMenuExample.createCriteria();
        criteria.andMenuCodeEqualTo(acMenuAddOrder.getMenuCode());
        criteria.andStatusNotEqualTo(MenuStateEnum.DELETED.code());
        List<AcMenu> acMenuList = acMenuMapper.selectByExample(acMenuExample);
        if(acMenuList.size()>0){
            addRoleResult.setSuccess(false);
            addRoleResult.setStatus(TiHuZhaiResultEnum.MENU_EXIST);
            addRoleResult.setDescription("该菜单己存在");
            return addRoleResult;
        }

        AcMenu acMenu = new AcMenu();
        try {
            BeanUtils.copyProperties(acMenu, acMenuAddOrder);
        } catch (Exception e) {
            e.printStackTrace();
            addRoleResult.setSuccess(false);
            addRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addRoleResult.setDescription("新增菜单失败");
            return addRoleResult;
        }
        acMenu.setRowAddTime(new Date());
        acMenu.setRowUpdateTime(new Date());
        acMenu.setStatus(MenuStateEnum.NORMAL.code());

        int result = acMenuMapper.insert(acMenu);
        if(result==1){
            addRoleResult.setSuccess(true);
            addRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            addRoleResult.setDescription("新增菜单成功");
        }else{
            addRoleResult.setSuccess(false);
            addRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addRoleResult.setDescription("新增菜单失败");
        }
        return addRoleResult;
    }

    @Override
    public DataResultBase deleteAcMenu(Long id) {
        DataResultBase deleteRoleResult = new DataResultBase();

        /**判断该菜单是否存在*/
        AcMenuExample acMenuExample = new AcMenuExample();
        AcMenuExample.Criteria criteria = acMenuExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStatusNotEqualTo(MenuStateEnum.DELETED.code());
        List<AcMenu> acMenuList = acMenuMapper.selectByExample(acMenuExample);
        if(acMenuList.size()<1){
            deleteRoleResult.setSuccess(false);
            deleteRoleResult.setStatus(TiHuZhaiResultEnum.MENU_NOEXIST);
            deleteRoleResult.setDescription("该菜单不存在");
            return deleteRoleResult;
        }
        /**判断该菜单是否为父菜单*/
        AcMenuExample acMenuExample1 = new AcMenuExample();
        AcMenuExample.Criteria criteria1 = acMenuExample.createCriteria();
        criteria.andParentIdEqualTo(id);
        criteria.andStatusNotEqualTo(MenuStateEnum.DELETED.code());
        List<AcMenu> acMenuList1 = acMenuMapper.selectByExample(acMenuExample);
        if(acMenuList.size()>0){
            deleteRoleResult.setSuccess(false);
            deleteRoleResult.setStatus(TiHuZhaiResultEnum.MENU_NOEXIST);
            deleteRoleResult.setDescription("该菜单还有子菜单，不可删除");
            return deleteRoleResult;
        }

        AcMenu acMenu = new AcMenu();
        acMenu.setId(id);
        acMenu.setStatus("deleted");
        acMenu.setRowUpdateTime(new Date());
        int result = acMenuMapper.updateByPrimaryKeySelective(acMenu);
        if(result==1){
            deleteRoleResult.setSuccess(true);
            deleteRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            deleteRoleResult.setDescription("删除菜单成功");
        }else{
            deleteRoleResult.setSuccess(false);
            deleteRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            deleteRoleResult.setDescription("删除菜单失败");
        }

        return deleteRoleResult;
    }

    @Override
    public DataResultBase updateAcMenu(AcMenuUpdateOrder acMenuUpdateOrder) {
        DataResultBase updateRoleResult = new DataResultBase();

        AcMenu acMenu = new AcMenu();
        try {
            BeanUtils.copyProperties(acMenu, acMenuUpdateOrder);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        acMenu.setRowUpdateTime(new Date());

        int result = acMenuMapper.updateByPrimaryKeySelective(acMenu);
        if(result==1){
            updateRoleResult.setSuccess(true);
            updateRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            updateRoleResult.setDescription("菜单更新成功");
        }else{
            updateRoleResult.setSuccess(false);
            updateRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            updateRoleResult.setDescription("菜单更新失败");
        }
        return updateRoleResult;
    }

    @Override
    public DataPageResultBase<AcMenuInfo> getAcMenuList(AcMenuListQueryOrder acMenuListQueryOrder) {
        DataPageResultBase getAcMenuListResult = new DataPageResultBase();

        /**加入查询条件*/
        AcMenuExample acMenuExample = new AcMenuExample();
        AcMenuExample.Criteria criteria = acMenuExample.createCriteria();
        if (StringUtils.isNotEmpty(acMenuListQueryOrder.getMenuName())) {
            criteria.andMenuNameEqualTo(acMenuListQueryOrder.getMenuName());
        }
        if (StringUtils.isNotEmpty(acMenuListQueryOrder.getStatus())) {
            criteria.andStatusEqualTo(acMenuListQueryOrder.getStatus());
        }else{
            criteria.andStatusNotEqualTo("deleted");
        }
        acMenuExample.setOrderByClause("row_add_time desc");

        /**加入分页参数*/
        RowBounds rowBounds = null;
        Integer pageNumber = acMenuListQueryOrder.getPageNumber();
        Integer pageSize = acMenuListQueryOrder.getPageSize();
        Integer startIndex = null;
        if (pageNumber != null && pageSize != null) {
            startIndex = pageNumber > 0 ? (pageNumber - 1) * pageSize : 0;
            rowBounds = new RowBounds(startIndex, pageSize);
        }

        /**查出满足条件的数据条数*/
        long totalCount = acMenuMapper.countByExample(acMenuExample);
        /**查出满足条件的数据*/
        if(totalCount>0){
            List<AcMenu> acMenus = acMenuMapper.selectByExampleWithRowbounds(acMenuExample,new RowBounds(startIndex,pageSize));
            List<AcMenuInfo> acMenuInfolist = new ArrayList<AcMenuInfo>();
            if(acMenus!=null&&acMenus.size()>0){
                for(AcMenu acuser:acMenus){
                    AcMenuInfo acMenuInfo = new AcMenuInfo();
                    try {
                        BeanUtils.copyProperties(acMenuInfo,acuser);
                    } catch (Exception e) {
                        e.printStackTrace();
                        getAcMenuListResult.setSuccess(false);
                        getAcMenuListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
                        getAcMenuListResult.setDescription("查询菜单列表失败，对象复制操作出错");
                        return getAcMenuListResult;
                    }
                    acMenuInfolist.add(acMenuInfo);
                }
            }else if(totalCount==0){
                getAcMenuListResult.setSuccess(false);
                getAcMenuListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
                getAcMenuListResult.setDescription("查询菜单列表失败,返回数量为0");
                return getAcMenuListResult;
            }
            getAcMenuListResult.setDatas(acMenuInfolist);
            getAcMenuListResult.setSuccess(true);
            getAcMenuListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_SUCCESS);
            getAcMenuListResult.setDescription("查询菜单列表成功");
            getAcMenuListResult.setPageNumber(pageNumber);
            getAcMenuListResult.setPageSize(pageSize);
            getAcMenuListResult.setTotalCount(totalCount);
            return getAcMenuListResult;
        }

        getAcMenuListResult.setSuccess(false);
        getAcMenuListResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
        getAcMenuListResult.setDescription("查询菜单列表失败");
        return getAcMenuListResult;
    }

    @Override
    public DataResultBase<AcMenuInfo> getAcMenuByCode(String menucode){
        DataResultBase<AcMenuInfo> userInfoResult = new DataResultBase<AcMenuInfo>();

        AcMenuExample acMenuExample = new AcMenuExample();
        AcMenuExample.Criteria criteria = acMenuExample.createCriteria();
        criteria.andMenuCodeEqualTo(menucode);
        criteria.andStatusNotEqualTo("deleted");

        List<AcMenu> acMenuList = acMenuMapper.selectByExample(acMenuExample);
        if (acMenuList.size() <= 0) {
            userInfoResult.setDescription("没有该菜单！");
            userInfoResult.setStatus(TiHuZhaiResultEnum.MENU_NOEXIST);
            return userInfoResult;
        } else if (acMenuList.size() == 1) {
            AcMenuInfo acMenuInfo = new AcMenuInfo();
            try {
                BeanUtils.copyProperties(acMenuInfo, acMenuList.get(0));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            userInfoResult.setData(acMenuInfo);
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
