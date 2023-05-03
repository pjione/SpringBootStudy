package com.example.spring3.member;

public interface MembersRepository {
    void save(Members member);
    Members findById(Long memberId);
}
