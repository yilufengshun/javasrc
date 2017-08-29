package com.mengxs.domo26;

public class Student extends Person{
		 public Student(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	private 	int id;
	private	 String name;
	private	 String gender;
		 public Student() {
			// TODO Auto-generated constructor stub
		}
		public void show(){
			 System.out.println(id+name+gender);
		 }
		public void show(int a){
			 System.out.println(id+name+gender+"adf:"+a);
		 }
		public int getinfo(){
			return id;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
		}
		public static void getin(){
			System.out.println("jingtai de ");
			
		}
		private void getinin(){
			System.out.println("私有的方法");
		}
}
