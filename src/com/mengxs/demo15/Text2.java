package com.mengxs.demo15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Collection collection=new ArrayList<>();
			for(int i=0;i<10;i++){
				collection.add(i);
			}
			int sum=0;
			Iterator t=collection.iterator();
			while(t.hasNext()){
				Object a=t.next();
				int b=(Integer) a;
				sum+=b;
			
			}
			System.out.println(sum);
	}
}


