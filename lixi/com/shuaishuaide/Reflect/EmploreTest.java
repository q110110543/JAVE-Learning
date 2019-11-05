package com.shuaishuaide.Reflect;

import java.util.*;

import java.sql.Date;

public class EmploreTest {

	public static void main(String[] args) throws Exception {
		
		//获取Class对象的三种方式
		Class c1 = Class.forName("com.shuaishuaide.Reflect.Emplore");
		
		Class c2 = Emplore.class;//java中每个对象都有class属性
		
		//任何一个java对象都有一个getClass方法;
		Emplore e = new Emplore("帅帅的鹅");//先创建对象
		Class c3 = e.getClass();//运行时类
		
		System.out.println(c1==c2);
		System.out.println(c3==c2);
		
		Class c4 = Date.class;
		Class c5 = Class.forName("java.util.Date");//必须写类全名,类全民带有包名
		
		Date d = new Date(0);
		Class c6 = d.getClass();
		
	}

}
