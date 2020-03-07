package com.ZacharyChao.group.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@GetMapping("/msg")
	public String msg() {
		return "I'm client message";
	}
}
