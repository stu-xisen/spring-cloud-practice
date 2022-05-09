package com.xisen.userservice.web;

import com.xisen.userapi.User;
import com.xisen.userapi.UserApi;
import com.xisen.userservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserApi {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getById(String id) {
        User user = userMapper.getById(id);
        return user;
    }

    @Override
    public List<User> get(User user) {
        return userMapper.get(user);
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void updateById(User user) {
        userMapper.updateById(user);
    }
}
