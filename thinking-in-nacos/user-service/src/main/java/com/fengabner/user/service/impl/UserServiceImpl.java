package com.fengabner.user.service.impl;

import com.fengabner.user.entity.UserOrderInfo;
import com.fengabner.user.feign.OrderFeignClient;
import com.fengabner.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zmx
 * @since: 2022/09/21 19:22
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @Override
    public UserOrderInfo userOrder(Integer userId) {
        UserOrderInfo userOrderInfo = new UserOrderInfo();
        userOrderInfo.setId(userId);
        userOrderInfo.setName("lisi");
        userOrderInfo.setOrders(orderFeignClient.listOrder());
        return userOrderInfo;
    }
}
