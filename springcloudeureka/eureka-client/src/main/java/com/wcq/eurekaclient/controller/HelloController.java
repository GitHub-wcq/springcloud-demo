package com.wcq.eurekaclient.controller;

import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/world")
    public String world(@RequestParam(value = "name") String name) {
        return "hello world " + name + " from " + port;
    }

}
