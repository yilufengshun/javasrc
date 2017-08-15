package com.mengxs.domo21;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add a=new add();
		Xaofei x=new Xaofei(a);
		Huafei h=new Huafei(a);
			Thread t1=new Thread(x);
			Thread t2=new Thread(h);
			Thread t3=new Thread(h);
			Thread t4=new Thread(h);
			Thread t5 = new Thread(h);
			t1.start();t2.start();t3.start();t4.start();
			t5.start();

	}

}

