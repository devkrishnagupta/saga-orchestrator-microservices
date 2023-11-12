package com.devkrishnagupta.orderservice.command.api.command;


import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class CreateOrderCommand {
    @TargetAggregateIdentifier
    private String orderId;
    private String productId;
    private String userId;
    private Integer quantity;
    private String orderStatus;
    private String addressId;
}
