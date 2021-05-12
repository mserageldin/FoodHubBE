package com.foodhub.repository;

import com.foodhub.domain.Order;
import org.springframework.data.repository.CrudRepository;
public interface OrderRepo extends CrudRepository<Order, Integer>{
}
