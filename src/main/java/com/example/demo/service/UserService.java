package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableCaching
//@CacheConfig(cacheNames="userCache")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Cacheable(value ="userRedis")
    public List<User> query(int id, String name){
        return userMapper.query();
    }

    @Cacheable(value ="userRedis", key = "#p0")
    public User queryById(Integer id){
        return userMapper.queryById(id);
    }

    @CachePut(value ="userRedis", key = "#p0.id")
    public User updateById(User user){
        userMapper.updateById(user);
        return userMapper.queryById(user.getId());
    }

    @CacheEvict(value ="userRedis", key = "#p0", allEntries = true)
    public void deleteById(Integer id){
        userMapper.deleteById(id);
    }
}
