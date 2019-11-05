package com.shuaishuaide.Thread;

public class Processor03 implements Runnable {
	
	public void run(){
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());//Êä³ö Thread-0
	}
	
}
