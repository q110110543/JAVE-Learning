package com.shuaishuaide.Reflect;

import java.util.*;


public class KeBianChangCanShu {
	
	public static void m1(int... a){//可变长参数。
		System.out.println("Test");
	}
	public static void m1(int i){//如果有精确匹配的调精确匹配方法，不会执行可变长参数。
		System.out.println(i);
	}
	public static void m2(String... args){//可以视为数组
		for(int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	public static void m3(Class...args) throws InstantiationException, IllegalAccessException{
		for(int i=0; i<args.length;i++){
			Class c = args[i];
			System.out.println(c.newInstance());//这里要抛出异常,有无参方法直接调用无参方法，否则使用未改变的toString方法
		}
	}
	//可变长参数只能放在最后位置，只能出现一次
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		m1(1);
		m1(1,2);
		m1();
		m2("唱","跳","rap","篮球");
		m3(Date.class,Emplore.class);
	}

}
