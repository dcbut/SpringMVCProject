package com.dcxuexi.controller;

import com.dcxuexi.domain.User;
import com.dcxuexi.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/31 21:58
 * @Version 1.0.0
 */
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
