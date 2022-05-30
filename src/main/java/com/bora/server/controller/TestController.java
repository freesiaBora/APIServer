package com.bora.server.controller;

import com.bora.server.model.TestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Project test";
    }

    @GetMapping("/test/project")
    public Object projectInfo() {
        TestModel test = new TestModel();
        test.projectName = "project test";
        test.author = "hello-bryan";
        test.createDate = new Date();

        return test;
    }
}
