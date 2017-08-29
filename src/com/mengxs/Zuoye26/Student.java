package com.mengxs.Zuoye26;

import java.util.jar.Attributes.Name;

public class Student {
			private String name;
			private int age;
			@Override
			public String toString() {
				return "Student [name=" + name + ", age=" + age + "]";
			}
			public Student() {
				super();
			}
			public Student(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			private void toS(){
				System.out.println(this.toString());
			}
}
