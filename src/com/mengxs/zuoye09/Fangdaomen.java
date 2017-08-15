package com.mengxs.zuoye09;

public class Fangdaomen extends Door implements Suo{
			

				
			public Fangdaomen(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

			public void suomen() {
					System.out.println("我"+this.name+"锁门啦");
			}

			@Override
			public void kaimen() {
				// TODO Auto-generated method stub
				System.out.println("我"+this.name+"开门啦");
			}
}
