package com.mengxs.demo22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_img {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("10.0.127.56",13456);
		File f=new File("E:\\迅雷下载\\h2\\37780-11.jpg");
		FileInputStream fis=new FileInputStream(f);
		OutputStream os=client.getOutputStream();
		BufferedInputStream bis=new BufferedInputStream(fis);
		byte[] buffer=new byte[1024];
		while(bis.read(buffer)>-1){
			os.write(buffer);
		}
//		while(fis.read(buffer)>-1){
//			os.write(buffer);
//		}
		bis.close();
		os.close();
		System.out.println("--");
	}

}
