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
        Member member2 = new Member();
        member.setName("asdf");
        member2.setName("aaaa");

        System.out.println("before");
        memberRepository.save(member);
        memberRepository.save(member2);
        System.out.println("asdasd : " + member.getId());
        System.out.println("asdasd : " + member2.getId());
        System.out.println("end");
        Optional<Member> member3 = memberRepository.findById(3L);
        System.out.println("aaaaaaaaaaa" + member3.get().getId());
        Assertions.assertThat(member).isEqualTo(member3.get());
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

        result.stream().forEach(o-> System.out.println("list :: " + o.getId()));

        assertThat(result.size()).isEqualTo(3);
    }
}