package com.example.spring3.discount;

import com.example.spring3.member.Members;

public interface DiscountPolicy {
    /*
     @return 할인 대상 금액
     */
    int discount(Members member, int price);

}
