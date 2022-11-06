package com.dcxuexi.domain;

/***
 * @Title User
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/6 21:20
 * @Version 1.0.0
 */
public class User {
    private String userName;
    private Integer userAge;
    private String userSex;
    private String address;

    public User() {
    }

    public User(String userName, Integer userAge, String userSex, String address) {
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
