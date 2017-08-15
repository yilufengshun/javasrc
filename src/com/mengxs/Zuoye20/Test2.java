package com.mengxs.Zuoye20;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ceshi c1=new ceshi("1");
			ceshi c2=new ceshi("2");
			c1.setPriority(10);
			c2.setPriority(1);
			c1.start();
			c2.start();
	}
}
class ceshi extends Thread{
	public ceshi(String string) {
		// TODO Auto-generated constructor stub
		setName(string);
	}

	@Override
	public void run() {
		while (true) {
			// TODO Auto-generated catch block
			System.out.println(getName());
		}
	

	}
	
}