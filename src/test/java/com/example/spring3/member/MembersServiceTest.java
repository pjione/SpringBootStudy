package com.example.spring3.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MembersServiceTest {

    MembersService membersService = new MembersServiceImpl();
    @Test
    void join(){
        //given
        Members member = new Members(1L, "memberA", Grade.VIP);
        //when
        membersService.join(member);
        //then
        assertThat(member).isEqualTo(membersService.findMember(2L));
    }
}
