package com.shuaishuaide.IO.ObjectStream;

import java.io.Serializable;//可序列化接口，内部没有任何一个方法，称为标志接口，如java.lang.Cloneable

public class User implements Serializable {
	
	String name;
	
	User(String name){
		
		this.name = name;
		
	}
	public String toString(){
		return "User[name="+name+"]";
	}

}
