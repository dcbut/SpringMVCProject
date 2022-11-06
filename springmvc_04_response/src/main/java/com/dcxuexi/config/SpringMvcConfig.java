package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/***
 * @Title SpringMvcConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/6 10:32
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.dcxuexi.controller")
// 开启json数据类型转换
@EnableWebMvc
public class SpringMvcConfig {
}
