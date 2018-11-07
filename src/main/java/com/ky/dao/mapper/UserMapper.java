package com.ky.dao.mapper;

import com.ky.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: SSM
 * @author: kangyang
 * @create: 2018-11-03 16:41
 **/
public interface UserMapper {

    @Select("select * from user")
    List<User> selectAll();
}
