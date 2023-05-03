package com.example.spring3.Order;

import com.example.spring3.member.Grade;
import com.example.spring3.member.Members;
import com.example.spring3.member.MembersService;
import com.example.spring3.member.MembersServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    MembersService membersService = new MembersServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Members member = new Members(1L, "memberA", Grade.VIP);
        membersService.join(member);
        Order order = orderService.createOrder(1L, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}