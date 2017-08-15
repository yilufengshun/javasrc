package com.mengxs.zuoye10;

public class Shunfeng extends Kuaidi implements Luyun,Kongyun{
			public int time;
			public Shunfeng(int time) {
	
				this.time=time;
				if(time>24|time<0){
					System.out.println("error 0");
				}else if(time<8|time>18){
					super.xiuxi();
				}else{
					super.yingye();
				}
				// TODO Auto-generated constructor stub
			}
			@Override
			public void kongyun() {
				// TODO Auto-generated method stub
				Yunshu.yunshu();
				System.out.println("空运");
			}
			@Override
			public void luyun() {
				// TODO Auto-generated method stub
				Yunshu.yunshu();
				System.out.println("陆运");
			}
				
}
