package com.shuaishuaide.Thread.Dead;

public class T2 implements Runnable {
	
	Object o1;
	Object o2;
	
	T2(Object o1,Object o2){
		this.o1 = o1;
		this.o2 = o2;
	}
	
	public void run(){
		
		synchronized(o2){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized(o1){}
		}
		
		
	}
	

}
