package com.mengxs.domo21;

public class Xaofei implements Runnable{
		private add a;
		private int idex=1;
		public Xaofei(add b) {
			a=b;
			// TODO Auto-generated constructor stub
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		while(true){
		num zz=new num(idex++);
		a.ad(zz);}
	}
		
}
class Huafei implements Runnable{
	private add a;
	private int idex=1;
	public Huafei(add b) {
		a=b;
		// TODO Auto-generated constructor stub
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	while(true){
	a.de();
	}
}
	
}
