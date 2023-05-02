package com.example.spring3;

import com.example.spring3.aop.TimeTraceAop;
import com.example.spring3.repository.MemberRepository;
import com.example.spring3.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

   /* private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/
    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        //return new MemberService(memberRepository());
        return new MemberService(memberRepository);
    }
 /*   @Bean
    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        return new JpaMemberRepository(em);
    }*/

    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }
}
