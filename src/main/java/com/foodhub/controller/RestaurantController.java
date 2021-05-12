package com.foodhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.foodhub.dto.Response;
import com.foodhub.service.RestaurantService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/restaurant")
public class RestaurantController { 
	
	@Autowired
	private RestaurantService restaurantService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Response getAllRestaurants() {
		return restaurantService.getAllRestaurants();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Response getRestaurant(@PathVariable("id") int id) {
		return restaurantService.getRestaurantById(id);
	}

}
