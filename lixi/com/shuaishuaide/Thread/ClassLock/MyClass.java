package com.shuaishuaide.Thread.ClassLock;

public class MyClass {
	
	
	//synchronized加到静态方法上，线程执行此方法的时候会找类锁。
	public synchronized static void m1() {//类锁与对象无关，
		
		try{Thread.sleep(5000);}catch(Exception e){}
		
		System.out.println("m1...");
		
	}
	/*
	public static void m2(){
		System.out.println("m2...");//m2()不会等待m()执行，与成员方法是一样的，
	}
	*/
	public synchronized static void m2(){//现在就必然会等待了，类锁只有一把，必须等待，类锁与对象锁都是很大的，能覆盖整个类与对象，那类锁与代码锁呢？
		System.out.println("m2...");
	}

}
