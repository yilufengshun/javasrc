package com.mengxs.demo13;

public class Student {
		private int num;
		private String name;
		private int age;
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
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
		@Override
		public String toString() {
		// TODO Auto-generated method stub
			return "0"+num+"  "+name+"  "+age;
		}
//		public String toString(){
//			return "0"+num+"  "+name+"  "+age;
//		}
}
