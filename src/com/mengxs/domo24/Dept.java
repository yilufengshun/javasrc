package com.mengxs.domo24;

public class Dept {
	private int no;
	private String name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dept [no=" + no + ", name=" + name + "]";
	}
	public Dept(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	
}
