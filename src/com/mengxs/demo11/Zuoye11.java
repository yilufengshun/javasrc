package com.mengxs.demo11;
import java.util.Arrays;
public class Zuoye11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
			int[] a={1,2,3,4,5,6,7,8,9,10};
			System.out.println(ArrayTools.getMin(a));
		//2
			for (int i = 0; i < a.length; i++) {
				System.out.print("["+i+","+a[i]+"]");
			}
			System.out.println();
			
			//3
			System.out.println(ArrayTools.getMax(a)+","+ArrayTools.getIndex(a, ArrayTools.getMax(a)));
			int[] b;
			a[ArrayTools.getIndex(a, ArrayTools.getMax(a))]=a[a.length-1];
			b=Arrays.copyOf(a, a.length-1);//获得最大值，取代最后一个，然后缩小一
			b[ArrayTools.getIndex(b, ArrayTools.getMin(b))]=b[b.length-1];
			b=Arrays.copyOf(b, b.length-1);
			System.out.println(ArrayTools.toString(b));
			System.out.println("avg="+ArrayTools.avg(b));
			//4
			for(int i=0;i<a.length;i++){
				for(int f=i+1;f<a.length;f++){
					ArrayTools.swap(a, f, i);
				}
			}
			System.out.println(ArrayTools.toString(a));
		//5
			int[] chengji={20,50,60,70,90};
			for(int i=0;i<chengji.length;i++){
				for(int f=i+1;f<chengji.length;f++){
					ArrayTools.swap(chengji, f, i);		
				}
			}
			System.out.println(ArrayTools.toString(chengji));
			System.out.println("avg="+ArrayTools.avg(chengji)+",max="+ArrayTools.getMax(chengji)+",min="+ArrayTools.getMin(chengji));		

}
	}
