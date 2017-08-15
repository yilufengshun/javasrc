package com.mengxs.demo13;

public class Text {


	//常用类
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			java.lang.Character a='b';
			Integer b=100;
			Byte b1=4;
			Short c=1;
			Float d=(float) 1;
			Double e=(double) 2;
			Boolean b4= false;
			Integer i1=100;
			Integer i2=100;
			Integer z1=1000;
			Integer z2=1000;
		System.out.println(i1==i2);
		System.out.println(z1==z2);
		byte[] b2={97,98,99,10};
		String s3=new String(b2, 1,2);//包前不包后
		System.out.println(s3);
		char[] c2={'h','e','l','l','o','!'};
		String s4=new String(c2);
		String s5=new String(c2,1,3);
		System.out.println("s4="+s4);
		System.out.println("s5="+s5);
		String str="abcdefghijklmnopqistuvwxyz";
		

			
	}

}
