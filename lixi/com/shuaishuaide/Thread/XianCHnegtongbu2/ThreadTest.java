package com.shuaishuaide.Thread.XianCHnegtongbu2;

public class ThreadTest {//m1....û�н�����ʱ��m2...�����Լ�ִ��

	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		//MyClass mc2 = new MyClass();
		
		Processor p = new Processor(mc);
		//Processor p2 = new Processor(mc2);
		
		Thread t1 = new Thread(p);
		t1.setName("t1");
		Thread t2 = new Thread(p);
		t2.setName("t2");
		
		//Thread t3 = new Thread(p2);
		//t2.setName("t2");//���ﲻ����ͬһ�������ǲ�ͬ���̣߳�����t1��t3�䲻���໥�ȴ���
		
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
