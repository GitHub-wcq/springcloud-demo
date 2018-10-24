package com.forezp.helloworld.controller;

import com.forezp.helloworld.config.ConfigBean;
import com.forezp.helloworld.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/lucy", method = RequestMethod.GET)
    public String lucy() {
        return configBean.toString();
    }

    @Autowired
    User user;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() {
        return user.toString();
    }

}
