package com.shuaishuaide.finallyo;

public class HandException {
	
	public void register(String name)	throws IllegalNameException {
		
		if(name.length()<6){
			
			throw new IllegalNameException("用户名长度不能少于6位数！");
		}
		
		System.out.println("注册成功！");
	}
}
