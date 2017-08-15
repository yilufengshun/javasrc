package com.mengxs.Zuoye20;



public class Test implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			myxiancheng t11=new myxiancheng();
			myxiancheng t12=new myxiancheng();
			t11.start();
			t12.start();
			
			//2
			Test t21=new Test();
			t21.run();
			//3
			zuoshou z1=new zuoshou();
			youshou y1=new youshou();
				z1.start();
				y1.start();
			//4
			shoupiaokou sh1=new shoupiaokou();
			shoupiaokou sh2=new shoupiaokou();
			shoupiaokou sh3=new shoupiaokou();
			shoupiaokou sh4=new shoupiaokou();
			sh1.start();sh2.start();sh3.start();sh4.start();
			for(int i=0;i<100;i++){
				sh1.paipiao(1);
				sh2.paipiao(2);
				sh3.paipiao(3);
				sh4.paipiao(i);
			}
			//5
			Card card=new Card("ka", 10000);
			card.run();
		for(int i=100;i>-200;i--){
			if(!card.add(i))
				break;
		}
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("这是另一个线程");
	}

}
class myxiancheng extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("这是一个线程");
	}
	
}
class zuoshou extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++){
			Thread.sleep(500);
			System.out.println("A");}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
class youshou extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++){
			Thread.sleep(300);
			System.out.println("B");}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
class shoupiaokou extends Thread{
		static int piao =1000;
		@Override
		public void run() {
		// TODO Auto-generated method stub
			while(true){
			if(piao<0){
				System.out.println("票买完了");
				return;
					}
			}
		}
	public void paipiao(int a){
		if(piao<0){
			System.out.println("票买完了");
			return ;
		}
		System.out.println("卖了"+a+"张票,剩余"+piao);
		piao-=a;
	}
}

class Card extends Thread{
	String name;
	int money;
	boolean is=true;
	public Card(String name,int m) {
		// TODO Auto-generated constructor stub
		this.name=name;
		money=m;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(is==false)
			return;
	}
		boolean add(int a){
			if(money+a<0){
				System.out.println("余额不足！");
				return false;
				}
			money+=a;
			System.out.println("成功存入"+a+",剩余："+money);
			return true;
		}
	
}




