package com.shuaishuaide.Thread;

public class JianGeYiMiao implements Runnable {
	
	boolean run = true;
	
	public void run(){
		for(int i = 0; i<10; i++ ){//通过语法的方法来控制打断
			
			if(run){
				try{
					Thread.sleep(1000);//正常情况10秒后执行完毕
				}catch(Exception e){}
				System.out.println(Thread.currentThread().getName() + "--->" + i);
			}else{
				return;
			}
		}
	}

}
