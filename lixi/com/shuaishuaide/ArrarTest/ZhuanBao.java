package com.shuaishuaide.ArrarTest;

public class ZhuanBao {

	public static void main(String[] args) {
		
		int b = 100;
		
		Integer b1 = new Integer(b);
		
		Integer a1 = 100;
		
		Integer a2 = 100;
		
		Byte c1 = 100;
		
		Byte c2 = 100;
		
		m1(b1);
		
		System.out.print(b);
		
		System.out.print(b1);
		
		String s = "s a ";
		
		Integer b2 = new Integer(b);
		
		System.out.println(c1==100);
		
		m1(b);//杜聚宾的视频有点过期了。基本数据类型作为参数传入给Object时候会自动装箱。
		
		System.out.println(a1.equals(b)+" e ");//调用equals时会做一个向下转型的判断，是否属于Integer类，所以int型的b已经被包装了。
		
		//Byte会将toString方法重写；
	}
	
	public static void m1(Object o){
		System.out.println(o);
	}

}
