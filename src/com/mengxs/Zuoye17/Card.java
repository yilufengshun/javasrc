package com.mengxs.Zuoye17;

public class Card {
		private long cardNo;
		private String startDate;
		private int money;
		public Card(long cardNo, String startDate, int money) {
			this.cardNo = cardNo;
			this.startDate = startDate;
			this.money = money;
		}
		@Override
		public String toString() {
			return "Card:\t" + cardNo + "\t" + startDate + "\t" + money + "\n";
		}
		public long getCardNo() {
			return cardNo;
		}
		public void setCardNo(long cardNo) {
			this.cardNo = cardNo;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
}
