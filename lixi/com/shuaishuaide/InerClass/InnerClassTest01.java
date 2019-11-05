package com.shuaishuaide.InerClass;

import com.shuaishuaide.InerClass.InnerLei.InnerClass2;

public class InnerClassTest01 {

	public static void main(String[] args) {
		
		InnerLei.InnerClass.m3();
		
		InnerLei.InnerClass inner1 = new InnerLei.InnerClass();//必须前面带有外部类。
		
		//InnerClass inner2 =new InnerLei.InnerClass();
		
		inner1.m4();
		inner1.m3();//采用实列方法也可以调用；但应该用静态方法。
		
		InnerLei outer1 = new InnerLei();//先创建外部对象。
		
		InnerClass2 inner2 = outer1.new InnerClass2();//创建内部类，真是复杂的过程呀。
		
		inner2.m4();
		
		outer1.m5();
		
		

		
	}

}
