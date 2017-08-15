package com.mengxs.domo21;



public class add {
		private num[] n=new num[100];
		private int id = 0;
		public add(){
			
		}
		public synchronized void ad(num a){
			while(id==n.length-1){
				try {
					System.out.println(Thread.currentThread().getName()+"dengdai");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			n[id] = a;
			System.out.println(Thread.currentThread().getName()+"\t 添加的馒头 " + id);
			id++;	
			notify();
			}
		public synchronized void de(){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(id==0){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
			id--;
			notify();
			num manTou = n[id];//��ȡ��ͷ
			System.out.println(Thread.currentThread().getName()+"删除的数" + manTou);
		}		
		
}
