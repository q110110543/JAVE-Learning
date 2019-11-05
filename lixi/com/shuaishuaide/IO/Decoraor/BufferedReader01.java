package com.shuaishuaide.IO.Decoraor;

public class BufferedReader01 extends Reader01 {//装饰者中含有被装饰者的引用，装饰者与被装饰者应该实现同一个抽象类型
	
	Reader01 reader;//这里就不用写具体类型了，写抽象的类型就可以了，这个时候就存在多态了
	
	BufferedReader01(Reader01 reader){
		
		this.reader = reader;
	}
	
	public void close(){
		
		System.out.println("哈哈再次被执行");
		reader.close();
		System.out.println("确认哈哈被执行");
		
	}
	
	
	

}
