package com.shuaishuaide.Thread.ClassLock;

public class Processor implements Runnable{
	
	public void run(){//û���õ�������������ķ�ʽȡ���á�������û������MyClass�����ԡ�
		
		if("t1".equals(Thread.currentThread().getName())){
			MyClass.m1();
		}
		if("t2".equals(Thread.currentThread().getName())){
			MyClass.m2();
		}
	}

}
