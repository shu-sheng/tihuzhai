package com.shusheng.tihuzhai.biz.hiboss.admin.acuser;

import com.shusheng.tihuzhai.biz.hiboss.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.info.AcUserInfo;

import java.lang.reflect.InvocationTargetException;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/25 18:27
 */
public interface AcUserService {

    /**添加用户*/
    public DataResultBase addAcUser(AcUserInfo acUserInfo) throws InvocationTargetException, IllegalAccessException;

    /**删除用户*/
    public int deleteAcUser(Long id);

    /**更新用户信息*/
    public int updateAcUser(AcUserInfo acUserInfo);

    /**查询用户列表*/
    public DataResultBase<AcUserInfo> getAcUserList(AcUserInfo acUserInfo);

    /**根据用户名得到用户*/
    public DataResultBase<AcUserInfo> getAcUserByName(String username) throws InvocationTargetException, IllegalAccessException;

}
