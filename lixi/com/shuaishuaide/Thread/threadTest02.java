package com.shuaishuaide.Thread;

/*
 * 线程实现的第二种方式
 * 第一步：写一个类实现java.lang.Runnable;(接口)
 * 第二部:实现run()方法；
 */

import java.io.*;

public class threadTest02 {

	public static void main(String[] args) {
		
		Thread t =new Thread(new Processor02());//创建一个新的线程对象
		
		t.start();
		
		for(int i = 0; i<10; i++){
			System.out.println("main-->" + i);
		}
		
	}

}
