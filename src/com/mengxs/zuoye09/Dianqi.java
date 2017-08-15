package com.mengxs.zuoye09;

public class Dianqi implements Power{
			public String name;
	public Dianqi(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void dian() {
		// TODO Auto-generated method stub
		System.out.println("我"+name+"有电了");
	}

}
