package com.mengxs.Zuoye26;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			//1
			//2
		Student stu=new Student();
		Class c21=stu.getClass();
		Class c22=Student.class;
		Class c23=Class.forName("com.mengxs.Zuoye26.Student");
		//3
		Constructor con=c21.getConstructor(String.class,int.class);
		Object object=con.newInstance("孟祥顺",25);
		Field f31=c21.getDeclaredField("name");
		Field f32=c21.getDeclaredField("age");
		f31.setAccessible(true);
		f32.setAccessible(true);
		System.out.println("姓名："+f31.get(object).toString());
		System.out.println("年龄："+f32.getInt(object));
		//4
		Constructor con41=c21.getConstructor();
		Object obj2=con41.newInstance();
		//5
		f31.set(object, "作业");
		f32.set(object,90);
		System.out.println("姓名："+f31.get(object));
		System.out.println("年龄："+f32.get(object));
		//6
		Method m61=c21.getDeclaredMethod("toS");
		m61.setAccessible(true);
		m61.invoke(object);
	}

}
