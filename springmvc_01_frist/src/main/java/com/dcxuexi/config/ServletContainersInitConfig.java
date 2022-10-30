package com.dcxuexi.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/***
 * @Title ServletContainersInitConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 21:06
 * @Version 1.0.0
 */
// 定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //加载springmvc配置类，产生springmvc容器（本质还是spring容器）
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        context.register(SpringMvcConfig.class);
        return context;
    }

    //设置由springmvc控制器处理的请求映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //加载spring配置类
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
