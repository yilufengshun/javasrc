package com.mengxs.domo23;

import java.awt.event.FocusAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpurlC {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//try需要将变量提取到try外面
		String path="https://img.581gg.com/girl/TGOD/249/09.jpg";
		URL url=new URL(path);
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		//设置本次请求的方式
		con.setRequestMethod("GET");//get请求
		con.setConnectTimeout(5000);//设置连接超时
		con.setDoInput(true);//是否打开输出流，默认true
		con.setDoOutput(false);//是否打开输出流
		con.connect();
		//4,判断请求是否成功
		int code = con.getResponseCode();
		System.out.println(code);
		if(code== 200){
			//5获取数据
			InputStream is=con.getInputStream();
			String name=path.substring(path.lastIndexOf('/')+1);//截取/之后的位置
			FileOutputStream fos=new FileOutputStream(new File(name));
			byte[] buffer=new byte[1024];
			int len=0;
			while((len=is.read(buffer))!=-1){
				fos.write(buffer, 0, len);
			}
			fos.close();
		}
	
	}

}
