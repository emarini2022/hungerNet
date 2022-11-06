package com.hunger.net.io.repository;

import com.hunger.net.io.entity.RestaurantEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends CrudRepository<RestaurantEntity, Integer> {
    RestaurantEntity findByRestaurantID (String restaurantID);
}
