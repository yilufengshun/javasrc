package hello;

import java.io.File;
import java.util.Arrays;

public class DeleteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				File f=new File("E:\\迅雷下载\\himg2");
				File[] fs=f.listFiles();
				for (File file : fs) {
			
					
						file.delete();
				}
				
	}

}
