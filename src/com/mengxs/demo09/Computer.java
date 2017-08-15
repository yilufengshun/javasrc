package com.mengxs.demo09;

public class Computer implements Usb,RJ45{

	public void charu() {

			System.out.println("插入");
	}

	public void bachu() {

				System.out.println("拔出");
	}

	@Override
	public void onLine() {
		// TODO Auto-generated method stub
		System.out.println("插入RJ45");
	}

	@Override
	public void offLine() {
		// TODO Auto-generated method stub
		System.out.println("拔出RJ45");
	}

}
