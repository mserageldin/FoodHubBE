package com.foodhub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodhub.domain.Restaurant;
import com.foodhub.dto.Response;
import com.foodhub.dto.RestaurantAll;
import com.foodhub.repository.RestaurantRepository;
import com.foodhub.util.Utilities;


@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public Response getAllRestaurants() {
		try {
			List<Restaurant> restaurants = (List<Restaurant>)
					restaurantRepository.findAll();
			List<RestaurantAll> restaurantsDto = Utilities.allRestaurants(restaurants);
			return Utilities.getAllRestaurants(restaurantsDto);
		}catch (Exception e) {
			String error = "ERROR::" + e;
			return Utilities.error(error);
		}
	}
	
	public Response getRestaurantById(int id) {
		try {
			Optional<Restaurant> restaurant = restaurantRepository.findById(id);
			return Utilities.getRestaurant(restaurant);
		}catch (Exception e) {
			String error = "ERROR::" + e;
			return Utilities.error(error);
		}
	}

}
