package com.mengxs.zuoye10;

public class Person {
	private int age;
	private String name;
	private boolean gender;
	private Person partner;
	private long phone;
	private long id;

	public Person(String name, int age, boolean gender, long phone, long id) {
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.setPhone(phone);
		this.setId(id);

	}

	public String toString() {
		return getName() + " ," + getAge() + " ," + isGender() + " ," + getPhone() + " ," + getId();

	}

	public Person(String name, int age, boolean gender, Person partner) {
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.partner = partner;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Person getPartner() {
		return partner;
	}

	public void setPartner(Person partner) {
		this.partner = partner;
	}

	public Person(String name, int age) {
		this.age = age;
		this.setName(name);
		// TODO Auto-generated constructor stub
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void chifan() {
		System.out.println(this.getName() + "eating");
	}

	public void shuijiao() {
		System.out.println(this.getName() + "zzzing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void marry(Person man) {
		if (man.isGender() == this.isGender()) {
			if (this.isGender() == true)
				System.out.println("gay");
			else
				System.out.println("花瓶！");
			return;
		} else if ((man.isGender() == true & man.getAge() < 24) ||
				(man.isGender() == false & man.getAge() < 22)
				|| (this.isGender() == false & this.getAge() < 22) 
				|| (this.isGender() == true & this.getAge() < 24)) {
			System.out.println("年龄不够");
		} else if (man.getPartner() != null | this.getPartner() != null) {
			System.out.println("禁止重婚");
		} else {
			System.out.println("结去吧");
		}
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result=0;
		System.out.println("拉拉啦这是hashcode");
		if(name!=null)
			result=name.hashCode()+age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("这是equals");
		if(obj==null)
			return false;
		if(this==obj)
			return true;//内存中地址一致
		if(obj instanceof Person)
		{
				Person p=(Person) obj;
				if(this.name.equals(p.getName())  && this.age==p.getAge())
						return true;
		}
		return false;
	}
}
