package com.mengxs.zuoye09;

public class Kacar extends Car {
			public Kacar(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

			public void baoyang(Man man) {
				System.out.println(man.getName()+"卡车的保养方法");
			}
}
