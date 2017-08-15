package com.mengxs.Zuoye16;

public class Yuangong implements Comparable<Yuangong>{
	private int age;
	private int gongling;
	private int xinshui;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGongling() {
		return gongling;
	}
	public void setGongling(int gongling) {
		this.gongling = gongling;
	}
	public int getXinshui() {
		return xinshui;
	}
	public void setXinshui(int xinshui) {
		this.xinshui = xinshui;
	}
	@Override
	public String toString() {
		return "Yuangong [age=" + age + ", gongling=" + gongling + ", xinshui=" + xinshui + "]";
	}
	public Yuangong(int age, int gongling, int xinshui) {
		this.age = age;
		this.gongling = gongling;
		this.xinshui = xinshui;
	}
	public Yuangong() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Yuangong o) {
		// TODO Auto-generated method stub
		if(this.getAge()!=o.getAge())
			if(this.getAge()>o.getAge())
				return 1;
			if(this.getAge()<o.getAge())
				return -1;
			else if(this.getGongling()!=o.getGongling())
				if(this.getGongling()>o.getGongling())
					return -1;
				if(this.getGongling()<o.getGongling())
					return 1;
			else if(this.getXinshui()!=o.getXinshui())
					if(this.getXinshui()>o.getXinshui())
						return -1;
					if(this.getXinshui()<o.getXinshui())
						return 1;
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("ssafsdfdsfds");
		return true;
	}
	
}
