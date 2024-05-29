package com.gndv.member.domain.entity;

import lombok.Getter;

@Getter
public class Address{
    private long id;           // ID (정수형)
    private long memberId;     // 멤버 ID (정수형)
    private String name;       // 이름 (문자열)
    private String city;       // 도시 (문자열)
    private String street;     // 거리 (문자열)
    private String zipcode;    // 우편번호 (문자열)
}
