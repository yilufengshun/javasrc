package com.mengxs.Zuoye16;

public class GirlFriend {
		private String name;
		private int age;
		private	boolean sex;
		private int birthday;
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
		public int isSex() {
			if(sex==true)
				return 1;
			else 
				return 0;
		}
		public void setSex(boolean sex) {
			this.sex = sex;
		}
		public int getBirthday() {
			return birthday;
		}
		public void setBirthday(int birthday) {
			this.birthday = birthday;
		}
		public GirlFriend(String name, int age, boolean sex, int birthday) {
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.birthday = birthday;
		}
		@Override
		public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age+isSex()+birthday;
		}
		@Override
		public boolean equals(Object obj) {
		// TODO Auto-generated method stub
			GirlFriend g=(GirlFriend) obj;
			if(g.getAge()==this.getAge()&&
					g.getBirthday()==this.getBirthday()&&
					g.getName().equals(this.getName())&&
					g.isSex()==this.isSex())
				return true;
		return false;
		}
		@Override
		public String toString() {
			return "GirlFriend [name=" + name + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday + "]";
		}
		
}
