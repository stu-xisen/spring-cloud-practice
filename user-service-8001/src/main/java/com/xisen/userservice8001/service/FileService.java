package com.xisen.userservice8001.service;

import com.xisen.fileapi.FileApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "file-service", configuration = com.xisen.userservice8001.config.FeignConfig.class)
public interface FileService extends FileApi {
}
