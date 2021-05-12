package com.foodhub.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodhub.domain.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {


	Optional<User> findByUsername(String username);

}
