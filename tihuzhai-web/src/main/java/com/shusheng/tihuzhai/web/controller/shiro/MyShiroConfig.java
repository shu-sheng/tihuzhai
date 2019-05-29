package com.shusheng.tihuzhai.web.controller.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author shusheng
 * @description ShiroConfig类，Apache Shiro 核心通过 Filter 来实现
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 11:34
 */
@Configuration
public class MyShiroConfig {
    private static Logger logger = LoggerFactory.getLogger(MyShiroConfig.class);

    /**
     * 读取数据库相关配置，配置到 shiroFilterFactoryBean 的访问规则中。
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilter(DefaultWebSecurityManager securityManager) {

        ShiroFilterFactoryBean myShiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 必须设置 SecurityManager
        myShiroFilterFactoryBean.setSecurityManager(securityManager);

        // 默认的登陆URL
        myShiroFilterFactoryBean.setLoginUrl("/");
        // 登录成功后要跳转的链接
        myShiroFilterFactoryBean.setSuccessUrl("/index");
        // 未经授权时要跳转的链接
        myShiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");

        //加载角色过滤器RolesFilter，在第一次被调用时才会创建，系统启动时不创建

        //调用loadShiroFilterChain方法
        loadShiroFilterChain(myShiroFilterFactoryBean);

        return myShiroFilterFactoryBean;
    }

    /**
     * 加载shiroFilter权限控制规则（可从数据库读取然后配置）
     * authc：该过滤器下的页面必须验证后才能访问，它是Shiro内置的一个拦截器
     *        org.apache.shiro.web.filter.authc.FormAuthenticationFilter
     * anon：它对应的过滤器里面是空的,什么都没做,可以理解为不拦截
     */
    private void loadShiroFilterChain(ShiroFilterFactoryBean shiroFilterFactoryBean){
        logger.info("[读取权限规则，加载到shiroFilter中]");

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        //静态资源
        filterChainDefinitionMap.put("/**/css/**", "anon");
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/**/js/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/**/images/**", "anon");
        filterChainDefinitionMap.put("/images/**", "anon");
        filterChainDefinitionMap.put("/download/**", "anon");
        filterChainDefinitionMap.put("/fileUpload/**", "anon");
        filterChainDefinitionMap.put("/html/**", "anon");
        filterChainDefinitionMap.put("/**/swf/**", "anon");
        filterChainDefinitionMap.put("/swf/**", "anon");
        filterChainDefinitionMap.put("/**/scripts/**", "anon");
        filterChainDefinitionMap.put("/scripts/**", "anon");
        filterChainDefinitionMap.put("/**/fonts/**", "anon");
        filterChainDefinitionMap.put("/**/**/fonts/**", "anon");
        filterChainDefinitionMap.put("/fonts/**", "anon");

        //放开swagger请求URL
        filterChainDefinitionMap.put("/swagger-ui.html", "anon");
        filterChainDefinitionMap.put("/swagger-resources/**", "anon");
        filterChainDefinitionMap.put("/v2/**", "anon");
        filterChainDefinitionMap.put("/webjars/**", "anon");
        filterChainDefinitionMap.put("／api-docs/**", "anon");
        //放开以anon开头的免验证URL
        filterChainDefinitionMap.put("/anon/**", "anon");
        //放开以swagger开头的免验证URL
        filterChainDefinitionMap.put("/swagger/**", "anon");
        //放开对首页的拦截
        filterChainDefinitionMap.put("/", "anon");

        filterChainDefinitionMap.put("/**", "anon");
//        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
    }

    /**
     *为认证管理类设置缓存管理对象，可对EhCache进行操作
     * */
    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        return myShiroRealm;
    }

    /**
     * 安全管理器
     * 加载Realm和cacheManager，可对EhCache进行操作
     * */
    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
        dwsm.setRealm(myShiroRealm());
        return dwsm;
    }

//    @Bean
//    public HashedCredentialsMatcher hashedCredentialsMatcher(){
//        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
//        hashedCredentialsMatcher.setHashAlgorithmName("md5");//散列算法:这里使用MD5算法;
//        hashedCredentialsMatcher.setHashIterations(2);//散列的次数，比如散列两次，相当于 md5(md5(""));
//        return hashedCredentialsMatcher;
//    }

}
