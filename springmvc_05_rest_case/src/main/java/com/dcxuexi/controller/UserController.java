package com.dcxuexi.controller;

import com.dcxuexi.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/6 21:20
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> findAll(){
        List<User> userList = new ArrayList<>();
        User user1 = new User("刘德华", 61, "男", "香港，中国香港影视男演员、歌手、制片人、作词人");
        User user2 = new User("黎明", 56, "男", "香港，中国香港男歌手、演员、导演");
        User user3 = new User("郭富城", 57, "男", "香港，华语影视男演员、歌手、舞者");
        User user4 = new User("张学友", 61, "男", "香港，中国香港流行乐男歌手、演员、作曲人");
        User user5 = new User("成龙", 69, "男", "香港，中国影视男演员、导演、制作人、编剧、歌手");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        return userList;
    }

    @PostMapping
    public String save(@RequestBody User user){
        System.out.println("user save ==> "+ user);
        return "{'module':'user save success'}";
    }
}
