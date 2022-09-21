package com.fengabner.user.entity;

import java.util.List;

/**
 * @author: zmx
 * @since: 2022/09/21 19:21
 */
public class UserOrderInfo {

    private Integer id;
    private String name;

    private List<Object> orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getOrders() {
        return orders;
    }

    public void setOrders(List<Object> orders) {
        this.orders = orders;
    }
}
