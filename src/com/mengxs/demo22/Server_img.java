package com.mengxs.demo22;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_img {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket server =new ServerSocket(12345);
		Socket socket=server.accept();
		File file=new File("C:\\Users\\meng\\Desktop\\1.jpg");
		FileOutputStream fs=new FileOutputStream(file);
		BufferedOutputStream bos=new BufferedOutputStream(fs);
		InputStream fps=socket.getInputStream();
		byte[] buffer=new byte[1024];
		while(fps.read(buffer)>-1){
			fs.write(buffer);
		}
//		while(fps.read(buffer)>-1){
//			fs.write(buffer);
//		}
		System.out.println("==");
		
	}

}
