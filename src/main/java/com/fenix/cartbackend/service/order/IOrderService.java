package com.fenix.cartbackend.service.order;

import com.fenix.cartbackend.dto.OrderDto;
import com.fenix.cartbackend.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
