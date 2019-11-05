package com.shuaishuaide.IO.Decoraor;

public class DecortorTest01 {

	public static void main(String[] args) {
		/*
		FileReader01 fr1 = new FileReader01();
		
		BufferedReader01 br01  =new BufferedReader01(fr1);
		*/
		
		BufferedReader01 br01  =new BufferedReader01(new FileReader01());//这就是装饰器，只需关闭外面的流，内部的流不需要关闭
													//存在多态了
		br01.close();
		
	}

}
