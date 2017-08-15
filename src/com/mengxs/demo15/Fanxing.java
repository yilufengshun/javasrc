package com.mengxs.demo15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

class Box<E>  {
	private E t;
	public void add(E t){
		this.t=t;
		
	}
	public E get(){
		return t;
	}
	
}



public class Fanxing {
		public static <E> void printArray(E[] a){
			for(E b:a){
				System.out.print(b+"  ");
			}
			System.out.println();
		}
		public static void getData(List<?> data) {
		      System.out.println("data :" + data.get(0));
		   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] intArray = { 1, 2, 3, 4, 5 };
	        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	        printArray(intArray);
	        printArray(doubleArray);
	        printArray(charArray);
	        Box<Integer> a=new Box<Integer>(); 
	        a.add(new Integer(100));
	        System.out.println(a.get());
	        List<Integer>   Name =new ArrayList<Integer>();
	        		Name.add(1233);
	        getData(Name); 
	        Collection<String>   col =null;
	       HashSet<Integer>  hashSet=new HashSet<>(Name);
	       hashSet.add(103);
	       System.out.println(hashSet.size());
	    
 	}

}
