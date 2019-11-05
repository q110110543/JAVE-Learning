package com.shuaishuaide.StringTest;

public class BaoZHuan {

	public static void m1 (Object o){
		
		System.out.println(o);
		
	}
	
	
	public static void main(String[] args) {
		
		byte b = 10;
		
		Byte b1 = new Byte(b);
		
		m1(b1);
		m1(b);
		
		String s;
		
		char[] c = {'1','2'};
		
		System.out.println(s = (c+" /e"));//c的数据类型并没有因为print被转换，仍然是Char[],但字符串链接运算调用了c的Objec 的toString方法，返回了c保存的内存地址，再连接；
											//所以给s赋值毫无问题。
		
		
	}

}
