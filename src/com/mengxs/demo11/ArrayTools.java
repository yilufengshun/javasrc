package com.mengxs.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.management.RuntimeErrorException;

public class ArrayTools {
		public static int getIndex(int[] a,int key){
			for (int i = 0; i < a.length; i++) {
				if(a[i]==key)
					return i;
			}
			return -1;
		}
		public static boolean swap(int[] arr,int a,int b){
			if(arr[a]>arr[b]){
				int t=arr[a];
				arr[a]=arr[b];
				arr[b]=t;
				return true;
			}//true 代表前一个数大于后一个并交换
			else
				return false;
		}
		public static String toString(int[] a) {
			String r="int{";
			for (int i = 0; i < a.length-1; i++) {
				r=r+a[i]+",";
			}
			r=r+a[a.length-1]+"}";
			return r;
		}
		public static int getMax(int[] a) {
			int max=a[0];
			for (int i = 0; i < a.length; i++) {
				if(a[i]>max)
					max=a[i];
			}
			return max;
		}
		public static int getMin(int[] a) {
			int min=a[0];
			for (int i = 0; i < a.length; i++) {
				if(a[i]<min)
					min=a[i];
			}
			return min;
		}
		
		public static double avg(int[] a) {
			if(a.length<0)
				return 0;
			int sum=0;
			for (int i = 0; i < a.length; i++) {
				sum+=a[i];
			}
			
			return (double)sum/a.length;
			
		}
		public static int[] addOne(int[] a,int b){
			//假定为有序的
			Arrays.sort(a);
			//还是排一下吧

			int mid=a.length/2;
			while(true){
				
				if(a[mid]>b & a[mid-1]<b){
					break;
			}else if(a[mid]>b){
				mid=mid/2;
			}else if(a[mid]<b){
				mid=(a.length+mid)/2;
			}
			if(mid==(a.length-1)){
			//	System.out.println(a.length-1);
				mid++;
				break;
			}else if(mid==0){
				break;
			}
			}	
			a=Arrays.copyOf(a, a.length+1);
			for(int i=a.length-1;i>mid;i--){
				a[i]=a[i-1];
			}
			a[mid]=b;
			
			return a;
		}
	public 	static int[] swapInt(int[] a){
		int swap=0;
		for(int i=0;i<a.length/2;i++){
			swap=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=swap;
		}
		return a;
	}
	public static int[] suijishuzu()	{
	Random r=new Random();
	int[] arry = new int[10];
		List<Integer> l = new ArrayList<Integer>();
		int i=0;
		while(i<10){
			int a=r.nextInt(100)+1;
			if(!l.contains(a)){
				l.add(a);
				arry[i]=a;
				i++;
			}
		}
		return arry;
		}
		public static void paouochang() {
			try{
				int[] a = null;
				a[1]=0;
			}
			catch(Exception e){
				System.out.println("运行时异常");
			}
		}
		public static void paoliangge(){
			try{
				int[] a = null;
				a[1]=0;
			}
			catch(Exception e){
				System.out.println("运行时第一次异常"+e.toString());
			}finally{
				try{
				int[] a = new int[1];
				a[100000]=0;
			}
			catch(Exception e){
				System.out.println("运行时第二次异常"+e.toString());
			}
			}
		}
			
	

}

