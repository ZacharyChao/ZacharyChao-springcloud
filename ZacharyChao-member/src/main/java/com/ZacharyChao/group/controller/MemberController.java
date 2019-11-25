package com.ZacharyChao.group.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ZacharyChao.group.entity.Member;
import com.ZacharyChao.group.service.MemberService;
import com.ZacharyChao.group.util.MemberException;
import com.ZacharyChao.group.util.MemberMessage;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	@GetMapping("/api/v1/members/{mobile}")
	public MemberMessage checkMember(@PathVariable String mobile){
		List<Member> memberList = memberService.getMemberByMobile(mobile);
		if(memberList.size() > 0) {
			MemberMessage m = new MemberMessage("200", "success");
			return m;
		}else {
			return new MemberMessage("500", new MemberException().getLocalizedMessage());
		}
	}
	
	@GetMapping("/test")
	public String test() {
		return null;
	}
}
