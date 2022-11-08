package com.dcxuexi.service;

import com.dcxuexi.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/***
 * @Title UserService
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/7 21:28
 * @Version 1.0.0
 */
@Transactional
public interface UserService {

    /**
     * @Author DongChuang
     * @Description //保存
     * @Date 2022/11/7 22:15
     * @Param 
     * @param user
     * @return 
     * @return java.lang.Boolean
     */
    public Boolean save(User user);

    /**
     * @Author DongChuang
     * @Description //根据userId修改
     * @Date 2022/11/7 22:15
     * @Param 
     * @param user
     * @return 
     * @return java.lang.Boolean
     */
    public Boolean update(User user);


    /**
     * @Author DongChuang
     * @Description //根据userId 删除
     * @Date 2022/11/7 22:16
     * @Param 
     * @param userId
     * @return 
     * @return java.lang.Boolean
     */
    public Boolean delete(Integer userId);

    /**
     * @Author DongChuang
     * @Description //根据userId 查询
     * @Date 2022/11/7 22:16
     * @Param 
     * @param userId
     * @return 
     * @return com.dcxuexi.domain.User
     */
    public User findByUserId(Integer userId);

    /*/**
     * @Author DongChuang
     * @Description //查询所有
     * @Date 2022/11/7 22:17
     * @Param 
     * @return 
     * @return java.util.List<com.dcxuexi.domain.User>
     */
    public List<User> findAll();
}
