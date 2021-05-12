package com.foodhub.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.foodhub.domain.ItemType;
import com.foodhub.domain.OrderItem;
import com.foodhub.domain.Restaurant;
import com.foodhub.domain.ItemCategory;
import com.foodhub.domain.Order;
import com.foodhub.domain.OrderStatus;
import com.foodhub.dto.*;
import com.foodhub.dto.ResponseAllRestaurant;
import com.foodhub.dto.ResponseRestaurant;

public class Utilities {
	
	public static Response getAllRestaurants(List<RestaurantAll> restaurants) {
		ResponseAllRestaurant response = new ResponseAllRestaurant();
		response.setResponseCode(ResponseCode.SUCCESS.getResponseCode());
		response.setResponseMessage(ResponseMessage.SUCCESS_GET.getMessage());
		response.setRestaurants(restaurants);
		return response;
	}
	public static Response getAllItemsCategory(List<ItemsCategoryAll> itemCateg) {
		ResponseAllItemCategory response = new ResponseAllItemCategory();
		response.setResponseCode(ResponseCode.SUCCESS.getResponseCode());
		response.setResponseMessage(ResponseMessage.SUCCESS_GET.getMessage());
		response.setItemCateg(itemCateg);
		return response;
	}
	public static Response getAllItemsType(List<ItemTypeAll> itemType) {
		ResponseAllItemType response = new ResponseAllItemType();
		response.setResponseCode(ResponseCode.SUCCESS.getResponseCode());
		response.setResponseMessage(ResponseMessage.SUCCESS_GET.getMessage());
		response.setItemtype(itemType);
		return response;
	}
	public static Response getAllOrders(List<OrderAll> order) {
		ResponseAllOrder response = new ResponseAllOrder();
		response.setResponseCode(ResponseCode.SUCCESS.getResponseCode());
		response.setResponseMessage(ResponseMessage.SUCCESS_GET.getMessage());
		response.setOrders(order);
		return response;
	}
	public static Response getAllOrderStatus(List<OrderStatusAll> order) {
		ResponseAllOrderStatus response = new ResponseAllOrderStatus();
		response.setResponseCode(ResponseCode.SUCCESS.getResponseCode());
		response.setResponseMessage(ResponseMessage.SUCCESS_GET.getMessage());
		response.setOrderStatus(order);
		return response;
	}
	public static Response getAllOrderItems(List<OrderItemAll> orderItem) {
		ResponseAllOrderItem response = new ResponseAllOrderItem();
		response.setResponseCode(ResponseCode.SUCCESS.getResponseCode());
		response.setResponseMessage(ResponseMessage.SUCCESS_GET.getMessage());
		response.setOrderItemAll(orderItem);
		return response;
	}
	public static List<RestaurantAll> allRestaurants(List<Restaurant> restaurants) {
		List<RestaurantAll> restaurantsDto = new ArrayList<RestaurantAll>();
		RestaurantAll restaurantDto;
		for(Restaurant restaurant : restaurants) {
			restaurantDto = new RestaurantAll();
			restaurantDto.setName(restaurant.getName());
			restaurantDto.setDescription(restaurant.getDescription());
			restaurantDto.setDeliveredTime(restaurant.getDeliveredTime());
			restaurantsDto.add(restaurantDto);
		}
		return restaurantsDto;
	}
	public static List<ItemsCategoryAll> allItemCateg(List<ItemCategory> itemCategories) {
		List<ItemsCategoryAll> itemCategsDto = new ArrayList<ItemsCategoryAll>();
		ItemsCategoryAll itemCatgDto;
		for(ItemCategory itmctg : itemCategories) {
			itemCatgDto = new ItemsCategoryAll();
			itemCatgDto.setId(itmctg.getId());
			itemCatgDto.setName(itmctg.getName());
			itemCategsDto.add(itemCatgDto);
		}
		return itemCategsDto;
	}
	public static List<ItemTypeAll> allItemType(List<ItemType> itemTypies) {
		List<ItemTypeAll> itemTypesDto = new ArrayList<ItemTypeAll>();
		ItemTypeAll itemTypeDto;
		for(ItemType itmctg : itemTypies) {
			itemTypeDto = new ItemTypeAll();
			itemTypeDto.setId(itmctg.getId());
			itemTypeDto.setName(itmctg.getName());
			itemTypeDto.setIcon(itmctg.getIcon());
			itemTypesDto.add(itemTypeDto);
		}
		return itemTypesDto;
	}
	public static List<OrderAll> allOrder(List<Order> orders) {
		List<OrderAll> ordersDto = new ArrayList<OrderAll>();
		OrderAll orderDto;
		for(Order itmctg : orders) {
			orderDto = new OrderAll();
			orderDto.setId(itmctg.getId());
			orderDto.setCreatedOn(itmctg.getCreatedOn());
			orderDto.setNumber(itmctg.getNumber());
			orderDto.setAddress(itmctg.getAddress());
			orderDto.setInstruction(itmctg.getInstruction());
			orderDto.setRestaurant(itmctg.getRestaurant());
			orderDto.setUser(itmctg.getUser());
			ordersDto.add(orderDto);
		}
		return ordersDto;
	}
	public static List<OrderStatusAll> allOrderStatus(List<OrderStatus> orderStaties) {
		List<OrderStatusAll> orderStatiesDto = new ArrayList<OrderStatusAll>();
		OrderStatusAll itemTypeDto;
		for(OrderStatus itmctg : orderStaties) {
			itemTypeDto = new OrderStatusAll();
			itemTypeDto.setId(itmctg.getId());
			itemTypeDto.setName(itmctg.getName());
			itemTypeDto.setIcon(itmctg.getIcon());
			orderStatiesDto.add(itemTypeDto);
		}
		return orderStatiesDto;
	}
	public static List<OrderItemAll> allOrderItem(List<OrderItem> orders) {
		List<OrderItemAll> ordersDto = new ArrayList<OrderItemAll>();
		OrderItemAll orderDto;
		for(OrderItem itmctg : orders) {
			orderDto = new OrderItemAll();
			orderDto.setId(itmctg.getId());
			orderDto.setPrice(itmctg.getPrice());
			orderDto.setQuantity(itmctg.getQuantity()); //order
			orderDto.setOrder(itmctg.getOrder());
			orderDto.setRestaurantItem(itmctg.getRestaurantItem());
			ordersDto.add(orderDto); //restaurantItem
		}
		return ordersDto;
	}
	public static Response error(String errorMessage) {
		Response response = new Response();
		response.setResponseCode(ResponseCode.ERROR.getResponseCode());
		response.setResponseMessage(errorMessage);
		return response;
	}
	
	public static Response getRestaurant(Optional<Restaurant> restaurant) {
		ResponseRestaurant response = new ResponseRestaurant();
		response.setResponseCode(ResponseCode.SUCCESS.getResponseCode());
		response.setResponseMessage(ResponseMessage.SUCCESS_GET.getMessage());
		response.setRestaurant(restaurant);
		return response;
	}

}
