package com.foodhub.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="restaurant_items")
public class RestaurantItem {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Double price;
	
	private String portion;
	
	@Column(name="ingredients")
	private String ingredient;
	
	@ManyToOne
	@JoinColumn(name="restaurantid")
	private Restaurant restaurant;
	
	@ManyToOne
	@JoinColumn(name="itemscategoryid")
	private ItemCategory itemCategory;
	
	@ManyToOne
	@JoinColumn(name="itemstypeid")
	private ItemType itemType;

}
