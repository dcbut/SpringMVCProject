package com.dcxuexi.config;

import com.dcxuexi.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/***
 * @Title SpringMvcSupport
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/10 22:00
 * @Version 1.0.0
 */
//@Configuration
public class SpringMvcSupport  extends WebMvcConfigurationSupport {

    @Autowired
    private ProjectInterceptor projectInterceptor;


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //配置拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/user" ,"/user/*");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/user/**").addResourceLocations("/user/");

    }
}
