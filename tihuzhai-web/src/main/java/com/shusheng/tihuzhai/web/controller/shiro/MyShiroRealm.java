package com.shusheng.tihuzhai.web.controller.shiro;

import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.AcUserService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.info.AcUserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 11:31
 */
public class MyShiroRealm extends AuthorizingRealm {

    private static Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Autowired
    private AcUserService acUserService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken){

        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;

        String username = token.getUsername();
        logger.info("验证当前Subject时获取到token为：username={}", username);
        DataResultBase<AcUserInfo> acUserQueryResult = null;
        try {
            acUserQueryResult = acUserService.getAcUserByName(username);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        AcUserInfo acUserInfo = acUserQueryResult.getData();

        if (null != acUserInfo) {
            logger.info("当前用户信息为：userInfo={}", acUserInfo.toString());
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(acUserInfo.getUserName(), acUserInfo.getPassword(), token.getUsername());
            return authcInfo;
        } else {
            return null;
        }

    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //暂不实现权限，先实现登录
        return null;
    }

    /**
     * 将一些数据放到ShiroSession中,以便于其它地方使用
     */
    private void setSession(Object key, Object value) {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession();
            if (null != session) {
                session.setAttribute(key, value);
            }
        }
    }

}
