package com.techstudy.springboot.springboot;

import com.techstudy.springboot.springboot.services.OrderService;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.metrics.LongCounter;

import io.opentelemetry.api.metrics.Meter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    Meter meter = GlobalOpenTelemetry.meterBuilder(this.getClass().getName()).build();


    LongCounter counterRequest = meter
            .counterBuilder("process_request")
            .setDescription("Processed jobs")
            .setUnit("1")
            .build();

    LongCounter counterResponse = meter
            .counterBuilder("process_response")
            .setDescription("Processed jobs")
            .setUnit("1")
            .build();
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/save")
    public ResponseEntity save(@RequestBody Order order) {
        orderService.save(order);

        return ResponseEntity.ok(order);
    }

    @GetMapping("orders/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) {
        counterRequest.add(1);
        meter.counterBuilder("hey").setUnit("number").build();
        Optional<Order> orderOptional = orderService.getbyId(id);
        ResponseEntity entity = orderOptional.map(it -> ResponseEntity.ok(it))
                .orElse(ResponseEntity.notFound().build());
        counterResponse.add(1);
        return entity;
    }

}
