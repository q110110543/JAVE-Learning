package com.shuaishuaide.IO.FileInputStream;

import java.io.*;

public class FIStreamTest01 {

	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		
		try{
			String  filepath = "C:\\Users\\Administrator\\Desktop\\1.jpg";//把单斜线换成双斜线，避免转义符，这是绝对路径写法
			
			fis = new FileInputStream(filepath);//有异常必须再编译期进行处理
			
			int i1 = fis.read();//以字节的方式读取
			int i2 = fis.read();//自动读取下一个
			int i3 = fis.read();
			int i4 = fis.read();
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println(i4);
		}catch(FileNotFoundException e){
			
			e.printStackTrace();//详细的异常内容
		}catch(IOException e){
			e.printStackTrace();//处理的是read的异常并且必须放在FileNotFoundException下面
		}finally{
			
			if(fis!=null){
				try{fis.close();//关闭也必须处理异常
				}catch(IOException e){					
					e.printStackTrace();			
				}				
			}			
		}		
	}

}
