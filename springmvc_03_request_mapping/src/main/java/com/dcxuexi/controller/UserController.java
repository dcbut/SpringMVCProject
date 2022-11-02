package com.dcxuexi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/2 21:03
 * @Version 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/select")
    @ResponseBody
    public String select(){
        System.out.println("UserController select ,running .....");
        return "{\"username\":\"xiaochuang\"}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delele(){
        System.out.println("UserController delele ,running .....");
        return "user xiaochuang is deleted.";
    }
}
