package com.shuaishuaide.Thread;
/*
 * 多线程第一种方式：
 *  第一步：继承 java.lang.Thread;
 *  第二步：重写run方法
 */


public class ThreadTest01 {

	public static void main(String[] args) {
		
		
		//这里就是创建一个线程；
		Thread t = new ThreadCreate();
		//这里是启动一个线程；
		t.start();//Thread内的方法//执行瞬间结束，告诉JVM虚拟机，分配一个新的栈给t线程。系统线程启动之后自动调用run方法。
		
		//t.run()的话，就是在main()方法中运行，新的线程就不会启动，就不会分配新的栈，run()方法不结束下面的for循环就不会执行，所以下面的main循环一定在run循环的 后面		
		
		for(int i=0; i<10;i++){
			System.out.println("main-->" + i);
		}

	}

}
//main方法结束，程序不一定结束，main方法结束只是主线程栈弹空，主线程栈中没有方法栈针了//但是其他线程和其他栈中还有栈针，main方法结束后程序可能会还在运行