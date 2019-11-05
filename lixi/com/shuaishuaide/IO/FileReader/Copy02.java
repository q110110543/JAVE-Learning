package com.shuaishuaide.IO.FileReader;

import java.io.*;

public class Copy02 {//自己写的文件复制流，只能复制纯文本文件

	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		FileReader fr = null;
		
		BufferedReader br = null;
		
		try{
			
			fr = new FileReader("C:\\Users\\Administrator\\Desktop\\temp01.txt");//节点流
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\temp02.txt");
			
			br = new BufferedReader(fr);//包装流或者处理流
			/*
			int temp = 0;
			
			char[] chars = new char[502];
			
			while((temp = br.read(chars)) != -1){
				fw.write(chars, 0, temp);
				
				
			}
			*/
			String temp2 = null;//注意是String
			
			while((temp2 = br.readLine()) != null){//br.readLine（）方法不自带换行符
				System.out.println(temp2);//输出一行
			}
			
			fw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fw != null){
					fw.close();
				}//if(fr != null){
					//fr.close();
				//}只关闭最外层就可以了，23种设计模式，装饰者模式
			if(br != null){
					br.close();
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
