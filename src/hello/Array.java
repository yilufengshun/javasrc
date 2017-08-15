package hello;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
			int[] array={1,23,2,323,21,312,312,321,321,321132,3,214,3,3,43,5,3};
			for (int i = 0; i < array.length; i++) {
				if(array[i]>max)
					max=array[i];
			}
			System.out.println("max="+max);
			
			for (int i : array) {
				System.out.println(i+",");
		
			}
			man[] a=new man[5];
			a[0]=new man();
			a[1]=new man();
			a[2]=new man();
			a[3]=new man();
			a[4]=new man();
			a[0].name="lalala";
			a[1].name="hahaha";
			a[2].name="sdaf";
			a[3].name="lasfa";
			a[4].name="lsadfa";
			
			for(man i:a){
				System.out.println(i.name);
			}
	}

}
class man{
	public String name;
	
	
}