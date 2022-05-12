package com.xisen.fileapi;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xisen.userapi.User;

import java.util.Date;

public class File {

    private String id;
    private String name;
    @JsonFormat(timezone = "GMT+8")
    private Date issueDate;
    private User manager;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "File{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", issueDate=" + issueDate +
                ", manager=" + manager +
                '}';
    }
}
