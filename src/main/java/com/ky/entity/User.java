package com.ky.entity;

/**
 * @program: SSM
 * @author: kangyang
 * @create: 2018-09-27 19:29
 **/
public class User {
    private Long userId;
    private String userName;
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}