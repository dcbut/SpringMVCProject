package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/***
 * @Title SpringMvcConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/6 21:21
 * @Version 1.0.0
 */
@Configuration
@ComponentScan({"com.dcxuexi.controller","com.dcxuexi.config"}) // 方法一
//@ComponentScan("com.dcxuexi") // 方法二
@EnableWebMvc
public class SpringMvcConfig {
}
