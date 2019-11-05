package com.shuaishuaide.zhangmoni;

public class User {
	
	String name;
	
	int age;
	
	User(String name,int age){
		
		this.name = name;
		this.age  = age;
		
	}
	public String toString(){
		return "User[name "+name+", age= "+age+"]";
	}
}
