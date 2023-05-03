package com.example.spring3.service;

import com.example.spring3.member.Grade;
import com.example.spring3.member.Members;
import com.example.spring3.member.MembersService;
import com.example.spring3.member.MembersServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MembersService membersService = new MembersServiceImpl();
        Members member = new Members(1L, "memberA", Grade.VIP);
        membersService.join(member);

        Members findMember = membersService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
