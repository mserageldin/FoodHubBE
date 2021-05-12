package com.foodhub.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodhub.domain.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{

}
