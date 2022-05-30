package com.bora.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class TestModel {
    public String projectName;
    public String author;
    public Date createDate;
}
