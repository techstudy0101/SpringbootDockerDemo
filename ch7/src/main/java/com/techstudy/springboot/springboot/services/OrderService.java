package com.techstudy.springboot.springboot.services;


import com.techstudy.springboot.springboot.Order;
import com.techstudy.springboot.springboot.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void save(Order order){
        orderRepository.save(order);
    }

    public Optional<Order> getbyId(Long id){
        return orderRepository.findById(id);
    }

}