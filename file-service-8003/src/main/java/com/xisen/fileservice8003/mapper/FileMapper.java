package com.xisen.fileservice8003.mapper;

import com.xisen.fileapi.File;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Mapper
public interface FileMapper {


    public File getById(String id);

    public List<File> get(File file);

    public void add(File file);

    public void updateById(File file);
}
