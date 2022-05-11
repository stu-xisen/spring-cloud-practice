package com.xisen.userservice8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xisen.userservice8001.*")
public class UserServiceApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication8001.class,args);
    }
}