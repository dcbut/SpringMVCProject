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
 * @Date 2022/11/7 21:28
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Boolean save(User user) {
        try {
            Boolean res = userDao.save(user);
            return res;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean update(User user) {
        try {
            Boolean res = userDao.update(user);
            return res;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean delete(Integer userId) {
        try {
            Boolean res = userDao.delete(userId);
            return res;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public User findByUserId(Integer userId) {
        return userDao.findByUserId(userId);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
