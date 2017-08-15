package com.mengxs.demo17;

import java.io.File;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathname="E:\\py\\list_img_taobao.txt";
		File file1=new File(pathname);
		System.out.println(file1);
		File file2=new File("E:\\py\\", "0.992387272398.jpg");
		System.out.println(file2);
		System.out.println(file1.getPath());
	}

}
