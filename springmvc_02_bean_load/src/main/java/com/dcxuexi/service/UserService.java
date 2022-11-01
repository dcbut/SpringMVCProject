package com.dcxuexi.service;

import com.dcxuexi.domain.User;

import java.util.List;

/***
 * @Title UserService
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/31 21:57
 * @Version 1.0.0
 */
public interface UserService {

    public String selectUserAll();

    public String selectUserById(Integer id);

}
