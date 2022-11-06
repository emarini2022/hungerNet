package com.hunger.net.service.impl;

import com.hunger.net.dto.RestaurantDTO;
import com.hunger.net.exception.ResourceNotFoundException;
import com.hunger.net.io.entity.RestaurantEntity;
import com.hunger.net.io.repository.RestaurantRepository;
import com.hunger.net.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public RestaurantDTO createRestaurant(RestaurantDTO restaurant) {

        ModelMapper modelMapper = new ModelMapper();
        RestaurantEntity restaurantEntity=modelMapper.map(restaurant, RestaurantEntity.class);

        RestaurantEntity storedRestaurant = restaurantRepository.save(restaurantEntity);

        RestaurantDTO returnValue = modelMapper.map(storedRestaurant, RestaurantDTO.class);

        return returnValue;
    }

    @Override
    public RestaurantDTO getRestaurantById(String restaurantId) {

        RestaurantDTO returnValue = new RestaurantDTO();
        ModelMapper modelMapper = new ModelMapper();

        RestaurantEntity restaurantEntity = restaurantRepository.findByRestaurantID(restaurantId);



        returnValue = modelMapper.map(restaurantEntity, RestaurantDTO.class);

        return returnValue;
    }

    @Override
    public void deleteRestaurant(String restaurantID) {

        RestaurantEntity restaurantEntity = restaurantRepository.findByRestaurantID(restaurantID);

        restaurantRepository.delete(restaurantEntity);
    }

    @Override
    public List<RestaurantDTO> getRestaurants() {
        List<RestaurantDTO> returnValue = new ArrayList<>();

        Iterable<RestaurantEntity> iterableObject = restaurantRepository.findAll();

        for(RestaurantEntity restaurantEntity : iterableObject){
            RestaurantDTO restaurantDTO = new RestaurantDTO();
            returnValue.add(restaurantDTO);
        }
        return returnValue;
    }
}
