package com.jiajia.eshop.inventory.controller;

import com.jiajia.eshop.inventory.model.User;
import com.jiajia.eshop.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjiajia
 * @date 2020/8/20 20:08
 */

@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/getUserInfo")
    public User getUserInfo() {
        User user = userService.findUserInfo();
        return user;
    }

    @RequestMapping("/getCachedUserInfo")
    public User getCachedUserInfo() {
        User user = userService.getCachedUserInfo();
        return user;
    }
}
