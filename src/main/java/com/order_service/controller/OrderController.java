package com.order_service.controller;

import com.order_service.entity.Order;
import com.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("/getAllOrder")
    public List<Order> getOrder(){
        return orderService.getOrder();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        orderService.deleteById(id);
    }
}
