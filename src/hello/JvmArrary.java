package hello;

import java.util.Arrays;

import com.mengxs.zuoye10.Person;

public class JvmArrary {
	public static void main(String[] args) {
		int[] a={123,123,123};
		Class cla=a.getClass();
		System.out.println(cla);
		long[][] b ={{1,2},{2,3}};
		cla=b.getClass();
		System.out.println(cla);
		double[][] c ={{1,2},{2,3}};
		cla=c.getClass();
		System.out.println(cla);
		Person[] p=new Person[5];
		cla=p.getClass();
		System.out.println(cla);
		Person[][] p2=new Person[3][];
		cla=p2.getClass();
		System.out.println(cla);
		int sum=0;
		int chengji[][]={{12,34,2,4},{12,34,123,4},{72,34,12,4},{24,34,43,4}};
		for (int i=0;i<chengji.length;i++){
			for(int f=0;f<chengji[i].length;f++)
				sum+=chengji[i][f];
			
		}
		System.out.println(sum);
	}
			
}
