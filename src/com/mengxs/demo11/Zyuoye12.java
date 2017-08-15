package com.mengxs.demo11;

import java.util.Arrays;

public class Zyuoye12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a={1,2,3,4,5,6};
			int[] b={ 10,11,12,13,14};
			int[] e={2,3,4,8,9,10};
			int c=7;
			
			System.out.println(ArrayTools.toString(ArrayTools.addOne(a, c)));
			System.out.println(ArrayTools.toString(ArrayTools.addOne(b, c)));
			System.out.println(ArrayTools.toString(ArrayTools.addOne(e, c)));
			System.out.println(ArrayTools.toString(ArrayTools.swapInt(a)));
			//3
			int[] arr=new int[10];
			arr=ArrayTools.suijishuzu();
			System.out.println(Arrays.toString(arr));
			//4
			ArrayTools.paouochang();
			//5
			ArrayTools.paoliangge();
	}

}
