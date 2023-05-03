package com.example.spring3.Order;

public interface OrderService {
    Order createOrder(Long memberId, String name, int itemPrice);
}
