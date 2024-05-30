package com.gndv.member.service;

import com.gndv.member.domain.entity.Address;
import com.gndv.member.domain.entity.Member;
import com.gndv.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    public Optional<Member> findMemberByEmail(String email){
        return memberMapper.findMemberByEmail(email);
    }
    public Optional<Member> findMemberById(Long member_id){
        return memberMapper.findMemberById(member_id);
    }
    public Optional<Address> findAddressById(Long id){
        return memberMapper.findAddressById(id);
    }
    public List<Member> findAllMember(){
        return memberMapper.findAllMember();
    }
}
