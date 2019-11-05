package com.shuaishuaide.Thread.Dead;

public class DeadLock {
	 
	public static void main(String args){
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		Thread t1 = new Thread(new T1(o1, o2));//T1”ÎT2π≤œÌO1∫ÕO2
		Thread t2 = new Thread(new T2(o1, o2));
		
		t1.start();
		t2.start();
	}
	
}
