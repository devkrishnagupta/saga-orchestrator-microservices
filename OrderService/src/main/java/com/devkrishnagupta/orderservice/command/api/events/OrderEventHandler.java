package com.devkrishnagupta.orderservice.command.api.events;

import com.devkrishnagupta.orderservice.command.api.data.Order;
import com.devkrishnagupta.orderservice.command.api.data.OrderRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderEventHandler {

    private OrderRepository orderRepository;

    public OrderEventHandler(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }

    @EventHandler
    public void on(OrderCreatedEvent event){
        Order order = new Order();
        BeanUtils.copyProperties(event, order);
        orderRepository.save(order);
    }
}
