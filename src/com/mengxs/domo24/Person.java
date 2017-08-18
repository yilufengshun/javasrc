package com.mengxs.domo24;

public class Person {

			private String name;
			private int age;
			public Person() {
				// TODO Auto-generated constructor stub
			}
			
			
			public Person( String name, int age, Dept dept) {
				super();
				
				this.name = name;
				this.age = age;
				this.dept = dept;
			}
			
			
			@Override
			public String toString() {
				return "Person [name=" + name + ", age=" + age + ", dept=" + dept + "]";
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public Dept getDept() {
				return dept;
			}
			public void setDept(Dept dept) {
				this.dept = dept;
			}
			private Dept dept;
			
}
