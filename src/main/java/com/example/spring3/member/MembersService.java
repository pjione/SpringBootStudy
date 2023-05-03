package com.example.spring3.member;

public interface MembersService {
    void join(Members member);
    Members findMember(Long memberId);
}
