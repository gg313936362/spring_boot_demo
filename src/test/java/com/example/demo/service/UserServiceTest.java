package com.example.demo.service;

import com.example.demo.SpringBootDemoApplication;
import com.example.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void query() {
        System.out.println(userService.query(1, "aaa").size());
    }

    @Test
    public void queryById() {
        System.out.println(userService.queryById(1).getName());
    }

    @Test
    public void updateById(){
        User user = new User();
        user.setId(1);
        user.setName("萍cheng");
        userService.updateById(user);
    }

    @Test
    public void deleteById(){
        userService.deleteById(1);
    }
}