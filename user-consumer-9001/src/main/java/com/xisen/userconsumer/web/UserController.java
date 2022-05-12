package com.xisen.userconsumer.web;

import com.xisen.userapi.User;
import com.xisen.userconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{id}")
    public User getById(@PathVariable(value = "id") String id){
        return userService.getById(id);
    }

    @GetMapping(value = "/user")
    public List<User> get(User user){
        return userService.get(user);
    }


    @PutMapping(value = "/user")
    public void add(@RequestBody User user){
        userService.add(user);
    }

    @PostMapping(value = "/user")
    public void updateById(@RequestBody User user){
        userService.updateById(user);
    }
}
