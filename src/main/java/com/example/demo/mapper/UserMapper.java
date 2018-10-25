package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> query();

    User queryById(@Param("id")Integer id);

    int updateById(User user);

    int deleteById(@Param("id")Integer id);
}
