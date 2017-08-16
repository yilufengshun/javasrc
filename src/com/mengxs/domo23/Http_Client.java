package com.mengxs.domo23;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * 创建libs文件夹
 * 将jar包放进去
 * 选中所有内容
 * 然后build path
 * @author meng
 *
 */
public class Http_Client {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
			String path="";
			//导包
			//创建httpclient对象
			HttpClient client=new DefaultHttpClient();
			//获取请求方式的对象
			HttpGet httpget=new HttpGet(path);
			//设置请求方式，发起请求,获取响应
			HttpResponse resp=client.execute(httpget);
			//判断请求是否成功
			if(resp.getStatusLine().getStatusCode()==200){
				//获取响应数据   --实体
				HttpEntity entity=resp.getEntity();
				//从响应的实体当中获取流
				InputStream is =entity.getContent();
				//操作数据
				byte[] buffer=EntityUtils.toByteArray(entity);
			}
			
	}

}
