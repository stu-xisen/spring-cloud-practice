package com.xisen.userapi;

import com.xisen.userapi.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserApi {

    @GetMapping(value = "/user/{id}")
    public User getById(@PathVariable(value = "id") String id);

    @GetMapping(value = "/user")
    public User get(@RequestBody User user);

//    public void add(com.xisen.userapi.User user);
//
//    public void update(com.xisen.userapi.User user);


}
