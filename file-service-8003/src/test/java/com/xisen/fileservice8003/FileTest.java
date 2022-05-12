package com.xisen.fileservice8003;

import com.xisen.fileapi.File;
import com.xisen.fileservice8003.mapper.FileMapper;
import com.xisen.userapi.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
public class FileTest {

    @Autowired
    FileMapper fileMapper;

    @Test
    public void testAdd(){
        File file = new File();
        file.setId(UUID.randomUUID().toString());
        file.setName("测试文件005");
        file.setIssueDate(new Date());
        User user = new User();
        user.setId("004");
        file.setManager(user);
        fileMapper.add(file);
    }

    @Test
    public void testGetById(){
        File byId = fileMapper.getById("e681b310-a670-425c-bd02-02e4bfb52f0c");
        System.out.println(byId);
    }

    @Test
    public void testGet(){
        File file = new File();
        User user = new User();
        user.setAge(14);
        //file.setManager(user);
        List<File> files = fileMapper.get(file);
        System.out.println(files);
    }

    @Test
    public void testUpdateById(){
        File file = new File();
        file.setId("e681b310-a670-425c-bd02-02e4bfb52f0c");
        file.setIssueDate(new Date());
        User user = new User();
        user.setId("004");
        file.setManager(user);
        fileMapper.updateById(file);
    }


}
