package com.gndv.member.controller;

import com.gndv.member.domain.entity.Member;
import com.gndv.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    // 회원 목록 조회
    @GetMapping("/list")
    public String listMembers(Model model) {
        List<Member> list = memberService.findAllMember();
        model.addAttribute("list", list);
        return "admin/member/list";
    }

//    // 회원 추가 폼
//    @GetMapping("/add")
//    public String showAddMemberForm(Model model) {
//        model.addAttribute("member", new Member());
//        return "add-member";
//    }

//    // 회원 추가 처리
//    @PostMapping("/add")
//    public String addMember(@ModelAttribute Member member) {
//        memberService.addMember(member);
//        return "redirect:/admin/members";
//    }
//
//    // 회원 수정 폼
//    @GetMapping("/edit/{id}")
//    public String showEditMemberForm(@PathVariable Long id, Model model) {
//        Member member = memberService.getMemberById(id);
//        if (member != null) {
//            model.addAttribute("member", member);
//            return "edit-member";
//        }
//        return "redirect:/admin/members";
//    }
//
//    // 회원 수정 처리
//    @PostMapping("/edit/{id}")
//    public String editMember(@PathVariable Long id, @ModelAttribute Member member) {
//        memberService.updateMember(id, member);
//        return "redirect:/admin/members";
//    }
//
//    // 회원 삭제
//    @GetMapping("/delete/{id}")
//    public String deleteMember(@PathVariable Long id) {
//        memberService.deleteMember(id);
//        return "redirect:/admin/members";
//    }
}
