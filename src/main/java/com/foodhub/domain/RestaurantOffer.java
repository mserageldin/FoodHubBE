package com.foodhub.domain;

import java.util.Date;

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
@Table(name="restaurant_offers")
public class RestaurantOffer {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String code;
	
	private Date createOn;
	
	private Date expiredOn;
	
	@ManyToOne
	@JoinColumn(name="restaurantsid")
	private Restaurant restaurant;

}
