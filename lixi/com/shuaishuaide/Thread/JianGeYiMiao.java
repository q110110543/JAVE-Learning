package com.shuaishuaide.Thread;

public class JianGeYiMiao implements Runnable {
	
	boolean run = true;
	
	public void run(){
		for(int i = 0; i<10; i++ ){//ͨ���﷨�ķ��������ƴ��
			
			if(run){
				try{
					Thread.sleep(1000);//�������10���ִ�����
				}catch(Exception e){}
				System.out.println(Thread.currentThread().getName() + "--->" + i);
			}else{
				return;
			}
		}
	}

}
