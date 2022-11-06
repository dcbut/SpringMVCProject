package com.dcxuexi.controller;

import com.dcxuexi.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/6 17:16
 * @Version 1.0.0
 */
@RestController //@Controller + ReponseBody
@RequestMapping("/users")
public class UserController {

    //设置当前请求方法为GET，表示REST风格中的查询操作
    //@RequestMapping(value = "/users",method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping
    public List<User> findAll(){
        User user1 = new User("张三", 18, "男", "北京");
        User user2 = new User("李四", 24, "女", "上海");
        User user3 = new User("王二", 20, "男", "天津");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        System.out.println("select userList ==>" +userList);
        return userList;
    }

    //设置当前请求方法为GET，表示REST风格中的查询操作
    //@RequestMapping(value = "/users/{userName}",method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/{userName}")
    public User findByUserName(@PathVariable String userName){
        User user1 = new User("张三", 18, "男", "北京");
        User user2 = new User("李四", 24, "女", "上海");
        User user3 = new User("王二", 20, "男", "天津");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        for (User user:userList
             ) {
            if (user.getUserName().equals(userName)){
                System.out.println("select user ==>" +user);
                return user;
            }
        }
        return new User();
    }

    //设置当前请求方法为POST，表示REST风格中的添加操作
    //@RequestMapping(value = "/users",method = RequestMethod.POST)
    //@ResponseBody
    @PostMapping
    public String insertUser(@RequestBody User user){
        System.out.println("insert user ==>" + user);
        return "insert user success";
    }

    //设置当前请求方法为PUT，表示REST风格中的修改操作
    //@RequestMapping(value = "/users",method = RequestMethod.PUT)
    //@ResponseBody
    @PutMapping()
    public String updateUser(@RequestBody User user){
        System.out.println("update user ==>" + user);
        return "update user success";
    }

    //设置当前请求方法为DELETE，表示REST风格中的删除操作
    //@RequestMapping(value = "/users/{name}/{age}",method = RequestMethod.DELETE)
    //@ResponseBody
    @DeleteMapping("/{name}/{age}")
    public String deleteUser(@PathVariable("name") String userName,@PathVariable("age")Integer userAge){
        System.out.println("delete user ==>" +userName);
        System.out.println("delete user ==>" +userAge);
        return "delete user success";
    }

}
