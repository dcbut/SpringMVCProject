package com.dcxuexi.service.impl;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.User;
import com.dcxuexi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/31 21:57
 * @Version 1.0.0
 */

@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    //private UserDao userDao;

    @Override
    public String selectUserAll() {
        return "userDao.selectUserAll()";
    }

    @Override
    public String selectUserById(Integer id) {
        return "userDao.selectUserById(id)";
    }
}
