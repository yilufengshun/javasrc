package com.mengxs.demo22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;

public class Server_duoxianc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				ServerSocket serverSocket=new ServerSocket(25541);
				HashMap<Socket, Thread_duoxianc> map=new HashMap<>(); 
				while(true){
				Socket s=serverSocket.accept();
				Thread_duoxianc td=new Thread_duoxianc(s);
				map.put(s, td);
				td.start();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
