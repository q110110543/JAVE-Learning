package com.shuaishuaide.Thread;

public class SleepTest01 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new SleepThread();
		
		t1.setName("t1");
		t1.start();//һͣһͣ�������֣���ʱ10��
		/*
		for(int i = 0; i<10; i++){
			System.out.println("main---->" + i);
			try {//�˴�main()��������ʹ��throws
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//��Ȼ�ǲ����ȵ�����
			}
			
		}
		
		t1.sleep(5000);//��̬���������������ã�����ȥ����processor()����Ч���൱��Thread.sleep(),����main()������sleep�ˣ���Ȼ�ǵ�ǰ�̣߳�������t1��
		
		System.out.println("haha");
		
		Astatci a = null;
		
		a.m1();//���ﲻ�ᱨ��ָ���쳣��m1()�����Ǿ�̬�ģ�������޹أ�����׶ο���a�����н׶λ���������A�����е���A.m1(),��ͨ�����������е�
		*/
//=============================================
		//�̴߳��
		
		Thread .sleep(5000);//�������t������
		
		t1.interrupt();//�����쳣������ƴ��sleep
		
		Astatci a = null;
		
		a.m1();
//=============================================
		//�������̴߳��
		
		JianGeYiMiao jg = new JianGeYiMiao();
		
		Thread t3 = new Thread(jg);
		
		t3.setName("t3");
		
		t3.start();
		
		Thread.sleep(5000);
		
		jg.run = false;
//=============================================
		//�̺߳ϲ����﷨�������ĸ��߳̾ͺ��ĸ��̺߳ϲ��������һ��ջ��join()��һ����Ա��������������.�ķ�ʽȥ���á�
		
		
		JianGeYiMiao jg2= new JianGeYiMiao();
		
		Thread t4 = new Thread(jg);
		
		t4.setName("t3");
		
		t4.start();
		
		t4.join();//��ʱt4�����̺߳ϲ���t4������Ϻ������forѭ���Ż���С�
		
		for(int i = 0; i<10; i++){
			System.out.println(Thread.currentThread().getName() + "--->" + i);
			}
		
		
	}

}
