package com.ky.dao;

import com.ky.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: SSM
 * @author: kangyang
 * @create: 2018-09-27 19:32
 **/
@Repository
public interface UserDao {
    Boolean insert(User user);
    Boolean update(User user);
    Boolean delete(String userId);

    User selectUser(Long id);

    @Select("select * from user")
    List<User> selectAll();
}
