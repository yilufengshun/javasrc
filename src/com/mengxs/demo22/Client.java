package com.mengxs.demo22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		//创建客户端的socket
		

		try {
			Socket socket =new Socket("10.0.127.195",25541);
			//2获取io流

			//3操作流
			String str="";
			String st="";
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			BufferedReader sys =new BufferedReader(new InputStreamReader(System.in)); 
			while(true){
				if(sys.ready()){
					str=sys.readLine();
					bw.write(str);
					bw.newLine();
					bw.flush();
				}
			if(br.ready()){
				st=br.readLine();
			System.out.println(st);
			}
			if("exit".equals(str)){
				System.out.println("exit!");
				break;
			}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
	
}
}
