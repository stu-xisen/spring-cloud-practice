package com.xisen.userservice8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xisen.userservice8002.*")
public class UserServiceApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication8002.class,args);
    }
}
