package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/***
 * @Title SpringMvcConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/7 21:39
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.dcxuexi.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
