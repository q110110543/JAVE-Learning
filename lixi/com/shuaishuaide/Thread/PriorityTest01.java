package com.shuaishuaide.Thread;

//�߳����ȼ�
//���ȼ�1-10��Ĭ��5�����10�����1

public class PriorityTest01 {

	public static void main(String[] args) {
		
		//��λ�ȡ��ǰ�̶߳���
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
		
		Thread t2 = new Thread(new Processor03());
		
		t2.setName("t1");//��������
		
		
		
		Thread t3 = new Thread(new Processor03());
		
		
		
		System.out.println(t2.getPriority() + " t2");//��ȡ���ȼ�
		System.out.println(t3.getPriority() + " t3");
		t2.setPriority(1);
		t3.setPriority(10);
		
		t2.start();//Thread-0  t3��ִ�еĴ��������,�����ǾͲ�ִ��t2�ˣ�˭���ȼ���˭��õ�CPUʱ��Ƭ����Զ�һЩ��
		t3.start();//Thread-1
		
		System.out.println(Thread.MAX_PRIORITY);
	}
//==========================================================
//                                      Thread.sleep(����)
// 1. sleep��һ����̬������������ǰ�̡߳�����sleep���ķ�������ʱ��Ƭ����������״̬���ڳ�CPU�ø������̡߳�
}
