package com.shuaishuaide.Thread.Protect;

/*
 * 所有的用户线程结束生命周期，守护线程才会结束生命周期，垃圾回收器就是一个守护线程。除了主线程以外，JVM会自动启动一个垃圾回收器线程，
 * 守护线程一般都是无限执行的
 */

public class ShouHuXianCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Processor();
		
		t1.setDaemon(true);
		
		t1.setName("t1");
		
		t1.start();
		
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}

	}

}
