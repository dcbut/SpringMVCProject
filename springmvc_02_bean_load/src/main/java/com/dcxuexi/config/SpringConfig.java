package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/***
 * @Title SpringConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/31 21:30
 * @Version 1.0.0
 */
@Configuration
//@ComponentScan({"com.dcxuexi.dao","com.dcxuexi.service"}) //方法一
//@ComponentScan(value = "com.dcxuexi",
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ANNOTATION,
//                classes = Controller.class
//        )
//)  // 方法二
@ComponentScan(value = "com.dcxuexi")
public class SpringConfig {
}
