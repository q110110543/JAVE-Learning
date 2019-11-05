package com.shuaishuaide.Reflect;

import java.util.*;
import java.io.*;

public class DongTaiDuiXiang {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//1.创建属性对象
		Properties p = new Properties();
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\Classinfo.properties");
		
		p.load(fr);
		
		fr.close();
		
		String className = p.getProperty("className");
		
		System.out.println(className);
		
		//通反射机制创建对象,动态创建对象
		
		Class c = Class.forName(className);//里面必须写详细的包类型
		
		Object o  = c.newInstance();
		
		System.out.println(o);
		
		//使用反射机制降低耦合度。
	}

}
