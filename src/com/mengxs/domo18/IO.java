package com.mengxs.domo18;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;


public class IO {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method tub
		String pathname="E:\\py\\abc.txt";
		File file1=new File(pathname);
		FileOutputStream out= new FileOutputStream(file1,true); //追加
		for(byte i='a';i<='z';i++){
			out.write(i);
		}
		out.write("\r\n".getBytes());
		for(byte i='0';i<='9';i++){
			out.write(i);	
		}
		
		out.write(0);
	}

}
