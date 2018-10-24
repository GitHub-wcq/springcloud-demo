package com.wcq.eurekafeignclient.controller;

import com.wcq.eurekafeignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String hi(String name) {
        return hiService.sayHi(name);
    }

}
