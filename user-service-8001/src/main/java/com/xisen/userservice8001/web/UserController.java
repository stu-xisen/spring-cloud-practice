package com.xisen.userservice8001.web;

import com.xisen.userapi.User;
import com.xisen.userapi.UserApi;
import com.xisen.userservice8001.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserApi {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserMapper userMapper;

    @Value("${server.port}")
    String port;

    @Override
    public User getById(String id) {
        User user = userMapper.getById(id);
        logger.info("getById port " + port);
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
