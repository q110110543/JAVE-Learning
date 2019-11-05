package com.shuaishuaide.linkedList;

public class Customer {
	
	String name;
	int age;
	
	Customer(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		
		return "Customer[name="+name+",age="+age+"]";
	}

}
