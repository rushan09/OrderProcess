package com.rush.order.controller;


import com.rush.order.kafka.OrderProducer;
import com.rush.order.model.Order;
import com.rush.order.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository repository;
    private final OrderProducer producer;

    public OrderController(OrderRepository repository, OrderProducer producer) {
        this.repository = repository;
        this.producer = producer;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        Order savedOrder = repository.save(order);
        producer.sendOrder(savedOrder);
        return savedOrder;
    }
}
