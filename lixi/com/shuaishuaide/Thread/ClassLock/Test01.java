package com.shuaishuaide.Thread.ClassLock;

/*
 * ����ֻ��һ�������༶���
 */

public class Test01 {
	
	public static void main(String[] args){
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		/*
		Thread t1 = new Thread(new Processor());
		Thread t2 = new Thread(new Processor());
		*/
		Thread t1 = new Thread(new Processor2(mc1));//��������Ǿ�̬��������޹�ϵ���õĻ����������Ƕ���������Ȼ�Ǵ������¶��󣬵��Ƿ����Ǿ�̬�ģ���ȻҪ�ȴ�����̬�������۶���
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
