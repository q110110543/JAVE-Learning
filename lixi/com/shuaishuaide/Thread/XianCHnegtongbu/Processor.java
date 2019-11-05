package com.shuaishuaide.Thread.XianCHnegtongbu;

public class Processor implements Runnable{
	
	Account act;//在线程里提供参数保证对同一个账号进行操作。
	Account02 act02;
	boolean run1;
	boolean run2;
		
	public Processor(Account act) {
		this(act,true);//必须通过this的方式而不是直接用类名的方式。
	}
	public Processor(Account02 act02) {
		this(act02,true);
	}
	public Processor(Account act,boolean run1) {
		super();
		this.act = act;
		//System.out.println(act);
		this.run1 = true;//原先这里忘了加this
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
			System.out.println("取款余额： " + act.getBalance());
			//改写的toString方法无用
			run1 = false;
			
		}
		
		if(run2==true){
			act02.withdraw(1000);
			System.out.println("取款余额： " + act02.getBalance()+"haha");
			run2 = false;
		}		
	}	
}
