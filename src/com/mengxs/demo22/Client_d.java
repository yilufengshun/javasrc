package com.mengxs.demo22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_d {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				Socket client=new Socket("10.0.127.195",12345);
				System.out.println("lianjie");
				String line="";String str="";String s2="";
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				BufferedReader br2=new BufferedReader(new InputStreamReader(client.getInputStream()));
				while(true){
					line = br.readLine();
					bw.write(line);
					bw.newLine();
					bw.flush();
					s2=br2.readLine();
					System.out.println(s2);
					if("over".equals(line)){
						System.out.println("exit");
						break;
					}
					
				}
				br.close();
				bw.close();
	}

}
