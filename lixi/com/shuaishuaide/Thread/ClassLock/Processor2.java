package com.shuaishuaide.Thread.ClassLock;



public class Processor2 implements  Runnable {
	
	MyClass mc;//对象在测试程序创建，在Processor这样的中间程序，采用的将其增加为属性和参数的性质。再通过参数来调用，但是必须再测试程序创建对象，就是创建对象这一步怎么撇不开。
	
	public Processor2(MyClass mc){//这里输入的参数就是内部属性，而不是像我一样搞出了个run
		this.mc = mc;
	}
	
	
	public void run(){
		
		if(Thread.currentThread().getName().equals("t1")){
			mc.m1();
			//调用这个信息，可以通过名称的equals()的方法来调用,而不是多余的设置一个run参数。
		}
		if(Thread.currentThread().getName().equals("t2")){
			mc.m2();//能方法的就方法化，尽量不要多余对象化。
			//调用这个信息，可以通过名称的equals()的方法来调用。
		}
		
		
	}
}
