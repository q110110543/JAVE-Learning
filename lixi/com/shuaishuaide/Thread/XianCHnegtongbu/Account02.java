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
	
	//对当前账户提供一个取款方法,注意是成员方法
	
	public void withdraw(double money){
//	public void synchronized withdraw(double money){ //关键字添加到“成员方法”上，线程拿走的也是this的对象锁。但是所有的代码都被同步了
		//double before = this.balance;
		
		//加入线程的同步机制
		synchronized (this) {//小括号内填入共享的对象，将单线程的程序填入大括号内部  //这样的同步更为精细，耗费时间更少
			
			double after = balance - money;
			
			try {
				Thread .sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		//更新余额
			
			this.setBalance(after);//t1还未来得即执行这句话，t2就已经开始执行了
			
		}
//=================================================
		//synchronized的原理
		/*
		 * t1线程执行到此处就会取找this的对象锁，每个对象上都有0与1的标志
		 * 找到对象锁，进入同步语句块中执行程序，当同步语句块中的代码执行结束后，t1线程归还this的对象锁
		 * 
		 * 在t1执行同步语句块的过程中，t2线程也过来执行，也遇到了synchronized关键字，也去找this的对象锁，
		 * 但是该对象锁被t1线程持有，只能等待this对象锁的归还。
		 * 找到就执行，找不到就等待。
		 * 
		 */
		
	}
}
