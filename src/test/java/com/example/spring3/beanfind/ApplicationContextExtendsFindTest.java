package com.example.spring3.beanfind;

import com.example.spring3.repository.MemberRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ApplicationContextExtendsFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

    @Configuration
    static class TestConfig{
        @Bean
        public MemberRepository
    }
}
