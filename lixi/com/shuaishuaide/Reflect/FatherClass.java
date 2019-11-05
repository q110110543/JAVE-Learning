package com.shuaishuaide.Reflect;

//获取父类和父接口；

import java.lang.reflect.*;

public class FatherClass {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		
		Class superClass = c.getSuperclass();
		
		System.out.println(superClass.getName());
		System.out.println("==========");
		
		Class[] ins = c.getInterfaces();//注意返回的是Class不是Interface
		
		for(Class in: ins){
			
			System.out.println(in.getName());
		}
		
	}

}
