package com.mengxs.demo17;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.mengxs.zuoye10.Person;



public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer,String> map=new HashMap<>();
			map.put(1, "1asfa3");
			map.put(4, "13adsf");
			map.put(2, "124");
			map.put(2, "124124124");
			System.out.println(map);
			
			//是否包含指定的键
			System.out.println(map.containsKey(1));
			//是否包含指定的值
			System.out.println(map.containsValue("124"));
			//删除返回值
			System.out.println(map.remove(2));
			//查找
			System.out.println(map.get(1));
			Set<Integer>hah=map.keySet();
			Iterator<Integer> i=hah.iterator();
			
			//使用迭代器遍历
			Collection<String>cc=map.values();
			System.out.println(cc);
			//遍历所有数据，一组一组出现
			//System.out.println(map);
			Set<Entry<Integer, String>>set=map.entrySet();
			for(Entry<Integer, String> entry:set){
				System.out.println(entry);
			}
			HashMap<String, Person>map2=new HashMap<>();
			map2.put("a", new Person("ahzngsan", 100));
			map2.put("b", new Person("bbbb", 101));
			System.out.println(map2);
	}

}
