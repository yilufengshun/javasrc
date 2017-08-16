package com.mengxs.domo23;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Spliterator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class JsonC {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			String path="http://m2.qiushibaike.com/article/list/suggest?page=1";
			//新建url
			URL url=new URL(path);
			//连接http,打开链接
			HttpURLConnection con=(HttpURLConnection) url.openConnection();
			//强转一下
			con.setRequestMethod("GET");
			//设置请求方式
			con.setConnectTimeout(5000);//超时时间
			con.connect();
			//连接
			//判断是否连接成功
			if(con.getResponseCode()==200){
				//获取流，下载到本地
				InputStream is=con.getInputStream();
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				byte[] buffer=new byte[1024];
				int len=0;
				while((len= is.read(buffer))!=-1){
					baos.write(buffer,0,len);
					
				}
				String res=baos.toString();
				//System.out.println(res);
				//处理
				baos.close();
				JSONObject ja=(JSONObject) JSON.parse(res);
				JSONArray js=ja.getJSONArray("items");
				Iterator it=js.iterator();
				while(it.hasNext()){
					JSONObject jo=(JSONObject) it.next();
					System.out.println(jo.getString("content"));
				}
				//fastjson使用的是jsonobject来得到数据
					
				
				
				
				
				
				
						
//				Iterator<Object> it = ja.iterator();
//				while (it.hasNext()) {
//				JSON ob = (JSON) it.next();
//				System.out.println(ob);
//				}
	//关闭流
			}
		con.disconnect();	
	}

}
