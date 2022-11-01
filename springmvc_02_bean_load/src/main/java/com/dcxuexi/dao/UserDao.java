package com.dcxuexi.dao;

import com.dcxuexi.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/31 21:56
 * @Version 1.0.0
 */

public interface UserDao {

    @Select("select user_id userId,email,user_name userName,branch_name branchName  from platform_user ")
    public List<User> selectUserAll();

    @Select("select user_id userId,email,user_name userName,branch_name branchName  from platform_user where user_id = #{id}")
    public User selectUserById(Integer id);
}
