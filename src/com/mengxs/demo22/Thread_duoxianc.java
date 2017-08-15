package com.mengxs.demo22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Thread_duoxianc extends Thread{
			Socket socket;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				qidong();
			}
		void qidong(){
			try {
				System.out.println(socket.getInetAddress()+"链接！");
				String str="";
				String sr="";
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream())); 
				BufferedReader sys =new BufferedReader(new InputStreamReader(System.in)); 
				while(true){
					if(sys.ready()){
						str=sys.readLine();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String time=sdf.format(System.currentTimeMillis());
						bw.write(time);
						bw.newLine();
						bw.write(str);
						bw.newLine();
						bw.flush();
						
						
					}
				if(br.ready()){
				sr=br.readLine();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time=sdf.format(System.currentTimeMillis());
				System.out.println(time+":"+sr);
				bw.write(time+":"+br);
				bw.newLine();
				bw.flush();

				}
				
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
		public Thread_duoxianc(Socket socket) {
			super();
			this.socket = socket;
		}
		}	
			
			

