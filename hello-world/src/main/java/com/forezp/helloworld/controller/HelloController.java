package com.forezp.helloworld.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api
@RestController
public class HelloController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @ApiOperation(value = "测试接口", notes = "test")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return name + ", " + age;
    }

    @ApiOperation(value = "hello 用户", notes = "hello name")
    @GetMapping("/hello")
    public String hello(String name, HttpServletRequest request) {
        String url = request.getRequestURL().toString();
        return "hello " + name + "  == " + url;
    }

}
