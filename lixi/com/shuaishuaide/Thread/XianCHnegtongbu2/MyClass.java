package com.shuaishuaide.Thread.XianCHnegtongbu2;

//�Ƕ���������Ƿ������������Է����������ˣ�ֻҪ��ͬһ���������������ڱ������Ķ�ֻ�ܵȴ��õ����������ܺ�������ִ�С�

public class MyClass {
	
	public synchronized void m1(){//���õ�������������ʵ�֣�������������ʵ�֡����ҵĴ���������Ҫ�úܶ�
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1.....");
		
	}
	/*
	public void m2(){
		System.out.println("m2.....");
	}
	*/
	public synchronized void  m2(){//��Ȼ��m1()ִ����Ϻ���ִ����һ����m2()��
		System.out.println("m2.....");
	}

}
