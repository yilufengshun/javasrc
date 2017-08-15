package com.mengxs.zuoye10;

public class Kuaidi  extends Gongsi{
		
		private String name;
		public Kuaidi() {
			// TODO Auto-generated constructor stub
		}
		public Kuaidi(String name) {
			this.name=name;
			// TODO Auto-generated constructor stub
		}
	@Override
	public void yingye() {
		// TODO Auto-generated method stub
		System.out.println("营业ing");
	}

	@Override
	public void xiuxi() {
		// TODO Auto-generated method stub
		System.out.println("休息ing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
