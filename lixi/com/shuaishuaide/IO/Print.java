package com.shuaishuaide.IO;

import java.io.*;
import java.util.*;
import java.text.*;

public class Print {
//默认打印到控制台
	public static void main(String[] args) throws Exception {
		
		System.out.println("haha");
		
		PrintStream ps = System.out;
		
		ps.println("java.....");
		
		System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\log.txt")));//这里必须看api文档
		
		//setOut改变输出方向，PrintStream接收OutputStream但是因为是抽象的，所以new一个FileOutputStream;
		
		System.out.println("hahahahhaha");//打印的文件就进入log日志文档了。
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		
		System.out.println("m1方法开始运行时间 "+ sdf.format(new Date()));
		
		m1();
		
		System.out.println("m1方结束运行时间 "+ sdf.format(new Date()));//基本上不需要1mm； 
		
		
	}
	
	public static void m1(){
		System.out.println("m1 method execute!");
	}

}
