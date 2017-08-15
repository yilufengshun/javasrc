package com.mengxs.zuoye10;

public class Shaheshang extends Person{
			String liushahe;
	public Shaheshang(String name, int age,String liushahe) {
		super(name, age);
		this.liushahe=liushahe;
		// TODO Auto-generated constructor stub
	}
	public void tiaoxingli(){
		System.out.println(getName()+"挑行李");
	}

}
