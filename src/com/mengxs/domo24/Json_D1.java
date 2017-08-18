package com.mengxs.domo24;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json_D1 {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		String json1 = "{name:'张三',age:20,sex:'男'}";

		String json2="{person:{name:'cindy',age:12,sex:'女',address:'北京'}}";

		String json3= "{key1:value1,key2:value2,key3:value3}";

		String json4 = "{name:'zhangsan',age:20,dept:{no:1,name:'JAVA开发部'}}";
				
		String json5= "[{name:'zhangsan',age:20},{name:'lisi',age:21},{name:'wangwu',age:22}]";

		String json6 = "{persons:[{name:'zhangsan',age:20},{name:'lisi',age:21},{name:'wangwu',age:22}] }";
		
		JSONObject j1=new JSONObject(json1);
		String name=j1.getString("name");
		System.out.println(name);
		System.out.println(j1.getInt("age"));
		System.out.println(j1.getString("sex"));
		JSONObject j2=new JSONObject(json2);
		JSONObject j21=j2.getJSONObject("person");
		System.out.println(j21.getString("name")+j21.getString("age")+j21.getString("sex")+j21.getString("address"));
	//迭代器
		JSONObject j3=new JSONObject(json3);
		Iterator it=	j3.keys();//得到迭代器
		while(it.hasNext()){
			//得到key
			Object ob=it.next();
			System.out.print("--"+ob.toString()+":");
			Object value=j3.get(ob.toString());
			System.out.println(value);
		}
	JSONObject j4=new JSONObject(json4);
	//建立类，将数据填充
	Person p4=new Person();
	Dept d4=new Dept();
	p4.setName(j4.getString("name"));
	p4.setAge(j4.getInt("age"));
	JSONObject j41=j4.getJSONObject("dept");
	d4.setNo(j41.getInt("no"));
	d4.setName(j41.getString("name"));
	p4.setDept(d4);
	System.out.println(p4);
	//
	System.out.println("----------------------");
	JSONArray j5=new JSONArray(json5);
	for(int i=0;i<j5.length();i++){
		JSONObject jo=j5.getJSONObject(i);
		System.out.println(jo.getString("name")+","+jo.getString("age"));
	}
	
	System.out.println("------------------------");
	JSONObject j6=new JSONObject(json6);
	JSONArray j61=j6.getJSONArray("persons");
	for(int i=0;i<j61.length();i++){
		JSONObject jo=j61.getJSONObject(i);
		System.out.println(jo.getString("name")+","+jo.getString("age"));
	}
	
	
	
	}

}
