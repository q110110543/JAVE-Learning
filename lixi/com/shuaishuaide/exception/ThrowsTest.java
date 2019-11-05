package com.shuaishuaide.exception;

import java.io.*;
public class ThrowsTest {
	
	public static void main(String[] args){
		
		try{
			m1();
			
			
			
		}catch(IOException e){
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
					
		}
			
		
		System.out.println("hehe");
	}
	
	public static void m1()throws IOException{
		m2();
	}

	public static void m2() throws IOException{
		
		m3();
	}
	
	public static void m3() throws IOException{
		FileInputStream fis = new FileInputStream("dkaa"); 
		
		fis.read();
		
	}
	
}
