package com.shuaishuaide.Thread;

public class SleepTest01 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new SleepThread();
		
		t1.setName("t1");
		t1.start();//一停一停的吐数字，耗时10秒
		/*
		for(int i = 0; i<10; i++){
			System.out.println("main---->" + i);
			try {//此处main()方法可以使用throws
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//仍然是不均匀的抢劫
			}
			
		}
		
		t1.sleep(5000);//静态方法用引用区调用，不会去调用processor()对象，效果相当于Thread.sleep(),就是main()方法被sleep了，仍然是当前线程，而不是t1。
		
		System.out.println("haha");
		
		Astatci a = null;
		
		a.m1();//这里不会报空指针异常，m1()方法是静态的，与对象无关；编译阶段看的a，运行阶段还是类名的A，运行的是A.m1(),是通过类名来运行的
		*/
//=============================================
		//线程打断
		
		Thread .sleep(5000);//五秒后打断t的休眠
		
		t1.interrupt();//利用异常处理机制打断sleep
		
		Astatci a = null;
		
		a.m1();
//=============================================
		//正常的线程打断
		
		JianGeYiMiao jg = new JianGeYiMiao();
		
		Thread t3 = new Thread(jg);
		
		t3.setName("t3");
		
		t3.start();
		
		Thread.sleep(5000);
		
		jg.run = false;
//=============================================
		//线程合并，语法出现在哪个线程就和哪个线程合并，变成了一个栈区join()是一个成员方法，必须引用.的方式去调用。
		
		
		JianGeYiMiao jg2= new JianGeYiMiao();
		
		Thread t4 = new Thread(jg);
		
		t4.setName("t3");
		
		t4.start();
		
		t4.join();//此时t4和主线程合并，t4运行完毕后下面的for循环才会进行。
		
		for(int i = 0; i<10; i++){
			System.out.println(Thread.currentThread().getName() + "--->" + i);
			}
		
		
	}

}
