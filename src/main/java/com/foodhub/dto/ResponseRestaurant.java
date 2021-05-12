package com.foodhub.dto;

import com.foodhub.domain.Restaurant;
import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseRestaurant extends Response{
	
	private Optional<Restaurant> restaurant;

}
