package com.techstudy.springboot;

import com.techstudy.springboot.models.Order;
import com.techstudy.springboot.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order/save")
    public ResponseEntity save(@RequestBody Order order) {
        orderService.save(order);
        return ResponseEntity.ok(order);
    }

    @GetMapping("orders/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) {
        Optional<Order> orderOptional = orderService.getbyId(id);

        return orderOptional.map(it -> ResponseEntity.ok(it))
                .orElse(ResponseEntity.notFound().build());
    }

}
