package com.shuaishuaide.IO.FileReader;

import java.io.*;

public class FileReaderTest01 {//固定套路的模板

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try{
			
			fr = new FileReader("C:/Users/Administrator/Desktop/myeclipse/lixi/com/shuaishuaide/IO/FileReader/FileReaderTest01.java");
			
			char[] chars = new char[512];//现在应该以char数组的方式//512才是1kb；
			
			int temp = 0;
			
			if((temp = fr.read(chars)) != -1){
				System.out.println(new String(chars,0,temp));				
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}finally{
			
			try{
				if(fr != null){
					fr.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		
	}

}
