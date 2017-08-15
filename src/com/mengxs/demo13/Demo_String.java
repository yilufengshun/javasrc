package com.mengxs.demo13;

import java.util.Arrays;

//String常用的方法
public class Demo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="hello world";
	//charAt
	char c1=str.charAt(6);
	System.out.println("c1 =  "+c1);
	//长度
	System.out.println("length="+str.length());
	//concat   +
	String s2=str.concat("啦啦啦");
	System.out.println("S2= "+s2);
	//contains 是否包含指定内容
	System.out.println(s2.contains("hello"));
	//endWith  以xxx结尾  startsWith
	System.out.println(str.endsWith("d"));
	//equals 比较 IgnoreCase
	System.out.println("abc".equals("abc"));
	byte[] byte1=str.getBytes();
	System.out.println("byte1="+Arrays.toString(byte1));
	char[] charArray=str.toCharArray();
	System.out.println("charArray="+Arrays.toString(charArray));
	
	
	
	
	
	}

}
