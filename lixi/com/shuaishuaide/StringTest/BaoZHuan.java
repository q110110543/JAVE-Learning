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
		
		System.out.println(s = (c+" /e"));//c���������Ͳ�û����Ϊprint��ת������Ȼ��Char[],���ַ����������������c��Objec ��toString������������c������ڴ��ַ�������ӣ�
											//���Ը�s��ֵ�������⡣
		
		
	}

}
