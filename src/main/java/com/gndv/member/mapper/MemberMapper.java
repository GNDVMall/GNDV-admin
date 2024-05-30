package com.gndv.member.mapper;

import com.gndv.member.domain.entity.Address;
import com.gndv.member.domain.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM Address WHERE id = #{id}")
    Optional<Address> findAddressById(Long id);

    @Select("SELECT * FROM Member WHERE member_id = #{member_id}")
    Optional<Member> findMemberById(Long member_id);

    @Select("SELECT * FROM Member WHERE email = #{email}")
    Optional<Member> findMemberByEmail(String email);

    @Select("SELECT * FROM Member ")
    List<Member> findAllMember();

}
