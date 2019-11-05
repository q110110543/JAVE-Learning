package com.shuaishuaide.IO.FileOutStream;

import java.io.*;

//创建输入与输出流的格式一般都比较固定

public class OutStreamTest01 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;//声明应该放在外面
		
		try{//创建文件输出流也必须处理异常
			fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\T2.txt",true);//文件格式会自动忽略大小写。//这种方式会自动覆盖以前的内容,加true就是在文后添加
			//此时在try内开始写入数据
			String msg = "HelloWorld!";
			
			byte[] bytes = msg.getBytes();
			
			fos.write(bytes,0,3);//只写入一部分且不包括最后的那一部分
			
			fos.flush();//保证数据强制写入；
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try{
					fos.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}

	}

}
