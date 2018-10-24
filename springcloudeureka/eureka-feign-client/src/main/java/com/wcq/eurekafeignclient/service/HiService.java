package com.wcq.eurekafeignclient.service;

import com.wcq.eurekafeignclient.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromFeignClientEureka(name);
    }


}
