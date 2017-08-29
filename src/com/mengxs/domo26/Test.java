package com.mengxs.domo26;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 5, 7, 32, 123 };
		// show(nums);
		// 可变参数
		getStuClass();
		// show2(10,20,40);
		// show2(nums);
	}

	public static void show(int[] num) {
		System.out.println(num.length);
		for (int i : num) {
			System.out.println(i);
		}

	}

	public static void show2(int... num) throws ClassNotFoundException {
		System.out.println(num.length);
		for (int i : num) {
			System.out.println(i);
		}

	}

	public static void getStuClass() throws Exception {
		// 1使用对象的getclass方法
		Student zhangsan = new Student();
		Class<?> a = zhangsan.getClass();
		// 2使用class属性获取
		Class<?> class2 = Student.class;
		// 3使用class。forname 获取.一定要写全名称
		Class<?> class3 = Class.forName("com.mengxs.domo26.Student");
		System.out.println(class3.hashCode());
		// 获取无参的构造方法
		Constructor<?> con = class3.getConstructor(null);
		Object object = con.newInstance(null);
		System.out.println(object.toString());
		// 简便写法
		Object o3 = class3.newInstance();
		// 有参的
		Constructor<?> con2 = class3.getConstructor(int.class, String.class, String.class);
		Object object2 = con2.newInstance(20, "qwe", "hhe");
		System.out.println(object2.toString());

		// 普通方法
		Method[] meth = class3.getMethods();// 包含从父类继承的，所有的公共方法
		Method[] meth2 = class3.getDeclaredMethods();// 获取所有声明的方法
		// 包含私有的，不包括继承的
		for (Method m : meth2) {
			System.out.println(m);
		}
		// 获取单个方法
		Method m = class3.getMethod("show");
		// 调用方法invoke
		m.invoke(object2);
		Method m2 = class3.getMethod("show", int.class);
		m2.invoke(object2, 12328);
		// 又返回值得
		Method m3 = class3.getMethod("getinfo");
		int m3a = (int) m3.invoke(object2);
		System.out.println(m3a);
		// 3静态的
		Method m4 = class3.getMethod("getin");
		m4.invoke(null);
		// 4私有的
		Method m5 = class3.getDeclaredMethod("getinin");
		// 设置访问java的访问权限无效
		m5.setAccessible(true);
		m5.invoke(object2);
		// 得到变量
		// class3
		Field[] f = class3.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		System.out.println("-------------------------");
		// 只能获取到公开的方法
		Field[] f2 = class3.getDeclaredFields();
		for (Field field : f2) {
			System.out.println(field);
		}
		//
		Field f31 = class3.getDeclaredField("id");
	
		f31.setAccessible(true);
		f31.set(object2, 99);
		// 也有setint方法
		int i31 = (int) f31.getInt(object2);
		System.out.println(i31);
		Field f32 = class3.getDeclaredField("name");
		f32.setAccessible(true);
		f32.set(object2, "梦想和孙");
		System.out.println(f32.get(object2));
		System.out.println(object2.toString());
		///
		///////////////////////
		// Class class4=Class.forName("com.mengxs.domo26.Test");
		// Method m41=class4.getMethod("main",String[].class);
		// 调用另一个类的main方法
		// m41.invoke(null,(Object)new String[]{"123","adf"});
		Class c1=Void.class;
		System.out.println(Arrays.toString(class3.getClass().getInterfaces()));
	}
}
