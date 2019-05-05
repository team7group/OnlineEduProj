
package com.group7.edu.config;



import com.group7.edu.realm.UserRealm;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.Cookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.LinkedHashMap;

@Configuration//标记类对象的
//@SpringBootConfiguration
public class ShiroConfig {

    @Bean(value = "sessionManager")//bean标签。构建对象的
    public SessionManager sessionManager(){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setSessionIdUrlRewritingEnabled(false);//禁止url拼接sessionid
        sessionManager.setGlobalSessionTimeout(60*60*1000);//session默认过期时间为半小时cooke默认一年
        sessionManager.setSessionValidationSchedulerEnabled(true);//定时清理过期会话
        return sessionManager;
    }

    //        <!--1\配置shiro的核心 SecurityManager-->
    @Bean(value = "securityManager")//方法的参数相当于传入
    public SecurityManager securityManager(UserRealm userRealm, SessionManager sessionManager){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setSessionManager(sessionManager);
        securityManager.setRealm(userRealm);

        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");

        securityManager.setCacheManager(ehCacheManager);
//        cookie
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        Cookie cookie = cookieRememberMeManager.getCookie();
        cookie.setMaxAge(60*60*24*30);
        securityManager.setRememberMeManager(cookieRememberMeManager);
        return securityManager;

    }

    //    shiro注解容器
    @Bean(value = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }


    @Bean(value = "defaultAdvisorAutoProxyCreator")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator =new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);//aop cglib
        return defaultAdvisorAutoProxyCreator;
    }


    @Bean(value = "authorizationAttributeSourceAdvisor")
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }


    @Bean(value = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        shiroFilterFactoryBean.setLoginUrl("/login.html");
        shiroFilterFactoryBean.setSuccessUrl("/index.html");
        shiroFilterFactoryBean.setUnauthorizedUrl("unauthorized.html");

//        什么Map能保证存取顺序
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

//        map.put("/public/**","anon");//静态
//        map.put("/sys/student/login**","anon");//登录
//        map.put("/sys/captcha.jpg","anon");//验证码图片
//        map.put("/logout","logout");//退出登录
//        map.put("/**","user");//记住我之后可以访问
//        map.put("/**","authc");//登录之后

        map.put("/test/**", "anon");

        map.put("/test/login", "anon");

        map.put("/sys/captcha.jpg", "anon");
        map.put("/sys/student/register", "anon");
        map.put("/sys/verificationCode", "anon");
        map.put("/sys/student/resetPassword", "anon");
        map.put("/sys/student/login", "anon");

        map.put("/home/**", "anon");
        map.put("/sys/ad", "anon");
        map.put("/sys/sysContactWay/commit", "anon");
        map.put("/sys/focus", "anon");
        map.put("/sys/serviceType", "anon");
        map.put("/home/multi/list", "anon");
        map.put("/home/course/list", "anon");
        map.put("/home/new/list", "anon");
        map.put("/home/introduce/id", "anon");
        map.put("/home/introduce", "anon");
        map.put("/home/carouse/id", "anon");
        map.put("/home/about/id", "anon");
        map.put("/home/about", "anon");

        map.put("/cou/cou_tea", "anon");
        map.put("/course/**", "anon");

        map.put("/**","user");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        return shiroFilterFactoryBean;
    }

}

/*
import com.group7.edu.realm.UserRealm;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.Cookie;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.LinkedHashMap;


@SpringBootConfiguration
public class ShiroConfig {

    @Bean(name = "authorizer")
    public Realm getRealm(Realm userRealm) {
        return userRealm;
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition =
                new DefaultShiroFilterChainDefinition();

        // 任何人都可以访问
        chainDefinition.addPathDefinition("/**", "anon");

        return chainDefinition;
    }

    @Bean
    public CacheManager cacheManager() {
        EhCacheManager cacheManager = new EhCacheManager();
        cacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");
        return cacheManager;
    }
}*/













































