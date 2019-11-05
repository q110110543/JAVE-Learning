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
	
	//对当前账户提供一个取款方法,注意是成员方法
	
	public void withdraw(double money){
		
		//double before = this.balance;
		double after = balance - money;
		
		try {
			Thread .sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	//更新余额
		
		this.setBalance(after);//t1还未来得即执行这句话，t2就已经开始执行了
	}
}
