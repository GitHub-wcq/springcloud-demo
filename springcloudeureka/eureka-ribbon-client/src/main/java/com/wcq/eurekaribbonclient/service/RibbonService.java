package com.wcq.eurekaribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hello/world?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi , " + name + " ,system is exception";
    }

}
