package com.mengxs.Zuoye15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Collection<Person> q1=new ArrayList<Person>();
			Person p1=new Person("p1", 1);
			Person p2=new Person("p2", 1);
			Person p3=new Person("p3", 1);
			Person p4=new Person("p4", 1);
			Person p5=new Person("p5", 1);
			q1.add(p1);q1.add(p2);q1.add(p3);q1.add(p4);q1.add(p5);
			Iterator pl1=q1.iterator();
			while(pl1.hasNext()){
				Person pp1=(Person) pl1.next();
				System.out.println(pp1);
				}
			
	//2
	Collection<String>  pp2=new ArrayList<String>();
	String s21="第一个";String s22="第er个";
	String s23="第san个";String s24="第si个";
	pp2.add(s21);
	pp2.add(s22);
	pp2.add(s23);
	pp2.add(s24);
	Iterator pl2=pp2.iterator();
	while(pl2.hasNext()){
		String pp1=(String) pl2.next();
		System.out.print(pp1+"  ");
		}
	System.out.println();
	for (String string : pp2) {
		System.out.println(string+"  ");
	}
	System.out.println();
//3
	Collection< Integer> pp3=new ArrayList<Integer>();
	pp3.add(1);pp3.add(10);pp3.add(100);
	Integer sum=0;
	for (Integer integer : pp3) {
		sum+=integer;
	}
	System.out.println("sum= "+sum);
//4
	String s4="01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
	String[] s41=s4.split("\\*|#");
	ArrayList<Person> c4=new ArrayList<Person>();
	System.out.println(Arrays.toString(s41));
	for(int i=0;i<s41.length;i+=3){
		c4.add(new Person(Integer.parseInt(s41[i]),s41[i+1], Integer.parseInt(s41[i+2])));
	}
	for (Person person : c4) {
		System.out.println(person);
	}
	for(int i=0;i<c4.size();i++){
		System.out.println(c4.get(i));
	}
	
	Iterator l4=((Collection<Person>) c4).iterator();
	while(l4.hasNext()){
		System.out.println(l4.next());
	}
	havatianqi(c4);
	rename(c4);
	qiuzhi(c4);
	shan20(c4);
	}

	private static <Person> void havatianqi(Collection<Person> pe) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
		String str="田七";
		for (Person person : pe) {
			if(((com.mengxs.Zuoye15.Person) person).getName().equals(str)){
				System.out.println(person);
			}
		}
	}
	private static <Person> void rename(Collection<Person> pe) {
		// TODO Auto-generated method stub
		for (Person person : pe) {
			if(((com.mengxs.Zuoye15.Person) person).getName()=="张三"){
				((com.mengxs.Zuoye15.Person) person).setName("张兵");
			}
		}
	}
	private static <Person> void qiuzhi(ArrayList<Person> pe) {
	int	min=((com.mengxs.Zuoye15.Person) pe.get(0)).getAge(),max=((com.mengxs.Zuoye15.Person) pe.get(0)).getAge();
		for(int i=0;i<pe.size();i++){
		
		if(	((com.mengxs.Zuoye15.Person) pe.get(i)).getAge()>= max){
			max=((com.mengxs.Zuoye15.Person) pe.get(i)).getAge();
		}if(	((com.mengxs.Zuoye15.Person) pe.get(i)).getAge()<= min){
			min=((com.mengxs.Zuoye15.Person) pe.get(i)).getAge();
		}
		
	}System.out.println("min="+min+",max="+max);
	}
	private static <Person> void shan20(ArrayList<Person> pe) {
		for(int i=0;i<pe.size();i++){
			if	(((com.mengxs.Zuoye15.Person) pe.get(i)).getAge()<20){
				pe.remove(i);
			}
			
		}
		
	}
}
