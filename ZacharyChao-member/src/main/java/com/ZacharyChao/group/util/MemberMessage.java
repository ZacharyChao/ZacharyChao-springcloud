package com.ZacharyChao.group.util;

public class MemberMessage {
	private String code;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MemberMessage(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	@Override
	public String toString() {
		return "MemberMessage [code=" + code + ", message=" + message + "]";
	}
	
}
