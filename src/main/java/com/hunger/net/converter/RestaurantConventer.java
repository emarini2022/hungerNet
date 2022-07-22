package com.hunger.net.converter;

import com.hunger.net.builder.RestaurantBuilder;
import com.hunger.net.builder.RestaurantDTOBuilder;
import com.hunger.net.dto.RestaurantDTO;
import com.hunger.net.entity.Restaurant;

public class RestaurantConventer implements AbstractConverter <Restaurant , RestaurantDTO> {
    @Override
    public Restaurant toEntity (RestaurantDTO restaurantDTO) {
        return new RestaurantBuilder()
                .withId(restaurantDTO.getId())
                .withAddress(restaurantDTO.getAddress())
                .withName(restaurantDTO.getName())
                .withOrderStatus(restaurantDTO.getOrderStatus())
                .build();
    }

    @Override
    public RestaurantDTO toDto (Restaurant restaurant) {
        return new RestaurantDTOBuilder()
                .withId(restaurant.getId())
                .withAddress(restaurant.getAddress())
                .withOrderStatus(restaurant.getOrderStatus())
                .withName(restaurant.getName())
                .build();
    }
}
