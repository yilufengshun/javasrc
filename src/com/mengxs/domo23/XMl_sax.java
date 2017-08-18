package com.mengxs.domo23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XMl_sax {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
			MyHandle handle=new MyHandle();
		
		
		
			SAXParserFactory factory=SAXParserFactory.newInstance();
			SAXParser parser=factory.newSAXParser();
			
			
			parser.parse("C:\\Users\\meng\\Desktop\\student.xml", handle);
			ArrayList<Student> al=handle.getlist();
			Iterator it=al.iterator();
			while(it.hasNext()){
				Student s=(Student) it.next();
				System.out.println(s);
			}
	}

}
