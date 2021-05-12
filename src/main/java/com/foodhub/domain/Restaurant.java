package com.foodhub.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="restaurants")
public class Restaurant {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String description;
	
	private String address;
	
	@Column(name="hasveg")
	private Boolean hasVeg;
	
	@Column(name="haschicken")
	private Boolean hasChicken;
	
	@Column(name="hasmeat")
	private Boolean hasMeat;
	
	@Column(name="hasfish")
	private Boolean hasfish;
	
	private String contact;
	
	@Column(name="deliveredtime")
	private String deliveredTime;
	
	@Column(name="coverimage")
	private String coverImage;
	
	@Column(name="profileimage")
	private String profileImage;

}
