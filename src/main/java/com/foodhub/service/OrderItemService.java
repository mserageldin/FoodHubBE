package com.foodhub.service;
import com.foodhub.domain.OrderItem;
import com.foodhub.dto.*;
import com.foodhub.repository.ItemTypeRepo;
import com.foodhub.repository.ItemsCategoryRepo;
import com.foodhub.repository.OrderItemRepo;
import com.foodhub.repository.OrderRepo;
import com.foodhub.util.Utilities;
import com.foodhub.domain.ItemCategory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepo orderRepo;
    public Response getAllOrderItems() {
        try {
            List<OrderItem> itemTypies = (List<OrderItem>)
                    orderRepo.findAll();
            List<OrderItemAll> itemTypiesDto = Utilities.allOrderItem(itemTypies);
            return Utilities.getAllOrderItems(itemTypiesDto);
        }catch (Exception e) {
            String error = "ERROR::" + e;
            return Utilities.error(error);
        }
    }
}
