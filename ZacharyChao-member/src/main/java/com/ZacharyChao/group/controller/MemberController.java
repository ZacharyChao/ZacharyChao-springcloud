package com.ZacharyChao.group.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ZacharyChao.group.entity.Member;
import com.ZacharyChao.group.service.MemberService;
import com.ZacharyChao.group.util.MemberException;
import com.ZacharyChao.group.util.MemberMessage;

@RestController
public class MemberController {
	@Resource
	private LoadBalancerClient loadBalancerClient;
	@Resource
	private RestTemplate restTemplate;
	@Autowired
	private MemberService memberService;

	@GetMapping("/api/v1/members/{mobile}")
	public MemberMessage checkMember(@PathVariable String mobile) {
		List<Member> memberList = memberService.getMemberByMobile(mobile);
		if (memberList.size() > 0) {
			MemberMessage m = new MemberMessage("200", "success");
			return m;
		} else {
			return new MemberMessage("500", new MemberException().getLocalizedMessage());
		}
	}

	@GetMapping("/test")
	public String test(String bid) {
		/*
		 * 1.直接使用RestTemplate远程调用 RestTemplate restTemplate = new RestTemplate(); String
		 * json =
		 * restTemplate.getForObject("http://localhost:9000/book//api/v1/books/1",
		 * String.class);
		 */

//		 2.使用loadBalancerClient获取ServiceInstance以获取服务的host、port
//		ServiceInstance serviceInstance = loadBalancerClient.choose("book");
//		String host = serviceInstance.getHost();
//		Integer port = serviceInstance.getPort();
//		String json = restTemplate.getForObject("http://" + host + ":" + port + "/api/v1/books/" + bid, String.class);
//		3.使用注解简化开发
		String json = restTemplate.getForObject("http://book/api/v1/books/"+ bid, String.class);
		return json;
	}
}
