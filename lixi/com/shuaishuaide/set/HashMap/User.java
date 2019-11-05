package com.shuaishuaide.set.HashMap;

import java.util.*;
import java.lang.*;

class User  {

	String age; 
	String name;
	
	User(String age){
		
		this.age = age;
		this.name = name;
	}
	
	public String toString(){
		return "User[age="+age+"]";
		
	}
	/*
	public int compareTo(Object o) {//这里必须实现comparable的comparTo方法，treeSet必需要求有序排序。
		int age1 = this.age;
		int age2 = ((User) o).age;
		
		return age1 -age2;
		}
	*/
	
	public boolean equals(Object o){//重写equals方法
		
		if(this==o){
			return true;
		}if(o instanceof User){
			User u  = (User) o;
			if(u.age.equals(this.age)){
				return true;
			}
		}return false;
	}
	
	public int hashCode(){
		return age.hashCode();//已经被String重写了hashcode方法了
	}
}

