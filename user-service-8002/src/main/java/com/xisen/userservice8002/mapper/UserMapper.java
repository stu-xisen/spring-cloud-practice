package com.xisen.userservice8002.mapper;

import com.xisen.userapi.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public User getById(String id);

    public List<User> get(User user);

    public void add(User user);

    public void updateById(User user);
}
