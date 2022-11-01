package com.dcxuexi.config;

import com.dcxuexi.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/***
 * @Title ServletContainersInitConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/31 22:17
 * @Version 1.0.0
 */
//web配置类简化开发，仅设置配置类类名即可
//public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{SpringConfig.class};
//    }
//
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[]{SpringMvcConfig.class};
//    }
//
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//}

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class);
        return context;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        //AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //context.register(SpringConfig.class);
        return null;// context;
    }
}
