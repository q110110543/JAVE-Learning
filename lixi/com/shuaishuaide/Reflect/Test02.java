package com.shuaishuaide.Reflect;
/*
 * io与properties
 * 配置文件使得程序更加零活，可变的东西建议写在配置文件中，不写死在文件中。
 * dbinfor这样有特殊内容的文件叫做属性文件，java规范中要求属性文件以“.properties”结束，一看就知道写的key和valus。//非必须//等号/冒号/空格也可以，谁出现第一个算谁
 * 用native2ascil转中文
 */
import java.util.*;
import java.io.*;

public class Test02 {
	
	public static void main(String[] args) throws IOException{
		
		Properties p = new Properties();//与map一样，全字符串，Key不能重复，否则覆盖
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\dbinfor.properties");//这里要抛出异常
		
		//fis流中的所有数据加载到属性对象
		p.load(fis);//这里也有异常
		
		String v = p.getProperty("username");
		
		System.out.println(v);//不需要重新编译就能运行程序。key不能动
		
		//就三句程序
	}

}
