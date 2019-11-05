package com.shuaishuaide.Thread.DingShiQi;
/*
 * 每隔一段固定时间就执行一段代码
 * 
 * 
 */

import java.util.*;
import java.text.*;

public class Test {
/*
 * Wait与notify()是所有对象都能掉，wait调用后，处于此对象上的线程就会等待，notify调用后就会唤醒
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Timer t = new Timer();
		
		t.schedule(new logTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-10-18 11:12:05 555"), 10*1000);//匿名内部内可以new

	}

}
