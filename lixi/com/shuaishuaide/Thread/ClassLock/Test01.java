package com.shuaishuaide.Thread.ClassLock;

/*
 * 类锁只有一个，是类级别的
 */

public class Test01 {
	
	public static void main(String[] args){
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		/*
		Thread t1 = new Thread(new Processor());
		Thread t2 = new Thread(new Processor());
		*/
		Thread t1 = new Thread(new Processor2(mc1));//这个方法是静态的与对象无关系，用的还是类锁不是对象锁，虽然是创建的新对象，但是方法是静态的，仍然要等待，静态方法不论对象。
		Thread t2 = new Thread(new Processor2(mc2));
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
	}

}
