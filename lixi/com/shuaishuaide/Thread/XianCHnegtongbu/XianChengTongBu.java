package com.shuaishuaide.Thread.XianCHnegtongbu;

//      �����������̵߳�ͬ��������������(����)
/*
 *  1. �첽���ģ�� ��t1�߳�ִt1�ģ�t2�߳�ִ��t2�ģ������߳�֮��˭Ҳ����˭
 *  
 *  2. ͬ�����ģ�� ����t1�̱߳���ĵ�t2�߳�ִ�н���֮��t1�̲߳���ִ�У�����ͬ�����ģ�͡�
 *  
 *  3. ������ϵͳ�еĴ�ȡ���������ǣ��߳�ͬ���� ��1)Ϊ���̵߳İ�ȫ����ͬ�ڵ��߳��ˣ�����Ӧ�ó����ʹ���ʽ��ͣ�2)�����Ƕ��߳�ͬ�������̻߳�������ͬһ�����ݣ�������������Ƶ��޸Ĳ���(���ѯ�������Ͳ���Ҫ�߳�ͬ��)��
 *
 */


//���³��򣬶��߳�ȡ����������߳�ͬ����
// �˻������̣߳�ģ��ȡ��
public class XianChengTongBu {

	public static void main(String[] args) {
		
		//����һ�������˻�
		Account act = new Account("account-001",5000);
		
		//����ȡ���̵߳�
		Processor p = new Processor(act);//��ֻ֤��һ��act��
		
		//��ͬһ���˻�ȡ�ͨ�����췽������ʵ�ֹ���
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		
		t1.start();//��t1δ��ִ�н���ʱ�󣬾�t2�Ϳ�ʼִ���ˣ�����balanc��δ��������ʱ���Ѿ��Ǵ�����
		t2.start();
		//�����쳣�������:  ȡ���� 4000.0
		//               ȡ���� 4000.0
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===========================================");
		
//============================================
		Account02 act02 = new Account02("account-001",5000);
		
		//����ȡ���̵߳�
		Processor p2 = new Processor(act02);//��ֻ֤��һ��act��
		
		//��ͬһ���˻�ȡ�ͨ�����췽������ʵ�ֹ���
		Thread t21 = new Thread(p2);
		Thread t22 = new Thread(p2);
		
		t21.start();
		t22.start();
	}

}
