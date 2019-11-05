package com.shuaishuaide.finallyo;

import java.io.*;

public class Try_Catch {
		
	public static void main(String[] args){
		
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("Try_Catch.java");//��������ʧ�ܣ���fis��Ȼ�ǿգ�if��try����ִ��
			
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
