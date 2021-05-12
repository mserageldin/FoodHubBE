package com.foodhub.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="items_type")
public class ItemType {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String icon;

}
