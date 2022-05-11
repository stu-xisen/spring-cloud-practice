package com.xisen.userconsumer.service;

import com.xisen.userapi.UserApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;


@FeignClient(value = "user-service")
@Component
public interface UserService extends UserApi {
}
