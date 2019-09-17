package com.shusheng.tihuzhai.biz.hiboss.admin.acmenu;

import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.info.AcMenuInfo;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuUpdateOrder;

import java.lang.reflect.InvocationTargetException;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 18:27
 */
public interface AcMenuService {

    /**添加菜单*/
    public DataResultBase addAcMenu(AcMenuAddOrder acMenuAddOrder) throws InvocationTargetException, IllegalAccessException;

    /**删除菜单*/
    public DataResultBase deleteAcMenu(String id);

    /**更新菜单信息*/
    public DataResultBase updateAcMenu(AcMenuUpdateOrder acMenuUpdateOrder);

    /**查询菜单列表*/
    public DataPageResultBase<AcMenuInfo> getAcMenuList(AcMenuListQueryOrder acMenuListQueryOrder);

    /**根据菜单编码得到菜单信息*/
    public DataResultBase<AcMenuInfo> getAcMenuByCode(String menuname) throws InvocationTargetException, IllegalAccessException;

}
