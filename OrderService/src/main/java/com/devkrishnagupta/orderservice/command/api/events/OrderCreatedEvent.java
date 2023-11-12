package com.devkrishnagupta.orderservice.command.api.events;

import lombok.Data;

@Data
public class OrderCreatedEvent {

    private String orderId;
    private String productId;
    private String userId;
    private Integer quantity;
    private String orderStatus;
    private String addressId;

}
