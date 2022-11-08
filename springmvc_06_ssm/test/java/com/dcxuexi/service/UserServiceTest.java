package com.dcxuexi.service;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/***
 * @Title UserServiceTest
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/7 22:42
 * @Version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findByUserId(){
        User user = userService.findByUserId(10);
        System.out.println(user);
    }

    @Test
    public void  findAll(){
        List<User> userList = userService.findAll();
        userList.forEach(System.out::println);
    }
}
