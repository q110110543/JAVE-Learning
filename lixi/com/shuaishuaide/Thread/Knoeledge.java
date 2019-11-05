package com.shuaishuaide.Thread;

/*
 * 1.线程指进程中的一个场景，每个进程是一个应用程序，有独立的内存空间
 * 2.同一个进程中的线程共享器进程中的内存和资源——堆内存与方法区内存共享，栈内存不共享
 * 3.单核的计算机只在不同进程之间高速频繁切换，同一个时间点不能运行不同的进程，只有双核或者多核才可以多进程。
 * 4.多进程作用不是提高执行速度，而是为了提高CPU的使用率
 * 5.进程与进程间的内存是独立的
 * 6.线程是一个进程中的执行场景，一个进程可以启动多个线程，多线程是为了提高应用程序的使用率而不是为了提高执行速度。
 * 
 * JAVA的运行原理
 * 
 * 1.启动JVM相当于启动一个进程，启动一个应用程序，该程序会自动启动一个“主线程”，然后主线程会调用某个类的main方法，main方法运行在主线程中。在此之前的所有程序都是单线程的。
 * 2.线程的调度与控制
 * 3.优先级：10 MAX_PRIORITY 5 NORM_PRIORITY  0 MIN_PRIORITY
 * 
 *  */






//以下程序只有一个进程，就是主线程，没有启动其他线程，不会分布新的栈空间。


public class Knoeledge {

	public static void main(String[] args) {
		
		m1();
		
	}
	public static void m1(){
		m2();
	}
	public static void m2(){
		m3();
	}
	public static void m3(){
		System.out.println("haha");
	}
	

}
