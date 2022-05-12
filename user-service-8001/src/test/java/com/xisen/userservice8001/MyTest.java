package com.xisen.userservice8001;

import com.xisen.userapi.User;
import com.xisen.userservice8001.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

@SpringBootTest
public class MyTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testAdd(){
        User user = new User();
        String id = UUID.randomUUID().toString();
        user.setId(id);
        user.setName("王五");
        user.setAge(20);
        userMapper.add(user);
        System.out.println();
    }

    @Test
    public void testUpdateById(){
        User user = new User();
        user.setId("fbbf5ddb-8a19-49e7-8f2f-9837c78d3f5e");
        user.setAge(24);
        userMapper.updateById(user);
        System.out.println();
    }


    @Test
    public void testGetById(){
        User user = userMapper.getById("0c501cef-1350-4f4b-9247-e09d419d0cd9");
        System.out.println(user);
    }

    @Test
    public void testGet(){
        User user = new User();
        user.setAge(18);
        List<User> users = userMapper.get(user);
        System.out.println(users);
    }
}
