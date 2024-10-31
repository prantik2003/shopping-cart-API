package com.fenix.cartbackend.dto;

import com.fenix.cartbackend.model.Cart;
import com.fenix.cartbackend.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}
