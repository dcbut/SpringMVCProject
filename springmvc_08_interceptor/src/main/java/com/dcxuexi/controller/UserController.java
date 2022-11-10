package com.dcxuexi.controller;

import com.dcxuexi.domain.User;
import org.springframework.web.bind.annotation.*;

/***
 * @Title UserController
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/10 21:38
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public String save(@RequestBody User user){
        System.out.println("user save ===>" + user);
        return "{'module':'user save'}";
    }

    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("user update ===>" + user);
        return "{'module':'user update'}";
    }

    @DeleteMapping("/{userId}")
    public String delete(@PathVariable Integer userId){
        System.out.println("user delete ===>" + userId);
        return "{'module':'user delete'}";
    }

    @GetMapping("/{userId}")
    public String findByUserId(@PathVariable Integer userId){
        System.out.println("user findByUserId ===>" + userId);
        return "{'module':'user findByUserId'}";
    }

    @GetMapping
    public String findAll(){
        System.out.println("user findByUserId ===> ......");
        return "{'module':'user findAll'}";
    }

}
