package com.shuaishuaide.ArrarTest;

public class ArrayTest03 {
	public static void main(String[] args){
		
		if(args.length != 2){
			System.out.println("请输入用户名与密码");
			return;
		}
		String username = args[0];
		String password = args[1];
		if("admin".equals(username) && "123".equals(password)){//可以避免空指针异常
			
			System.out.println("登录成功！");
		}else{
			System.out.println("账户密码错误！");
		}
		
	}
}