package com.mengxs.zuoye10;

public class Wukong extends Person {
	private String wuqi;
	public Wukong(String name, int age,String wuqi) {
		super(name, age);
		this.wuqi=wuqi;
		// TODO Auto-generated constructor stub
	}
		public void dayaoguai() {
			System.out.println(getName()+"用"+wuqi+"打妖怪");
		}
}
