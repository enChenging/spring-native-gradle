package com.example.consumer.controller;

import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yancheng
 * @since 2023/2/21
 */
@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping("/test")
    public String test() {
        return service.test();
    }
}
