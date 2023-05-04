package com.example.spring3.Order;

import com.example.spring3.discount.DiscountPolicy;
import com.example.spring3.member.Members;
import com.example.spring3.member.MembersRepository;
import com.example.spring3.member.MemoryMembersRepository;

public class OrderServiceImpl implements OrderService {

    private final MembersRepository membersRepository = new MemoryMembersRepository();
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private DiscountPolicy discountPolicy;
    @Override
    public Order createOrder(Long memberId, String name, int itemPrice) {
        Members member = membersRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, name, itemPrice, discountPrice);
    }
}
