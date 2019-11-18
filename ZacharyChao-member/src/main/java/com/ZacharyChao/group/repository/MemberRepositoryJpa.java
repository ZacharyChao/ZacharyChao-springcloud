package com.ZacharyChao.group.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ZacharyChao.group.entity.Member;

@Repository
public interface MemberRepositoryJpa extends JpaRepository<Member,Long>{

	List<Member> findByMobile(String mobile);
}
