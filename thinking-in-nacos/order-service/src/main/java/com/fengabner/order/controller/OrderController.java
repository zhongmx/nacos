package com.fengabner.order.controller;

import com.fengabner.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zmx
 * @since: 2022/09/21 19:05
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/v1/order")
    public List<Object> listOrder(){
        return orderService.listOrder();
    }
}
