package com.mengxs.demo20;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		duoxiancheng duo=new duoxiancheng();
		duo.start();
			for(int i=0;i<100;i++){
				System.out.println("a");
				Thread.currentThread().sleep(1000);
			}
		
	}
}
 class duoxiancheng extends Thread{
	 @Override
	public void run() {
		 for(int i=0;i<100;i++){
				System.out.println("\t"+i);
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		// TODO Auto-generated method stub
	}
 }