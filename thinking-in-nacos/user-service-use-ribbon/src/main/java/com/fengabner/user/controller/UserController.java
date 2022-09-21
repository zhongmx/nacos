package com.fengabner.user.controller;

import com.fengabner.user.entity.UserOrderInfo;
import com.fengabner.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zmx
 * @since: 2022/09/21 19:23
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/v1/user/order/{userId}")
    public UserOrderInfo userOrder(@PathVariable("userId") Integer id) {
        return userService.userOrder(id);
    }
}
