package com.shuaishuaide.IO.File;

import java.io.*;

public class ZiDongXunZhaoSuoYouWenJian {

	public static void main(String[] args) {
		
		File f  = new File("D:/");
		
		method1(f);
		
	}
	
	public static void method1(File f){
		
		if(f.isFile()){
			return;
		}
		
		File[] fs = f.listFiles();
		
		for(File subF: fs){
			System.out.println(subF.getAbsolutePath());
			method1(subF);
		}
		
	}
}
