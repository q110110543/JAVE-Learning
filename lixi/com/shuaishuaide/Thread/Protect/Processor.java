package com.shuaishuaide.Thread.Protect;

public class Processor extends Thread{
	
	public void run(){
		int i = 0;
		
		while(true){//���ڸ�Ϊ���ػ��̣߳�main()�Ǳ�������Ϻ�Ͳ������ִ���ˣ�����Trueʽ��������
			
			System.out.println(Thread.currentThread().getName() + "--->" + i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
