package com.foodhub.dto;
import java.io.Serializable;
import com.foodhub.domain.OrderStatus;
import com.foodhub.domain.Restaurant;
import com.foodhub.domain.User;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
public class OrderDto implements Serializable{
    private static final long serialVersionUID = 5723678264008792165L;
    private Integer id;
    private Date createdOn;
    private String number;
    private String address;
    private String instruction;
    private Restaurant restaurant;
    private User user;
    private OrderStatus orderStatus;
}
