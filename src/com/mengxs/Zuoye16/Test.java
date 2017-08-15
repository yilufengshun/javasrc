package com.mengxs.Zuoye16;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.mengxs.Zuoye16.paixu;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		Student s1=new Student("zhangsan", 1);
		Student s2=new Student("zhangsan", 1);
		Student s3=new Student("zhangsan", 2);
		HashSet<Student>h1=new HashSet<Student>();
		h1.add(s1);
		h1.add(s2);
		h1.add(s3);
		Iterator i1=h1.iterator();
		while(i1.hasNext()){
			Object obj=i1.next();
			Student s=(Student) obj;
			System.out.println(s);
			
		}
	//2
		GirlFriend g1=new GirlFriend("g1", 1, true, 0123);
		GirlFriend g2=new GirlFriend("g2", 32, true, 0223);
		GirlFriend g3=new GirlFriend("g3", 100, true, 1123);
		GirlFriend g4=new GirlFriend("g1", 1, true, 0123);
		HashSet<GirlFriend>h2=new HashSet<GirlFriend>();
		h2.add(g1);h2.add(g2);h2.add(g3);h2.add(g4);
		for (GirlFriend girlFriend : h2) {
			System.out.println(girlFriend);
		}
		Iterator i2=h2.iterator();
		while(i2.hasNext()){
			Object obj=i2.next();
			GirlFriend s=(GirlFriend) obj;
			System.out.println(s);
			
		}
		//3str = "23 12 45 78 19 25"
		String str = "23 12 45 78 19 25";
		String[] str3=str.split(" ");
		TreeSet<Integer>t3=new TreeSet<Integer>();
		for (String string : str3) {
			t3.add(Integer.parseInt(string));
		}
		System.out.println(t3);
		//4
		Yuangong y5=new Yuangong(13, 10, 2344);
		Yuangong y1=new Yuangong(10, 10, 1000);
		Yuangong y4=new Yuangong(13, 10, 1230);
		Yuangong y2=new Yuangong(10, 11, 1000);
		Yuangong y3=new Yuangong(13, 11, 1000);
	
	
		//TreeSet<Yuangong> t4=new TreeSet<Yuangong>();
		TreeSet<Yuangong> t4=new TreeSet<Yuangong>(new paixu());
		t4.add(y1);
		t4.add(y2);
		t4.add(y3);
		t4.add(y4);
		t4.add(y5);
		System.out.println(t4);
		
		
		
	}
//
}
