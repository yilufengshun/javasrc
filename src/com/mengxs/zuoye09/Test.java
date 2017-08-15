package com.mengxs.zuoye09;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
			Kacar ka=new Kacar("斯泰尔");
			Xiaocar xiao= new Xiaocar("宝马");
			Man man= new Man("张某某");
			ka.baoyang(man);
			xiao.baoyang(man);
			//2
			Cat a=new Cat();
			Dog d=new Dog();
			a.eat();
			d.eat();
			//3
			Dianqi dianshi=new Dianqi("电视");
			Dianqi fengshan=new Dianqi("风扇");
			Dianqi bingxiang=new Dianqi("冰箱");
			dianshi.dian();
			fengshan.dian();
			bingxiang.dian();
			Fangdaomen f=new Fangdaomen("钛合金防盗门");
			f.suomen();
			f.kaimen();
			
	}

}
