package com.shuaishuaide.Thread.XianCHnegtongbu;

public class Account {
	
	private String actno;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}

	public String toString() {
		return "Account [actno=" + actno + ", balance=" + balance + "]";
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
		
		//double before = this.balance;
		double after = balance - money;
		
		try {
			Thread .sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	//�������
		
		this.setBalance(after);//t1��δ���ü�ִ����仰��t2���Ѿ���ʼִ����
	}
}
