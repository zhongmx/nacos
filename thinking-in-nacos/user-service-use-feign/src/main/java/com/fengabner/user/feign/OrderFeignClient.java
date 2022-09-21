package com.fengabner.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: zmx
 * @since: 2022/09/21 19:18
 */
@FeignClient(name = "order-service")
public interface OrderFeignClient {

    @GetMapping("/v1/order")
    List<Object> listOrder();
}
