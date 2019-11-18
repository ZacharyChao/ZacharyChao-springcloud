package com.ZacharyChao.group.service;

import java.util.List;

import com.ZacharyChao.group.entity.Member;

public interface MemberService {
	List<Member> getMemberByMobile(String mobile);
}
