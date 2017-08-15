package hello;

public class Duotai {
			public static void main(String[] args) {
				D a=new D() ;
				System.out.println(a.a);
				E b=new E();
				
				System.out.println(b.a);
				a= (E)b;
				System.out.println(b instanceof E);
				
			}
			
	
}
 class D{
	int a=3;
	int b=4;
}
 class E extends D{
	 int c=5;
	 int a=1990;
 }