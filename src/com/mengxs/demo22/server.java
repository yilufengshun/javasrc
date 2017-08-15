package com.mengxs.demo22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				ServerSocket server = new ServerSocket(11111);
				//创建服务器端
				
				Socket socket=server.accept();
				System.out.println("prot"+socket.getPort()+"add"+socket.getInetAddress());
				File file=new File("chat.txt");
				FileWriter fw=new FileWriter(file);
				//3操作流
				String str="";
				String sr="";
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream())); 
				BufferedReader sys =new BufferedReader(new InputStreamReader(System.in)); 
				while(true){
					if(sys.ready()){
						str=sys.readLine();
						bw.write(str);
						bw.newLine();
						bw.flush();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String time=sdf.format(System.currentTimeMillis());
						
						fw.write(time+":server:"+str+"\t\n");
						fw.flush();
					}
				if(br.ready()){
					sr=br.readLine();
				System.out.println(sr);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time=sdf.format(System.currentTimeMillis());
				
				fw.write(time+":client:"+sr+"\t\n");
				fw.flush();
				
				}
				
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
