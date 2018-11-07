package com.ky.dao;
/**
 * @author kangyang
 * @date 2018/9/27 19:32
 */

import com.ky.entity.User;

/**
 * @program: SSM
 * @author: kangyang
 * @create: 2018-09-27 19:32
 **/
public interface UserDao {
    Boolean insert(User user);
    Boolean update(User user);
    Boolean delete(String userId);
    User selectUser(Long id);
}
