package com.example.spring3.repository;

import com.example.spring3.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class JpaMemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;
    @Test
    void save() {
        Member member = new Member();
        member.setName("asdf");
        memberRepository.save(member);
        Optional<Member> member2 = memberRepository.findByName("asdf");
        Assertions.assertThat(member).isEqualTo(member2.get());
    }

    @Test
    void findById() {

    }

    @Test
    void findByName() {
    }

    @Test
    void findAll() {
        Member member = new Member();
        member.setName("spring");
        memberRepository.save(member);

        Member member2 = new Member();
        member2.setName("spring2");
        memberRepository.save(member2);

        List<Member> result = memberRepository.findAll();

        result.stream().forEach(o-> System.out.println("list :: " + o.getName()));

        assertThat(result.size()).isEqualTo(4);
    }
}