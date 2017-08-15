package com.mengxs.zuoye19;

public class CIty {
	public int year;
	public String place;
	public String winner;

	public CIty(int year, String place, String winner) {

		this.year = year;
		this.place = place;
		this.winner = winner;
	}

	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return year+"|"+place+"|"+winner+"\n";
		}
}