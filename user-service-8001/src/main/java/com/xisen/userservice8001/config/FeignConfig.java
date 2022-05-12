package com.xisen.userservice8001.config;

import feign.Feign;
import feign.querymap.BeanQueryMapEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Feign.Builder feignBuilder(){
        return Feign.builder().queryMapEncoder(new BeanQueryMapEncoder());
    }
}
