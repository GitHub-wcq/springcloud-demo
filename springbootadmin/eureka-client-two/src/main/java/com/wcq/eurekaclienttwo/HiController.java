package com.wcq.eurekaclienttwo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(String name){
        return "hi " + name + ", i am from port : " + port;
    }

    public String hiError(String name){
        return "hi " + name + ", sorry, system error!";
    }

}
