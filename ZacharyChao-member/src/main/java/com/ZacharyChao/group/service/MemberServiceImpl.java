package com.ZacharyChao.group.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ZacharyChao.group.entity.Member;
import com.ZacharyChao.group.repository.MemberRepositoryJpa;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberRepositoryJpa memberRepositoryJpa;
	
	@Override
	public List<Member> getMemberByMobile(String mobile) {
		
		return memberRepositoryJpa.findByMobile(mobile);
	}
	
}
