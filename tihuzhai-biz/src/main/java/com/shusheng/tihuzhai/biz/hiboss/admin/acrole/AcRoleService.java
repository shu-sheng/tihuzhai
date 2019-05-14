package com.shusheng.tihuzhai.biz.hiboss.admin.acrole;

import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.info.AcRoleInfo;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleUpdateOrder;

import java.lang.reflect.InvocationTargetException;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 18:27
 */
public interface AcRoleService {

    /**添加角色*/
    public DataResultBase addAcRole(AcRoleAddOrder acRoleAddOrder) throws InvocationTargetException, IllegalAccessException;

    /**删除角色*/
    public DataResultBase deleteAcRole(Long id);

    /**更新角色信息*/
    public DataResultBase updateAcRole(AcRoleUpdateOrder acRoleUpdateOrder);

    /**查询角色列表*/
    public DataPageResultBase<AcRoleInfo> getAcRoleList(AcRoleListQueryOrder acRoleListQueryOrder);

    /**根据角色名得到角色信息*/
    public DataResultBase<AcRoleInfo> getAcRoleByName(String rolename) throws InvocationTargetException, IllegalAccessException;

}
