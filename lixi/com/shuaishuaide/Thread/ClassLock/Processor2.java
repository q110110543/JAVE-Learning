package com.shuaishuaide.Thread.ClassLock;



public class Processor2 implements  Runnable {
	
	MyClass mc;//�����ڲ��Գ��򴴽�����Processor�������м���򣬲��õĽ�������Ϊ���ԺͲ��������ʡ���ͨ�����������ã����Ǳ����ٲ��Գ��򴴽����󣬾��Ǵ���������һ����ôƲ������
	
	public Processor2(MyClass mc){//��������Ĳ��������ڲ����ԣ�����������һ������˸�run
		this.mc = mc;
	}
	
	
	public void run(){
		
		if(Thread.currentThread().getName().equals("t1")){
			mc.m1();
			//���������Ϣ������ͨ�����Ƶ�equals()�ķ���������,�����Ƕ��������һ��run������
		}
		if(Thread.currentThread().getName().equals("t2")){
			mc.m2();//�ܷ����ľͷ�������������Ҫ������󻯡�
			//���������Ϣ������ͨ�����Ƶ�equals()�ķ��������á�
		}
		
		
	}
}
