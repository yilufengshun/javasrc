package com.mengxs.domo23;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.xml.crypto.Data;
import javax.xml.namespace.QName;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
//自定义sax解析数据的处理器
//系统自动调用，无需手动调用

public class MyHandle extends DefaultHandler{
		private Student student=null;
		private ArrayList<Student>  list=null;
		private String tag;
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			System.out.println("startE正在解析 "+qName);
			//qname标签名字
			//attributes 标签中的属性（属性名称：属性值）
			//记录当前解析的标签是什么
			//如果对象是根元素，那么创建对象
			if("student".equals(qName)){
				student=new Student();
				System.out.println("创键对象成功");
			}
			tag=qName;
			for(int i=0;i<attributes.getLength();i++){
				String name=attributes.getQName(i);
				String value = attributes.getValue(i);
				if("age".equals(name)){
					student.setAge(Integer.parseInt(value));
				}
			
			}
			
		}
		@Override
		public void startDocument() throws SAXException {
		System.out.println("--------startDocument() ");
		
		//初始化集合对象
		list=new ArrayList<>();
		}
		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
			System.out.println("endElement() ，加入对象");
			//qname正在解析的标签名
			//正在解析的标签如果是student说明当前解析的对象已经组装完成了
			//将对象放入集合中
			if("student".equals(qName)){
			list.add(student);
			}
			tag="";
		}
		@Override
		public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
			System.out.println("(--------endDocument) ");
		
		}
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
			String str=new String(ch, start, length).trim();
			System.out.println("ch="+str);
			if("name".equals(tag)){
				student.setName(str);
			}else if("age".equals(tag)){
				student.setAge(Integer.parseInt(str));
			}
		}
		public ArrayList<Student>     getlist(){
			return list;
		}
}
