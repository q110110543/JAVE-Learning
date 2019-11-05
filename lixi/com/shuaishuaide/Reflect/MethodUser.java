package com.shuaishuaide.Reflect;

public class MethodUser {

	public boolean logIn(String name,String pwd){
		if("admin".equals(name) && "123".equals(pwd)){
			return true;
		}
		
		return false;
	}
	public void logOut(){
		System.out.println("ÍË³öÁË");
	};
}
