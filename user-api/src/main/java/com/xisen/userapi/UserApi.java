package com.xisen.userapi;

import com.xisen.userapi.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UserApi {

    @GetMapping(value = "/user/{id}")
    public User getById(@PathVariable(value = "id") String id);

    @GetMapping(value = "/user")
    public List<User> get(User user);

    @PutMapping(value = "/user")
    public void add(@RequestBody User user);

    @PostMapping(value = "/user")
    public void updateById(@RequestBody User user);

}
