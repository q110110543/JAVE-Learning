package com.shuaishuaide.Thread;

//定义一个线程，继承Thread

public class ThreadCreate extends Thread {
//重写run方法	
	public void run(){
		for(int i = 0; i<100; i++){
			System.out.println("run-->" + i);
		}
	}

}
