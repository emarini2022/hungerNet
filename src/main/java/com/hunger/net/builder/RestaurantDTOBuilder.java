package com.hunger.net.builder;

import com.hunger.net.dto.RestaurantDTO;
import com.hunger.net.enums.OrderStatusEnum;
import com.sun.istack.Builder;

public class RestaurantDTOBuilder implements Builder<RestaurantDTO> {

    private RestaurantDTO restaurantDTO = new RestaurantDTO();

    public RestaurantDTOBuilder withId (Integer id){
        restaurantDTO.setId(id);
        return this;
    }

    public RestaurantDTOBuilder withAddress (String address){
        restaurantDTO.setAddress(address);
        return this;
    }

    public RestaurantDTOBuilder withOrderStatus (OrderStatusEnum orderStatus){
        restaurantDTO.setOrderStatus(orderStatus);
        return this;
    }

    @Override
    public RestaurantDTO build() {
        return restaurantDTO;
    }
}
