package com.example.demo.dao;

import com.example.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
//
//@SpringApplicationConfiguration(classes = {})
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper map;

    @Test
    public void selectUserByPid() {
        User a = map.selectUserByPid(1);
        System.out.println(a.toString());
    }
}