package com.example.spring3;

import com.example.spring3.repository.MemberRepository;
import com.example.spring3.repository.MemoryMemberRepository;
import com.example.spring3.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());

    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
