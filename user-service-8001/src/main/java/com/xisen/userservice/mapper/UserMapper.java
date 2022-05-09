package com.xisen.userservice.mapper;

import com.xisen.userapi.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface UserMapper {

    public User getById(String id);

    public List<User> get(User user);

    public void add(User user);

    public void updateById(User user);
}
