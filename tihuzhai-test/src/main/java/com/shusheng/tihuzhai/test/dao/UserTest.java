package com.shusheng.tihuzhai.test.dao;

import com.shusheng.tihuzhai.dao.pgsql.entity.auto.AcUser;
import com.shusheng.tihuzhai.dao.pgsql.mappers.auto.AcUserMapper;
import com.shusheng.tihuzhai.test.base.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/26 19:49
 */
public class UserTest extends TestBase {

    @Autowired
    AcUserMapper acUserMapper;

    @Test
    public void testUserAdd(){

        AcUser acUser = new AcUser();
        acUser.setId("AAAAABBBBBCCCCCDDDDD");
        acUser.setUserName("174185499");
        acUser.setUserRealName("书生");
        acUser.setPassword("aaa111");
        acUser.setEmail("174185499@qq.com");
        acUser.setMobile("13111111111");
        acUser.setPasswordErrorTimes(2);
        acUser.setUserStatus("normal");
        acUser.setMemo("这是超级用户");
        acUser.setRowAddTime(new Date());
        acUser.setRowUpdateTime(new Date());

        acUserMapper.insert(acUser);
    }

}
