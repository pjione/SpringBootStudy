package com.example.spring3.discount;

import com.example.spring3.member.Grade;
import com.example.spring3.member.Members;

public class FixDiscountPolicy implements DiscountPolicy {

    private final int discountFixAmount = 1000;
    @Override
    public int discount(Members member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else{
            return 0;
        }
    }
}
