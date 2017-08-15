package com.mengxs.Zuoye18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1
		//2cp file
		File f1=new File("E:\\qf资料\\孟祥顺\\diamai\\第十八天\\单词.txt");
		
		File f2=new File("E:\\qf资料\\孟祥顺\\diamai\\第十八天\\单词的复制.txt");
		cp(f1,f2);//f1->f2
		//3
		File f3=new File("E:\\qf资料\\孟祥顺\\diamai\\第十八天\\msg.txt");
		ArrayList<Student> re=new ArrayList<Student>();
		re=readStudent(f3);
		Iterator it=re.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

	private static ArrayList<Student> readStudent(File f)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(f);
		String buffer="";
		InputStreamReader isr=new InputStreamReader(fis,"GBK");
		int tmp;
        while((tmp = isr.read()) != -1){
            buffer += (char)tmp;
            }
		String stu=new String(buffer);
		ArrayList<Student> re=new ArrayList<Student>();
		String[] ssss=stu.split("[*]|[#]");

		for(int i=0;i<ssss.length;i+=3){
			re.add(new Student(Integer.parseInt(ssss[i]), ssss[i+1], Integer.parseInt(ssss[i+2])));
		}
		fis.close();
		return re;
		
	}

	private static void cp(File f1,File f2) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream(f1);
		FileOutputStream fo=new FileOutputStream(f2);
		
		byte[] buffer=new byte[1024];
		int off=0;
		int length=1024;
		while(true){
			if(fi.available()<1024)
				length=fi.available();
		fi.read(buffer, off,length);
		fo.write(buffer, off, length);
		off+=1024;
		if(length<1024)
			System.out.println(f1+"-->"+f2+"复制完成！");
		fi.close();
		fo.close();
			return;
	}
		
	}

}
