package com.shuaishuaide.Thread;

//����һ���̣߳��̳�Thread

public class ThreadCreate extends Thread {
//��дrun����	
	public void run(){
		for(int i = 0; i<100; i++){
			System.out.println("run-->" + i);
		}
	}

}
