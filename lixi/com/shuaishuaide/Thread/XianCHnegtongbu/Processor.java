package com.shuaishuaide.Thread.XianCHnegtongbu;

public class Processor implements Runnable{
	
	Account act;//���߳����ṩ������֤��ͬһ���˺Ž��в�����
	Account02 act02;
	boolean run1;
	boolean run2;
		
	public Processor(Account act) {
		this(act,true);//����ͨ��this�ķ�ʽ������ֱ���������ķ�ʽ��
	}
	public Processor(Account02 act02) {
		this(act02,true);
	}
	public Processor(Account act,boolean run1) {
		super();
		this.act = act;
		//System.out.println(act);
		this.run1 = true;//ԭ���������˼�this
	}
	public Processor(Account02 act02,boolean run2) {
		super();
		this.act02 = act02;
		//System.out.println(act02);
		this.run2 = true;
	}

	public void run(){
		if(run1==true){
			act.withdraw(1000);
			System.out.println("ȡ���� " + act.getBalance());
			//��д��toString��������
			run1 = false;
			
		}
		
		if(run2==true){
			act02.withdraw(1000);
			System.out.println("ȡ���� " + act02.getBalance()+"haha");
			run2 = false;
		}		
	}	
}
