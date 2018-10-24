package com.wcq.eurekaribbonclient.controller;

import com.wcq.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "wcq") String name) {

//        RibbonLoadBalancerClient ribbonLoadBalancerClient = new RibbonLoadBalancerClient();

        return ribbonService.hi(name);
    }
}
