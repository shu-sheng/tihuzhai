package com.shusheng.tihuzhai.biz.admin.user;

import com.shusheng.tihuzhai.biz.admin.user.info.UserInfo;
import com.shusheng.tihuzhai.biz.admin.user.order.UserAddOrUpdateOrder;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/26 18:03
 */
public interface UserService {

    public Integer addUser(UserAddOrUpdateOrder order);

    public Integer updateUser(UserAddOrUpdateOrder order);

    public UserInfo getUserById(Long id);

}
