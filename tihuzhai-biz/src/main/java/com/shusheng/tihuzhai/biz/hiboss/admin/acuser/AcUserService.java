package com.shusheng.tihuzhai.biz.hiboss.admin.acuser;

import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.info.AcUserInfo;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order.AcUserAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order.AcUserListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order.AcUserUpdateOrder;
import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;

import java.lang.reflect.InvocationTargetException;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/25 18:27
 */
public interface AcUserService {

    /**添加用户*/
    public DataResultBase addAcUser(AcUserAddOrder acUserAddOrder) throws InvocationTargetException, IllegalAccessException;

    /**删除用户*/
    public DataResultBase deleteAcUser(Long id);

    /**更新用户信息*/
    public DataResultBase updateAcUser(AcUserUpdateOrder acUserUpdateOrder);

    /**查询用户列表*/
    public DataPageResultBase<AcUserInfo> getAcUserList(AcUserListQueryOrder acUserListQueryOrder);

    /**根据用户名得到用户*/
    public DataResultBase<AcUserInfo> getAcUserByName(String username) throws InvocationTargetException, IllegalAccessException;

}
