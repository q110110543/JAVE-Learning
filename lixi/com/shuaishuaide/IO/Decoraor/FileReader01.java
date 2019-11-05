package com.shuaishuaide.IO.Decoraor;

public class FileReader01 extends Reader01 {//被装饰者
	
	public void close(){
		
		System.out.println("哈哈已经被执行");
	}

}
