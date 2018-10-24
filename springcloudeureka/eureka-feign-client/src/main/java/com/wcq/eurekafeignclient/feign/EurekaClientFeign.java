package com.wcq.eurekafeignclient.feign;

import com.wcq.eurekafeignclient.config.FeignConfig;
import com.wcq.eurekafeignclient.fallback.HiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiFallback.class)
@Component
public interface EurekaClientFeign {

    @GetMapping("/hello/world")
    String sayHiFromFeignClientEureka(@RequestParam(value = "name") String name);
}
