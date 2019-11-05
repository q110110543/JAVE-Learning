package com.shuaishuaide.Thread.XianCHnegtongbu2;

public class ThreadTest {//m1....没有结束的时候，m2...可以自己执行

	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		//MyClass mc2 = new MyClass();
		
		Processor p = new Processor(mc);
		//Processor p2 = new Processor(mc2);
		
		Thread t1 = new Thread(p);
		t1.setName("t1");
		Thread t2 = new Thread(p);
		t2.setName("t2");
		
		//Thread t3 = new Thread(p2);
		//t2.setName("t2");//这里不共享同一个对象，是不同的线程，所以t1与t3间不会相互等待；
		
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
	}

}
