package com.foodhub.service;
import com.foodhub.domain.Order;
import com.foodhub.dto.ItemTypeAll;
import com.foodhub.dto.OrderAll;
import com.foodhub.dto.Response;
import com.foodhub.repository.ItemTypeRepo;
import com.foodhub.repository.ItemsCategoryRepo;
import com.foodhub.repository.OrderRepo;
import com.foodhub.util.Utilities;
import com.foodhub.domain.ItemCategory;
import com.foodhub.dto.ItemsCategoryAll;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;
    public Response getAllOrders() {
        try {
            List<Order> itemTypies = (List<Order>)
                    orderRepo.findAll();
            List<OrderAll> itemTypiesDto = Utilities.allOrder(itemTypies);
            return Utilities.getAllOrders(itemTypiesDto);
        }catch (Exception e) {
            String error = "ERROR::" + e;
            return Utilities.error(error);
        }
    }
}
