package com.shuaishuaide.Thread.ClassLock;

public class MyClass {
	
	
	//synchronized�ӵ���̬�����ϣ��߳�ִ�д˷�����ʱ�����������
	public synchronized static void m1() {//����������޹أ�
		
		try{Thread.sleep(5000);}catch(Exception e){}
		
		System.out.println("m1...");
		
	}
	/*
	public static void m2(){
		System.out.println("m2...");//m2()����ȴ�m()ִ�У����Ա������һ���ģ�
	}
	*/
	public synchronized static void m2(){//���ھͱ�Ȼ��ȴ��ˣ�����ֻ��һ�ѣ�����ȴ�����������������Ǻܴ�ģ��ܸ����������������������������أ�
		System.out.println("m2...");
	}

}
