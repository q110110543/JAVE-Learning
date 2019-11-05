package com.shuaishuaide.IO.File;

//File是文件和目录路径名的抽象表示
//代表硬盘上的文件夹和文件

import java.io.*;
import java.util.*;
import java.text.*;

public class Test01 {

	public static void main(String[] args)throws Exception{
		
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\temp06.DBF");
		
		System.out.println(f1.exists());
		
		File f4 = new File("C:/TT");//创建文件目录
		
		//f4.mkdir();
		
		f4.createNewFile();
		
		File f5 = new File("c:/a/b/d/e/f/g");
		
		if(!f5.exists()){
			f5.mkdirs();//创见多重目录
		}
		
		File f2 = new File("Test01");
		
		String absolutePath = f2.getAbsolutePath();
		
		System.out.println(absolutePath);
		
		String temp = null;
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO\\File\\Test01.java");
		
		File f6 = new File("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO\\File\\Test01.java");
		
		System.out.println(f6.getName());
		
		BufferedReader br = new BufferedReader(fr);
		
		while((temp = br.readLine()) != null){
			//System.out.println(temp);
		}
		
		Date t = new Date(f6.lastModified());//将long类型转化为时间与日期;确定文件最后编辑时间
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		
		File f7 = new File("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO");
		
		File[] fs = f7.listFiles();//返回的是一个数组
		
		for(File f:fs){//增强for循环
			//System.out.println(f.getAbsolutePath());//加不加getAbsolutePath()都会打印绝对路径；		
			if(f.getAbsolutePath().endsWith(".java")){//这个endsWith()是String的方法，//看来还需要把常用API掌握熟悉。
				System.out.println(f.getAbsolutePath());
			}
		}
		
	}

}
