package com.fengabner.user.service;

import com.fengabner.user.entity.UserOrderInfo;

/**
 * @author: zmx
 * @since: 2022/09/21 19:20
 */
public interface UserService {

    UserOrderInfo userOrder(Integer userId);
}
