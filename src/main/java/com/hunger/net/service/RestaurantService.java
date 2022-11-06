package com.hunger.net.service;

import com.hunger.net.dto.RestaurantDTO;

import java.util.List;

public interface RestaurantService {

    RestaurantDTO createRestaurant (RestaurantDTO restaurant);
    RestaurantDTO getRestaurantById (String orderId);
    void deleteRestaurant (String restaurantID);
    List<RestaurantDTO> getRestaurants();
}
