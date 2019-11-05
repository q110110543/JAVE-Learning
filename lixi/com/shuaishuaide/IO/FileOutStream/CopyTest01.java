package com.shuaishuaide.IO.FileOutStream;

import java.io.*;

public class CopyTest01 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\largeW.txt");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\largeE.txt");
		
		
		//固定的读入写法
		byte[] bytes = new byte[1024];
		
		int temp = 0;
		
		while((temp = fis.read(bytes)) != -1){
			fos.write(bytes,0,temp);
		}
		
		
		fos.flush();
		
		fis.close();
		fos.close();
		
	}

}
