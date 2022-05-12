package com.xisen.fileservice8003.web;

import com.xisen.fileapi.File;
import com.xisen.fileapi.FileApi;
import com.xisen.fileservice8003.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController implements FileApi {

    @Autowired
    FileMapper fileMapper;

    @Override
    public File getById(String id) {
        return fileMapper.getById(id);
    }

    @Override
    public List<File> get(File file) {
        return fileMapper.get(file);
    }

    @Override
    public void add(File file) {
        fileMapper.add(file);
    }

    @Override
    public void updateById(File file) {
        fileMapper.updateById(file);
    }
}
