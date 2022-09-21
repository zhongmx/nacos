package com.fengabner.user.service.impl;

import com.fengabner.user.entity.UserOrderInfo;
import com.fengabner.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: zmx
 * @since: 2022/09/21 19:22
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserOrderInfo userOrder(Integer userId) {
        UserOrderInfo userOrderInfo = new UserOrderInfo();
        userOrderInfo.setId(userId);
        userOrderInfo.setName("lisi");
        String url = "http://order-service/v1/order";
        userOrderInfo.setOrders(restTemplate.getForObject(url, List.class));
        return userOrderInfo;
    }
}
