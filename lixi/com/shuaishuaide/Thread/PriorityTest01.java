package com.shuaishuaide.Thread;

//线程优先级
//优先级1-10，默认5，最高10，最低1

public class PriorityTest01 {

	public static void main(String[] args) {
		
		//如何获取当前线程对象
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
		
		Thread t2 = new Thread(new Processor03());
		
		t2.setName("t1");//改名字了
		
		
		
		Thread t3 = new Thread(new Processor03());
		
		
		
		System.out.println(t2.getPriority() + " t2");//获取优先级
		System.out.println(t3.getPriority() + " t3");
		t2.setPriority(1);
		t3.setPriority(10);
		
		t2.start();//Thread-0  t3会执行的次数会更多,并不是就不执行t2了，谁优先级高谁获得的CPU时间片就相对多一些。
		t3.start();//Thread-1
		
		System.out.println(Thread.MAX_PRIORITY);
	}
//==========================================================
//                                      Thread.sleep(毫秒)
// 1. sleep是一个静态方法，阻塞当前线程。调用sleep方的放弃抢夺时间片，进入阻塞状态，腾出CPU让给其他线程。
}
