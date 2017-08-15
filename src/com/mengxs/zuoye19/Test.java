package com.mengxs.zuoye19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f1=new File("E:\\py\\img\\1.jpg");
			File f2=new File("C:\\Users\\meng\\Desktop\\1.jpg");
			File f3=new File("C:\\Users\\meng\\Desktop\\liaotian.txt");
			File f4=new File("C:\\Users\\meng\\Desktop\\country.txt");
			cp(f1, f2);
			//2
			liaotian(f3);
			//3
			ArrayList<CIty> a4=duxushuji(f4);
			chaxun(a4);
	}
	private static ArrayList<CIty>  duxushuji(File file) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<CIty>city=new ArrayList<>();
		InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
		BufferedReader br=new BufferedReader(isr);
	String str;
		while((str=br.readLine())!=null){
		String[] strings=str.split("[|]");
		city.add(new CIty(Integer.parseInt(strings[0]), strings[1],strings[2]));
		}
		
		
		
		isr.close();
		return city;
	}
	private static void chaxun(ArrayList<CIty> citys) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		while(true){
		System.out.println("您是要查询年份1,举办地2,还是冠军国3,退出请输入0:");
		
				String i2=scanner.next();
				int i=Integer.parseInt(i2);
		switch (i) {
		case 1:
			i=scanner.nextInt();
			System.out.println(chaxunniangen(i,citys));
			break;
		case 2:
			String jibandi=scanner.next();
			System.out.println(chaxunjibandi(jibandi,citys));
			break;
		case 3:
			String guanjunguo=scanner.next();
			System.out.println(chaxunguanjunguo(guanjunguo,citys));
			break;
		default:
			System.out.println("tuichu!");
			return;
		}
		
		
		}
	}
	private static CIty chaxunguanjunguo(String guanjunguo, ArrayList<CIty> citys) {
		// TODO Auto-generated method stub
		Iterator it=citys.iterator();
		while(it.hasNext()){
			CIty c=(CIty)it.next();
			if(c.winner.equals(guanjunguo))
				return c;
		}
		return null;
		
	}
	private static CIty chaxunjibandi(String jibandi, ArrayList<CIty> citys) {
		// TODO Auto-generated method stub
		Iterator it=citys.iterator();
		while(it.hasNext()){
			CIty c=(CIty)it.next();
			if(c.place.equals(jibandi))
				return c;
		}
		return null;
	}
	private static CIty chaxunniangen(int i, ArrayList<CIty> citys) {
		// TODO Auto-generated method stub
		Iterator it=citys.iterator();
		while(it.hasNext()){
			CIty c=(CIty)it.next();
			if(c.year==i)
				return c;
		}
		return null;
	}
	private static void liaotian(File f3) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("输入聊天，quit退出");
		FileWriter fw=new FileWriter(f3);
		BufferedWriter bw=new BufferedWriter(fw);
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time=sdf.format(System.currentTimeMillis());
			bw.write(time);
			bw.newLine();
		String[] name={"小明：","小红 : "};
		System.out.print(name[i%2]);
		String line=br.readLine();
	
		
		br.lines();
		if(line.equals("quit")){
			bw.flush();
	
			System.out.println("退出聊天,保存到"+f3);
			return;
		}
			
		bw.write(name[i%2]+line);
		bw.newLine();
		i++;
		}
		
	}
	private static void cp(File f1,File f2) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream(f1);
		FileOutputStream fo=new FileOutputStream(f2);
		BufferedOutputStream bof=new BufferedOutputStream(fo);
		BufferedInputStream bis=new BufferedInputStream(fi);
		byte[] buffer=new byte[1024];
		int off=0;
		int length=1024;
		while(true){
			if(fi.available()<1024){
				length=fi.available();}
		bis.read(buffer, off, length);
		bof.write(buffer, off, length);
//		fi.read(buffer, off,length);
//		fo.write(buffer, off, length);
		if(length<1024){
			System.out.println(f1+"-->"+f2+"复制完成！");
			bof.flush();
			fi.close();
			fo.close();
			return;}
		}
		
	}
   
}