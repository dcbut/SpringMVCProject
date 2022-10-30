package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * @Title SpringMvcConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 21:04
 * @Version 1.0.0
 */
//springmvc配置类，本质上还是一个spring配置类
//加载controller对应的bean
@Configuration
@ComponentScan("com.dcxuexi.controller")
public class SpringMvcConfig {
}
