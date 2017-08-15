package com.mengxs.demo13;




public class Zuoye13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.给定一个字符串：
//		"fdrer234FD43gfgKLOQPLDmcnnd574mdIINEQS";
//		大写字母：个数
//		小写字母：个数
//		非字母：个数
		int da=0,xiao=0,fei=0;
		String str="fdrer234FD43gfgKLOQPLDmcnnd574mdIINEQS";
		char[] cha=str.toCharArray();
		for(int i=0;i<cha.length;i++) {
			if(cha[i]>=65 &cha[i]<=90)
				da++;
			else if(cha[i]>=97&cha[i]<=122)
				xiao++;
			else 
				fei++;
		}
		System.out.println("大写="+da+" 小写="+xiao+" 其他="+fei);

//2.给定一个字符串：
//"javasejavaeejavameandroidjavac#.netjava.php"
//统计java出现的次数
//	
	String str2="javasejavaeejavameandroidjavac#.netjava.php";
	char[] cha2=str2.toCharArray();
	int sum=0;
	for(int i=0;i<cha2.length-4;i++){
		if(cha2[i]=='j'&&cha2[i+1]=='a'&&cha2[i+2]=='v'&&cha2[i+3]=='a')
			sum++;
		
	}
	System.out.println("总数="+sum);
	
//	3.字符串："ABCDEFGHIJK",
//	输出的所有的连续的字母的组合，新字符串的长度<=8
//	String str3="ABCDEFGHIJK";
//	char[] cha3=str3.toCharArray();
//			
//				for(int x=1;x<9;x++){
//					System.out.println(x+"个字母：");
//					for(int i=0;i<cha3.length-x;i++){
//					String str31=str3.substring(i, i+x);
//						System.out.print(str31+"\t");
//				}System.out.println();
//			}
//	3.字符串："ABCDEFGHIJK",
//	输出的所有的连续的字母的组合，新字符串的长度<=8
//	String str3="ABCDEFGHIJK";
//	char[] cha3=str3.toCharArray();
	//第二种实现
	String str31="ABCDEFGHIJK";
	for(int i=0;i<str31.length();i++){
		for(int j=0;j<=str31.length();j++){
			 if(j>=i &j-i<8){
				 if(j<=str31.length()){
				 System.out.println(str31.substring(i, j));
				 }
			 }
		}
		
	}
	
	
	
//				4，字符串解析，现有一字符串，
//				“卡巴斯基#杀毒软件#免费版#俄罗斯#”，
//				解析出每个元素。	
				String str4="卡巴斯基#杀毒软件#免费版#俄罗斯#";
				for(int i=0;i<str4.split("#").length;i++){
					
					System.out.println(str4.split("#")[i]);
				}
//				5，如下字符串：01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21 分割出每个人的信息，样式如下：
//				01  张三 20
//				02  李四 18
//				。。。。
//
//				创建Student类，属性：学号  姓名 年龄，  
//				将这些Student对象放进数组中
				String str5="01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
				Student[] students=new Student[10];
				String[] str51=str5.split("#|\\*");
				for(int i=0;i<str51.length/3;i++){
					
						students[i]=new Student();
						students[i].setNum(Integer.parseInt((str51[i*3])));
						students[i].setName(str51[i*3+1]);
						students[i].setAge(Integer.parseInt(str51[i*3+2]));
					
				}
				for(int i=0;i<str51.length/3;i++){
					System.out.println(students[i].toString());
				}
				
}
	}
