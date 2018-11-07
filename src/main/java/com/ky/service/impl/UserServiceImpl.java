package com.ky.service.impl;

import com.ky.dao.UserDao;
import com.ky.entity.User;
import com.ky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM
 * @author: kangyang
 * @create: 2018-11-03 10:51
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectUser(Long userId) {
        return userDao.selectUser(userId);
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
