package com.shuaishuaide.Thread.ClassLock;

public class Processor implements Runnable{
	
	public void run(){//没有用到对象，是类名点的方式取调用。本程序没有增加MyClass的属性。
		
		if("t1".equals(Thread.currentThread().getName())){
			MyClass.m1();
		}
		if("t2".equals(Thread.currentThread().getName())){
			MyClass.m2();
		}
	}

}
