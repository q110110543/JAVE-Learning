package com.shuaishuaide.Reflect;

//��ȡ����͸��ӿڣ�

import java.lang.reflect.*;

public class FatherClass {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		
		Class superClass = c.getSuperclass();
		
		System.out.println(superClass.getName());
		System.out.println("==========");
		
		Class[] ins = c.getInterfaces();//ע�ⷵ�ص���Class����Interface
		
		for(Class in: ins){
			
			System.out.println(in.getName());
		}
		
	}

}
