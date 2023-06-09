package com.example.spring3.service;

import com.example.spring3.domain.Member;
import com.example.spring3.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("spring");
        //when
        Long saveId = memberService.join(member);
        //then
        assertThat(memberService.findOne(saveId).get().getName()).isEqualTo(member.getName());
    }
    @Test()
    void 중복_회원_예외(){
        //given
        Member member1 = new Member();
        member1.setName("spring3");
        Member member2 = new Member();
        member2.setName("spring");
        //when
        memberService.join(member1);
        //then
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원");
    }
    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}