package com.gndv.member.domain.entity;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Member {
    private long memberId;
    private String email;
    private String password;
    private String nickname;
    private String phone;
    private String introduction; //소개
    private LocalDateTime createdAt; // 생성 날짜 및 시간
    private double rating; // 평점(=별점) (소수점을 포함한 숫자)
    private int reportCount; // 신고 횟수 (정수)
    private String memberStatus; // 멤버 상태 (문자열)
    private LocalDateTime lastLogin; // 마지막 로그인 날짜 및 시간
    private String role; // 역할 (문자열)
    private boolean isAccountNonExpired; // 계정 만료 여부
    private boolean isAccountNonLocked; // 계정 잠금 여부
    private boolean isCredentialsNonExpired; // 자격 증명 만료 여부
    private boolean isEnabled; // 활성화 여부
}

