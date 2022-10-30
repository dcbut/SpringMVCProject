package com.dcxuexi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 20:57
 * @Version 1.0.0
 */
// 定义controller
// 使用 @Controller 定义表现层控制器bean
@Controller
public class UserController {

    //设置映射路径为/select，即外部访问路径
    @GetMapping("/select")
    //设置当前操作返回结果为指定json数据（本质上是一个字符串信息）
    @ResponseBody
    public String select(){
        System.out.println("UserController select , runnning ....");
        return "{\"username\":\"xiaochuang\"}";
    }
}
