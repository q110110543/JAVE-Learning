package com.shuaishuaide.Thread;
/*
 * ���̵߳�һ�ַ�ʽ��
 *  ��һ�����̳� java.lang.Thread;
 *  �ڶ�������дrun����
 */


public class ThreadTest01 {

	public static void main(String[] args) {
		
		
		//������Ǵ���һ���̣߳�
		Thread t = new ThreadCreate();
		//����������һ���̣߳�
		t.start();//Thread�ڵķ���//ִ��˲�����������JVM�����������һ���µ�ջ��t�̡߳�ϵͳ�߳�����֮���Զ�����run������
		
		//t.run()�Ļ���������main()���������У��µ��߳̾Ͳ����������Ͳ�������µ�ջ��run()���������������forѭ���Ͳ���ִ�У����������mainѭ��һ����runѭ���� ����		
		
		for(int i=0; i<10;i++){
			System.out.println("main-->" + i);
		}

	}

}
//main��������������һ��������main��������ֻ�����߳�ջ���գ����߳�ջ��û�з���ջ����//���������̺߳�����ջ�л���ջ�룬main���������������ܻỹ������