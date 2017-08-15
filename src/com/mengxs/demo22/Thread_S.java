package com.mengxs.demo22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Thread_S extends Thread{
		Socket socket;
		BufferedWriter bw;
		BufferedReader br;
		public Thread_S(Socket socket){
			this.socket=socket;
		}
		@Override
		public void run() {
			kaixiancheng();
		}
		public void kaixiancheng(){
			String line="";
			System.out.println(socket.getInetAddress());
			try {
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while(true){
				try {
					line =br.readLine();
					System.out.println("k:"+line);
				bw.write("ECHO:"+line);
				bw.newLine();
				bw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("cuowu");
					e.printStackTrace();
				}
			}
		}
}
