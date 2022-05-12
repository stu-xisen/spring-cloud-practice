package com.xisen.userservice8001.service;

import com.xisen.fileapi.FileApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "file-service")
public interface FileService extends FileApi {
}
