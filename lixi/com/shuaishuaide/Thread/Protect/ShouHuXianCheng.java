package com.shuaishuaide.Thread.Protect;

/*
 * ���е��û��߳̽����������ڣ��ػ��̲߳Ż�����������ڣ���������������һ���ػ��̡߳��������߳����⣬JVM���Զ�����һ�������������̣߳�
 * �ػ��߳�һ�㶼������ִ�е�
 */

public class ShouHuXianCheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Processor();
		
		t1.setDaemon(true);
		
		t1.setName("t1");
		
		t1.start();
		
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}

	}

}
