package com.mengxs.Zuoye16;

public class Student {
		private String name;
		private int cardId;
		public Student(String name, int cardId) {
			this.name = name;
			this.cardId = cardId;
		}
		public int getCardId() {
			return cardId;
		}
		public void setCardId(int cardId) {
			this.cardId = cardId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return name+cardId;
		}
		@Override
		public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+cardId;
		}
		@Override
		public boolean equals(Object obj) {
		// TODO Auto-generated method stub
			Student s=(Student) obj;
			if(s.getCardId()==this.getCardId() &&s.getName().equals(this.getName()))
				return true;
		return false;
		}
}
