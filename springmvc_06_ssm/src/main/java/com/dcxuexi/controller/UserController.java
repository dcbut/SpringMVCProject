package com.dcxuexi.controller;

import com.dcxuexi.domain.User;
import com.dcxuexi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/7 21:28
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Boolean save(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping
    public Boolean update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer userId){
        return userService.delete(userId);
    }

    @GetMapping("/{id}")
    public User findByUserId(@PathVariable("id") Integer userId){
        return userService.findByUserId(userId);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
