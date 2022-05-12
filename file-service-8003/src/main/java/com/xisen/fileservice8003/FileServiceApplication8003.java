package com.xisen.fileservice8003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan(value = "com.xisen.fileservice8003.*")
public class FileServiceApplication8003 {

    public static void main(String[] args) {
        SpringApplication.run(FileServiceApplication8003.class,args);
    }
}
