package com.shuaishuaide.Thread.XianCHnegtongbu2;

//是对象的锁不是方法的锁。所以方法被加锁了，只要是同一个对象，其他对象内被加锁的都只能等待拿到对象锁才能后续继续执行。

public class MyClass {
	
	public synchronized void m1(){//采用的是两个方法来实现，而不是两个类实现。比我的代码重用性要好很多
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1.....");
		
	}
	/*
	public void m2(){
		System.out.println("m2.....");
	}
	*/
	public synchronized void  m2(){//必然是m1()执行完毕后在执行下一步的m2()；
		System.out.println("m2.....");
	}

}
