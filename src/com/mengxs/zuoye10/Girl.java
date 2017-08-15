package com.mengxs.zuoye10;

public class Girl extends Person{
			private String chongwu;
	public Girl(String name, int age,String chongwu) {
		super(name, age);
		this.chongwu=chongwu;
		// TODO Auto-generated constructor stub
	}
			public void yang() {
				System.out.println(this.getName()+"养"+getChongwu());
			}
			public String getChongwu() {
				return chongwu;
			}
			public void setChongwu(String chongwu) {
				this.chongwu = chongwu;
			}
}
