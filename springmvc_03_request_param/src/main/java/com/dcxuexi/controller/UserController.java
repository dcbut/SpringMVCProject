package com.dcxuexi.controller;

import com.dcxuexi.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/2 22:36
 * @Version 1.0.0
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/select")
    @ResponseBody
    public String select(@RequestParam("name") String username, Integer age){
        System.out.println("普通参数传递 name ==> "+username);
        System.out.println("普通参数传递 age ==> "+age);
        return "{\"userName\":\""+username+"\",\"age\":"+age+"}";
    }

    @RequestMapping("/pojoUser")
    @ResponseBody
    public String userInfo(User user){
        System.out.println("pojo参数传递 user ==> " + user);
        return user.toString();
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] citys){
        String arrayStr = Arrays.toString(citys);
        System.out.println("Array参数传递 arrayStr ==> " +arrayStr);
        return arrayStr;
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> citys){
        System.out.println("List参数传递 citys ==> " +citys);
        return citys.toString();
    }

    @RequestMapping("/listjJsonParam")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> citys){
        System.out.println("Json List参数传递 citys ==> " + citys);
        return citys.toString();
    }


    @RequestMapping("/jsonParam")
    @ResponseBody
    public String userParamForJson(@RequestBody User user){
        System.out.println("Json参数传递 user ==> " + user);
        return user.toString();
    }

    @RequestMapping("/userListParam")
    @ResponseBody
    public String userListParamForJson(@RequestBody List<User> userList){
        System.out.println("Json参数传递 userList ==> " + userList);
        return userList.toString();
    }


}
