package com.mengxs.demo16;

import java.util.HashSet;
import java.util.Set;

import com.mengxs.zuoye10.Person;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化一个set
		Set<Integer> set=new HashSet<Integer>();
		//向set中添加内容
		set.add(2);
		set.add(100);
		set.add(7);
		set.add(1000);
		//打印信息
		System.out.println(set);
		//无序的，且没有重复
		Set<String>set2=new HashSet<String>();
		set2.add("beijing");
		set2.add("adsfdsf");
		set2.add("fads");
		set2.add("fasdf");
		set2.add("dahjl");
		System.out.println(set2);
		HashSet<Person>set3=new HashSet<Person>();
		set3.add(new Person("100", 123));
		set3.add(new Person("hehe2", 1));
		set3.add(new Person("hehe3", 123));
		set3.add(new Person("hehe4", 125));
		set3.add(new Person("100", 123));
		System.out.println(set3);
		
	}

}
