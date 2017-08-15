package com.mengxs.demo19;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f=new File("E:\\qf资料\\孟祥顺\\diamai\\第十九天\\happy.txt");
			FileOutputStream fo=new FileOutputStream(f);
			OutputStreamWriter od=new OutputStreamWriter(fo);
			BufferedWriter bw=new BufferedWriter(od);
		    Random r=new Random();
		   
		    for(int i=0;i<50;i++){
		    	bw.write(String.valueOf(r.nextInt(100)));
		    	bw.newLine();
		    }
		    for(int i=0;i<50;i++){
		    	
		    	bw.write(String.valueOf(r.nextDouble()));
		    	bw.newLine();
		    }
		    bw.flush();
		    bw.close();
		    byte[] a=new byte[1024];
		    int len=0;
		    FileInputStream fis=new FileInputStream(f);
		    ByteArrayOutputStream bos=new ByteArrayOutputStream();
		    while((len=fis.read(a))!=-1){
		    	bos.write(a,0,len);
		    }
		    byte[]data=bos.toByteArray();
		//    ByteArrayInputStream bis=new ByteArrayInputStream(a);
		    System.out.println(new String(data));
		    bos.close();
		    
	}

}
