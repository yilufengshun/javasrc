package com.mengxs.domo25;

public class xiancheng extends Thread {
			@Override
			public  void run() {
				int i=1;
				// TODO Auto-generated method stub
				while(true){
					synchronized("a"){
						System.out.println(i);
						i++;
						if(i%2==1){
							notify();
						
						}}
//					try {
//						wait();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
					}
				}
			}

class xiancheng2 extends Thread{
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		
		char i='a';
		
			while(true){
				synchronized("b"){
				try {
					Thread.currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(i);
			
		}notify();
				}
	}
}