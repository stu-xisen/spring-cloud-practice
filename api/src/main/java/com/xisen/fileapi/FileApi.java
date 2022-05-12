package com.xisen.fileapi;

import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface FileApi {

    @GetMapping(value = "/file/{id}")
    public File getById(@PathVariable(value = "id") String id);

    @GetMapping(value = "/file")
    public List<File> get(@SpringQueryMap File file);

    @PutMapping(value = "/file")
    public void add(@RequestBody File file);

    @PostMapping(value = "/file")
    public void updateById(@RequestBody File file);
}
