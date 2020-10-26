package com.dxx.bokeadmin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsUtils;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //配置认证方式等
        super.configure(auth);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //http相关的配置，包括登入登出、异常处理、会话管理等
        //配置路径拦截，表明路径访问所对应的权限，角色，认证信息
        http.authorizeRequests()
            .antMatchers("/home").permitAll()
            .antMatchers("/hello").permitAll()
            .antMatchers("/register").permitAll()
            .antMatchers("/user_local/selectByPhone").permitAll()
            .anyRequest().authenticated()

            .and();
        http.csrf().disable() //取消csrf防护
             //开启跨域
            .cors();
        //配置登录相关操作
//        http.formLogin()
//            .permitAll()
//            .and();
        //配置退出相关操作
        http.logout()
                .permitAll()
                .and();
        //security提供的登录页面
//        http.httpBasic()
//                .disable();
    }
}
