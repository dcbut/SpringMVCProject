package com.dcxuexi.controller;

import com.dcxuexi.domain.City;
import com.dcxuexi.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/6 10:31
 * @Version 1.0.0
 */
@Controller
public class UserController {

    @RequestMapping("/toJumpPage")
    //@ResponseBody  //1.此处不能添加@ResponseBody,如果加了该注入，会直接将page.jsp当字符串返回前端
    //2.方法需要返回String
    public String toJumpPage(){
        System.out.println("跳转首页页面");
        return "user.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody  //此处该注解就不能省略，如果省略了,会把toText txt当前页面名称去查找，如果没有回报404错误
    public String toText(){
        System.out.println("返回纯文本数据");
        return "toText txt";
    }

    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        City city = new City();
        city.setCountry("中国");
        city.setProvice("上海");
        city.setArea("浦东新区");
        user.setUserName("小闯");
        user.setUserAge(20);
        user.setUserSex("男");
        user.setCity(city);
        return user;
    }

    @RequestMapping("/toJsonPOJOList")
    @ResponseBody
    public List<User> toJsonPOJOList(){
        System.out.println("返回json对象集合数据");
        List<User> userList  = new ArrayList<>();
        User user = new User();
        City city = new City();
        city.setCountry("中国");
        city.setProvice("上海");
        city.setArea("浦东新区");
        user.setUserName("小闯");
        user.setUserAge(20);
        user.setUserSex("男");
        user.setCity(city);

        User user2 = new User();
        City city2 = new City();
        city2.setCountry("中国");
        city2.setProvice("北京");
        city2.setArea("西城区");
        user2.setUserName("张三");
        user2.setUserAge(18);
        user2.setUserSex("男");
        user2.setCity(city2);

        userList.add(user);
        userList.add(user2);
        return userList;
    }



}
