package com.mengxs.Zuoye17;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//1
		HashMap<String, String> m1=new HashMap();
		m1.put("姓名", "张三");
		m1.put("性别", "男");
		HashMap<String, String> m2=new HashMap();
		m2.put("姓名", "张四");
		m2.put("性别", "男");
		HashMap<String, String> m3=new HashMap();
		m3.put("姓名", "张五");
		m3.put("性别", "男");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		//2
		HashMap<String, String> m21=new HashMap();
		m21.put("姓名", "王八");
		m21.put("xingbie", "未知");
		m21.put("呵呵", "啦啦啦");
		for (String key : m21.keySet()) {
			System.out.println("key="+key+", value="+m21.get(key));
		}
		//3
		HashMap<String, String> m31=new HashMap();
		m31.put("诗1", "是的内容1");
		m31.put("诗2", "是的内容2");
		m31.put("诗3", "是的内容3");
		m31.put("诗4", "是的内容4");
		m31.put("诗5", "是的内容5");
//		Scanner scanner=new Scanner(System.in);
//		String a=scanner.next();
		String a="诗1";
		while(true){
		if(a.equals("exit")){
			System.out.println("退出循环");
			break;
		}
		else{
		if(m31.containsKey(a)){
			System.out.println(m31.get(a));
		      a="exit";}
		else 
			System.out.println("查无此诗");}
	}
	//4
		HashMap<String, ArrayList<Card>> m4=new HashMap<>();
		ArrayList<Card> c1=new ArrayList<>();
		Card card1=new Card(123456, "2017-10-10", 1);
		Card card2=new Card(11236, "2014-118", 2);
		Card card3=new Card(412356, "2012-6-28", 3);
		Card card4=new Card(13124456, "2011-11-11", 4);
		c1.add(card1);c1.add(card2);c1.add(card3);c1.add(card4);
		m4.put("汪峰", c1);
		//String name = scanner.next();
		String name="汪峰";
		System.out.println(m4.get(name));
		//请使用File类在当前项目下创建目录qianfeng，
		//在该目录下又有三个文件夹分别是Android、PHP、JAVAEE,
	//	在JAVAEE文件夹下创建文件msg.txt
		File f1=new File("qianfeng");
		File f2=new File("qianfeng"+File.separator+"Android");
		File f3=new File("qianfeng"+File.separator+"PHP");
		File f4=new File("qianfeng"+File.separator+"JAVAEE");
		File f5=new File("qianfeng"+File.separator+"JAVAEE"+File.separator+"msg.txt");
		f1.mkdirs();f2.mkdirs();f3.mkdirs();f4.mkdirs();
		try {
			f5.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//6
		File f61=new File("HelloWorld.txt");
		File f62=new File("FileTest");
		File f63=new File("FileTest"+File.separator+"HelloWorld.txt");
		try {
				f61.createNewFile();
				System.out.println("是目录："+f61.isDirectory());
				System.out.println("是文件："+f61.isFile());
				f62.mkdir();
			    f61.renameTo(f63);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
	}

}
