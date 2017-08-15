package com.mengxs.zuoye10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		Wukong wukong = new Wukong("悟空", 3600, "金箍棒");
		Bajie bajie = new Bajie("八戒", 1000, "白骨精");
		Shaheshang shaheshang = new Shaheshang("沙和尚", 2000, "xiushahe");
		wukong.chifan();
		wukong.dayaoguai();
		bajie.chifan();
		bajie.qianma();
		shaheshang.shuijiao();
		shaheshang.tiaoxingli();
		// 2
		Person wangfeng = new Person("王峰", 25, true, null);
		Person f = new Person("凤姐", 24, false, null);
		f.marry(wangfeng);
		// 3
		Girl ruhua = new Girl("如花", 10, "狗");
		Girl ruyue = new Girl("如月", 10, "猫");
		Girl ruyan = new Girl("如烟", 10, "鬼");
		ruhua.yang();
		ruyue.yang();
		ruyan.yang();

		// 4
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入时间");
		// int time=scanner.nextInt();
		int time = 10;
		Shunfeng shun = new Shunfeng(time);
		// 5
		Yunda yun = new Yunda();
		Shentong shen = new Shentong();
		yun.luyun();
		shen.kongyun();
		// 6
		// 注释掉输入部分
		List list = new List();
		for (int i = 0; i < 10; i++) {
			System.out.print("输入姓名：");
			String name = scanner.next();
			System.out.print("输入年龄：");
			int age = scanner.nextInt();
			System.out.print("输入性别：(true or false):");
			boolean sex = scanner.nextBoolean();
			System.out.print("输入手机：");
			long phone = scanner.nextLong();
			System.out.print("输入身份证号：");
			long id = scanner.nextLong();
			Person ll = new Person(name, age, sex, phone, id);
			System.out.print("输入y继续其他退出：");
			String y = scanner.next();
			if (!y.equals("y")) {
				i = 10;
			}

			list.add(ll);
		}

		Person a = new Person("xiaoming", 12, true, 18236178, 1213114455);
		Person c = new Person("1afasf", 122, true, 1821238, 1234455);
		Person d = new Person("xfasd", 121, true, 1812378, 213124455);
		Person e = new Person("xifdsaf", 122, true, 1123178, 1121234455);//系统插入以供查询
		list.add(a);list.add(c);list.add(d);list.add(e);
		System.out.println("输入查询的名字：");
		String find = scanner.next();
		list.findByName(find);

	}

}
