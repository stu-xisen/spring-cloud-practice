package com.xisen.userservice.web;

import com.xisen.userapi.User;
import com.xisen.userapi.UserApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Override
    public User getById(String id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public User get(User user) {
        return user;
    }
}
