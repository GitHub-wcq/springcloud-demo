package com.wcq.eurekafeignclient.fallback;

import com.wcq.eurekafeignclient.feign.EurekaClientFeign;
import org.springframework.stereotype.Component;

@Component
public class HiFallback implements EurekaClientFeign {

    @Override
    public String sayHiFromFeignClientEureka(String name) {
        return "系统调用失败/h/w";
    }
}
