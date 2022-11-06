package com.hunger.net.builder;

import com.hunger.net.io.entity.RestaurantEntity;
import com.hunger.net.enums.OrderStatusEnum;
import com.sun.istack.Builder;

public class RestaurantBuilder implements Builder<RestaurantEntity> {

    private RestaurantEntity restaurant = new RestaurantEntity();

    public RestaurantBuilder withId (Integer id){
        restaurant.setId(id);
        return this;
    }

    public RestaurantBuilder withAddress (String address){
        restaurant.setAddress(address);
        return this;
    }

    public RestaurantBuilder withOrderStatus (OrderStatusEnum orderStatus){
        restaurant.setOrderStatus(orderStatus);
        return this;
    }

    public RestaurantBuilder withName (String name){
        restaurant.setName(name);
        return this;
    }


    @Override
    public RestaurantEntity build() {
        return restaurant;
    }
}
