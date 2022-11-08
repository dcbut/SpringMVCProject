package com.dcxuexi.domain;

import java.io.Serializable;

/***
 * @Title User
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/7 21:27
 * @Version 1.0.0
 */
public class User  implements Serializable {
    private Integer userId;
    private String userName;
    private String email;
    private String branchName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranceName() {
        return branchName;
    }

    public void setBranceName(String branceName) {
        this.branchName = branceName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
