package com.shuaishuaide.Thread.DingShiQi;
/*
 * ÿ��һ�ι̶�ʱ���ִ��һ�δ���
 * 
 * 
 */

import java.util.*;
import java.text.*;

public class Test {
/*
 * Wait��notify()�����ж����ܵ���wait���ú󣬴��ڴ˶����ϵ��߳̾ͻ�ȴ���notify���ú�ͻỽ��
 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Timer t = new Timer();
		
		t.schedule(new logTimerTask(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-10-18 11:12:05 555"), 10*1000);//�����ڲ��ڿ���new

	}

}
