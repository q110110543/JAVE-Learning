package com.shuaishuaide.finallyo;

import java.io.*;

public class Try_Catch {
		
	public static void main(String[] args){
		
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("Try_Catch.java");//创建对象失败，则fis任然是空，if的try不会执行
			
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
		
		}finally{
			
			if(fis!= null){
				try{
					fis.close();
				
				}catch(IOException e){
					
					e.printStackTrace();
				}
			}
		}
	}
}
