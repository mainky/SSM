package com.ky.service;

import com.ky.entity.User;

import java.util.List;

/**
 * @program: SSM
 * @author: kangyang
 * @create: 2018-11-03 10:49
 **/
public interface UserService {
    User selectUser(Long userId);

    List<User> selectAll();

}
