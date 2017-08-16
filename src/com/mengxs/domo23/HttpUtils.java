package com.mengxs.domo23;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpUtils {
		public static byte[] downloadfile(String path){
			URL url = null;
			HttpURLConnection con = null;
			InputStream is = null;
			try {
				url = new URL(path);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con = (HttpURLConnection)url.openConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//设置本次请求的方式
			try {
				con.setRequestMethod("GET");
			} catch (ProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//get请求
			con.setConnectTimeout(5000);//设置连接超时
			con.setDoInput(true);//是否打开输出流，默认true
			con.setDoOutput(false);//是否打开输出流
			try {
				con.connect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//4,判断请求是否成功
			int code;
			try {
				code = con.getResponseCode();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(con.getResponseCode()== 200){
					//5获取数据
					
					try {
						is = con.getInputStream();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ByteArrayOutputStream baos=new ByteArrayOutputStream();
					byte[] buffer=new byte[1024];
					int len=0;
					while((len= is.read(buffer))!=-1){
						baos.write(buffer,0,len);

					}
					return baos.toByteArray();
				
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}return null;
}
		}
