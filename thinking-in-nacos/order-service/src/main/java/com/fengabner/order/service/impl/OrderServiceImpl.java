package com.fengabner.order.service.impl;

import com.fengabner.order.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author: zmx
 * @since: 2022/09/21 19:02
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Object> listOrder() {
        Map<String, Object> orderMap = new HashMap<>();
        orderMap.put("id", 1);
        orderMap.put("no", UUID.randomUUID().toString());
        orderMap.put("price", 100000000);
        return Collections.singletonList(orderMap);
    }
}
