package com.mengxs.demo22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_d {

	public static void main (String[] args) throws IOException  {
		// TODO Auto-generated method stub
			ServerSocket server =new ServerSocket(12345);
			System.out.println("dnegdai lian jie");
			Socket[] s=new Socket[10];
			Thread_S[] t=new Thread_S[10];
			
				for(int i=0;i<10;i++){
					s[i]=server.accept();
			//链接成功
			
				 t[i]=new Thread_S(s[i]);
				t[i].start();
				
			}
			}
	}


