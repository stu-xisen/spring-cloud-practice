package com.xisen.userservice8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(value = "com.xisen.userservice8001.*")
@EnableFeignClients
public class UserServiceApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication8001.class,args);
    }
}
