package com.shuaishuaide.luo;

public class Account {
	
	private String actno;
	
	private double balance;

	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	
	public Account(String s){
		
		actno = s;
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
	
	

}
