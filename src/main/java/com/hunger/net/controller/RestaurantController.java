package com.hunger.net.controller;

import com.hunger.net.dto.RestaurantDTO;
import com.hunger.net.model.request.RestaurantDetailResponse;
import com.hunger.net.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(path = "/{id}")

    public RestaurantDetailResponse getRestaurant (@PathVariable String id){
        RestaurantDetailResponse returnValue = new RestaurantDetailResponse();
        ModelMapper modelMapper = new ModelMapper();

        RestaurantDTO restaurantDTO = restaurantService.getRestaurantById(id);
        returnValue = modelMapper.map(restaurantDTO, RestaurantDetailResponse.class);

        return returnValue;
    }

}
