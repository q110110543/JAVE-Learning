package com.shuaishuaide.Thread.XianCHnegtongbu;

public class Account02 {
	
	private String actno;
	private double balance;
	
	public Account02() {
		super();
	}

	public Account02(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}

	public String toString() {
		return "Account [actno=" + actno + ", balance=" + balance + "]"+"haha";
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}	
	
	//�Ե�ǰ�˻��ṩһ��ȡ���,ע���ǳ�Ա����
	
	public void withdraw(double money){
//	public void synchronized withdraw(double money){ //�ؼ�����ӵ�����Ա�������ϣ��߳����ߵ�Ҳ��this�Ķ��������������еĴ��붼��ͬ����
		//double before = this.balance;
		
		//�����̵߳�ͬ������
		synchronized (this) {//С���������빲��Ķ��󣬽����̵߳ĳ�������������ڲ�  //������ͬ����Ϊ��ϸ���ķ�ʱ�����
			
			double after = balance - money;
			
			try {
				Thread .sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		//�������
			
			this.setBalance(after);//t1��δ���ü�ִ����仰��t2���Ѿ���ʼִ����
			
		}
//=================================================
		//synchronized��ԭ��
		/*
		 * t1�߳�ִ�е��˴��ͻ�ȡ��this�Ķ�������ÿ�������϶���0��1�ı�־
		 * �ҵ�������������ͬ��������ִ�г��򣬵�ͬ�������еĴ���ִ�н�����t1�̹߳黹this�Ķ�����
		 * 
		 * ��t1ִ��ͬ������Ĺ����У�t2�߳�Ҳ����ִ�У�Ҳ������synchronized�ؼ��֣�Ҳȥ��this�Ķ�������
		 * ���Ǹö�������t1�̳߳��У�ֻ�ܵȴ�this�������Ĺ黹��
		 * �ҵ���ִ�У��Ҳ����͵ȴ���
		 * 
		 */
		
	}
}
