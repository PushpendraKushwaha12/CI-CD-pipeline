package com.order_service.service;

import com.order_service.entity.Order;
import com.order_service.repository.OrderRepository;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order createOrder(Order order){
        order.setStatus("created");
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    public List<Order> getOrder(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id){
        return orderRepository.getById(id);
    }

    public void deleteById(Long id){
         orderRepository.deleteById(id);
    }
}
