package com.shuaishuaide.Thread;

/*
 * �߳�ʵ�ֵĵڶ��ַ�ʽ
 * ��һ����дһ����ʵ��java.lang.Runnable;(�ӿ�)
 * �ڶ���:ʵ��run()������
 */

import java.io.*;

public class threadTest02 {

	public static void main(String[] args) {
		
		Thread t =new Thread(new Processor02());//����һ���µ��̶߳���
		
		t.start();
		
		for(int i = 0; i<10; i++){
			System.out.println("main-->" + i);
		}
		
	}

}
