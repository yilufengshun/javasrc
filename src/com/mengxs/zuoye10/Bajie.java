package com.mengxs.zuoye10;

public class Bajie extends Person{
	private String xifu;
	public Bajie(String name, int age,String xifu) {
		super(name, age);
		this.xifu=xifu;
		// TODO Auto-generated constructor stub
	}
	void qianma(){
		System.out.println(getName()+"签马");
		
	}

}
