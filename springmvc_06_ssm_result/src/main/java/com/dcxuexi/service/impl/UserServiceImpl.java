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
 * @Date 2022/11/8 21:12
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Boolean save(User user) {
        return userDao.save(user);
    }

    public Boolean update(User user) {
        return userDao.update(user);
    }

    public Boolean delete(Integer userId) {
        return userDao.delete(userId);
    }

    public User findByUserId(Integer userId) {
        return userDao.findByUserId(userId);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
