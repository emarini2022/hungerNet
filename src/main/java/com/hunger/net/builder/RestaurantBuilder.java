package com.hunger.net.builder;

import com.hunger.net.entity.Restaurant;
import com.hunger.net.enums.OrderStatusEnum;
import com.sun.istack.Builder;

public class RestaurantBuilder implements Builder<Restaurant> {

    private Restaurant restaurant = new Restaurant();

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


    @Override
    public Restaurant build() {
        return restaurant;
    }
}
