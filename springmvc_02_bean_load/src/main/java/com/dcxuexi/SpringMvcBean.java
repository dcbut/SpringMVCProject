package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

/***
 * @Title SpringMvcBean
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/31 22:45
 * @Version 1.0.0
 */
public class SpringMvcBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context.getBean(UserController.class));
    }
}
