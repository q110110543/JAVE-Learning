package com.shuaishuaide.Thread.Protect;

public class Processor extends Thread{
	
	public void run(){
		int i = 0;
		
		while(true){//由于改为了守护线程，main()那边运行完毕后就不会继续执行了，所以True式有条件的
			
			System.out.println(Thread.currentThread().getName() + "--->" + i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
