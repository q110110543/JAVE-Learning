package com.shuaishuaide.Thread;

public class SleepThread extends Thread{

		//Thread�е�run�������׳��쳣��������дrun��������run����������λ���ϲ���ʹ��throws��ֻ��try....catch
		public void run(){
			
			for(int i = 0; i<10;i++){
				System.out.println(Thread.currentThread().getName() + "---->" + i);
				
				
				try {//��ȻҪ����
					Thread.sleep(10000000);//��ǰ�߳����1��
					System.out.println("���ﲻ��ִ�У�����catchִ�к���ת��m1()��ִ��");
				} catch (InterruptedException e) {//����Ϻ������쳣
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				m1();//ֻ��try...cathch...
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		public void m1() throws Exception{//��������׳��쳣������m1()������Ȼֻ�ܲ�׽
			System.out.println("hahahhah����˧");
		}

}
