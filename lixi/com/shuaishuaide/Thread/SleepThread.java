package com.shuaishuaide.Thread;

public class SleepThread extends Thread{

		//Thread中的run方法不抛出异常，所以重写run方法后，在run方法的声明位置上不能使用throws，只能try....catch
		public void run(){
			
			for(int i = 0; i<10;i++){
				System.out.println(Thread.currentThread().getName() + "---->" + i);
				
				
				try {//居然要报错
					Thread.sleep(10000000);//当前线程阻断1秒
					System.out.println("这里不会执行，而是catch执行后，跳转到m1()处执行");
				} catch (InterruptedException e) {//被打断后发生此异常
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				m1();//只能try...cathch...
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		public void m1() throws Exception{//这里可以抛出异常，但是m1()那里仍然只能捕捉
			System.out.println("hahahhah我真帅");
		}

}
