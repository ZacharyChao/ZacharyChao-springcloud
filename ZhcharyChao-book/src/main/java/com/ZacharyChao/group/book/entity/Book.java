package com.ZacharyChao.group.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;
	private String sn;
	private String name;
	private String author;
	private String publishing;
	private float bprice;
	private float sprice;
	private String btype;
	private Integer stock;
	public Long getBid() {
		return bid;
	}
	public void setBid(Long bid) {
		this.bid = bid;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	public float getSprice() {
		return sprice;
	}
	public void setSprice(float sprice) {
		this.sprice = sprice;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", sn=" + sn + ", name=" + name + ", author=" + author + ", publishing="
				+ publishing + ", bprice=" + bprice + ", sprice=" + sprice + ", btype=" + btype + ", stock=" + stock
				+ "]";
	}
	
}
