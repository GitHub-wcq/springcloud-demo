package com.forezp.helloworld.controller;

import com.forezp.helloworld.domain.User;
import com.forezp.helloworld.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户操作接口")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "保存用户信息，返回用户id", notes = "saveUser and return user id")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", dataType = "string"),
            @ApiImplicitParam(name = "password", dataType = "string")
    })
    @RequestMapping(value = "/saveUser", method = RequestMethod.GET)
    public String saveUser(User user) {
        Long id = userService.saveUser(user);
        return "user id : " + id;
    }

    @ApiOperation(value = "根据用户姓名查询用户信息")
    @GetMapping("/findByUsername/{username}")
    public String findByUsername(@PathVariable String username) {
        User user = userService.findByUsername(username);
        return user.toString();
    }

}
