package com.foodhub.domain;

import java.util.Date;

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
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private Date createdOn;
	
	private String number;
	
	private String address;
	
	@Column(name="instructions")
	private String instruction;
	
	@ManyToOne
	@JoinColumn(name="restaurantid")
	private Restaurant restaurant;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="orderstatusid")
	private OrderStatus orderStatus;

}
