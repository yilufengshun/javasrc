package com.mengxs.zuoye09;

public class Xiaocar extends Car {
			public Xiaocar(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

			public void baoyang(Man man){
				System.out.println(man.getName()+"这是小汽车的保养方法");
			}
}
