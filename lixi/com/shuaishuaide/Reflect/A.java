package com.shuaishuaide.Reflect;

public class A {
	
	static{
		System.out.println("A...");//静态语句块，类加载时执行，并且只执行一次。
	}
	
	A(){
		System.out.println("haha");
	}
	
}
