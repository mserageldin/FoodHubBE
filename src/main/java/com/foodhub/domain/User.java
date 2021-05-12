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
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(unique = true)
	private String username;
	
	private String password;

	@Column(unique = true)
	private String email;
	
	@Column(name="fullname")
	private String fullName;
	
	@Column(name="profileimage")
	private String profileImage;
	
	private String address;
	
	@Column(name="instructions")
	private String instruction;

}
