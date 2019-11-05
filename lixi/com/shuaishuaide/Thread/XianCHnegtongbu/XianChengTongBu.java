package com.shuaishuaide.Thread.XianCHnegtongbu;

//      ！！！！！线程的同步！！！！！！(加锁)
/*
 *  1. 异步编程模型 ：t1线程执t1的，t2线程执行t2的，两个线程之间谁也不等谁
 *  
 *  2. 同步编程模型 ：当t1线程必须的等t2线程执行结束之后，t1线程才能执行，这是同步编程模型。
 *  
 *  3. 如银行系统中的存取操作必须是，线程同步的 ：1)为了线程的安全，等同于单线程了，尽管应用程序的使用率降低，2)必须是多线程同步，多线程环境共享同一个数据，共享到的数据设计到修改操作(如查询余额操作就不需要线程同步)。
 *
 */


//以下程序，多线程取款操作，不线程同步。
// 账户对象，线程，模拟取款
public class XianChengTongBu {

	public static void main(String[] args) {
		
		//创建一个公共账户
		Account act = new Account("account-001",5000);
		
		//创建取款线程点
		Processor p = new Processor(act);//保证只有一个act。
		
		//对同一个账户取款，通过构造方法传参实现共享。
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		
		t1.start();//当t1未有执行结束时后，就t2就开始执行了，这是balanc余额还未修正，此时就已经是错误了
		t2.start();
		//运行异常结果如下:  取款余额： 4000.0
		//               取款余额： 4000.0
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===========================================");
		
//============================================
		Account02 act02 = new Account02("account-001",5000);
		
		//创建取款线程点
		Processor p2 = new Processor(act02);//保证只有一个act。
		
		//对同一个账户取款，通过构造方法传参实现共享。
		Thread t21 = new Thread(p2);
		Thread t22 = new Thread(p2);
		
		t21.start();
		t22.start();
	}

}
