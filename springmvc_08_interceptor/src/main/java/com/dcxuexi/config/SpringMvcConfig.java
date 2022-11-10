package com.dcxuexi.config;

import com.dcxuexi.controller.interceptor.ProjectInterceptor;
import com.dcxuexi.controller.interceptor.ProjectInterceptor02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/***
 * @Title SpringMvcConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/10 21:49
 * @Version 1.0.0
 */
@Configuration
//@ComponentScan({"com.dcxuexi.controller","com.dcxuexi.config"})
@ComponentScan("com.dcxuexi.controller")
@EnableWebMvc
//实现WebMvcConfigurer接口可以简化开发，但具有一定的侵入性
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Autowired
    private ProjectInterceptor02 projectInterceptor02;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //配置拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/user" ,"/user/*");
        registry.addInterceptor(projectInterceptor02).addPathPatterns("/user" ,"/user/*");
    }
}
