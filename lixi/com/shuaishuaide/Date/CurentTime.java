package com.shuaishuaide.Date;

import java.util.*;
import java.text.*;

public class CurentTime {

	public static void main(String[] args) throws Exception{
		
		
		System.out.println(System.currentTimeMillis());
		
		Date nowTime = new Date();
		
		System.out.println(nowTime+"/2");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");//注意不自动补零
		
		Date nowTime2 = new Date();
		
		System.out.println(nowTime2 + "hahahhaha");
		
		System.out.println(System.currentTimeMillis() + "hehe");
		
		String strTime = sdf.format(nowTime);		
		
		System.out.println(strTime+"/1");
		
		Date t = sdf.parse(strTime);
		
		System.out.println(t+" /444");
		
		Date t2 = new Date(System.currentTimeMillis() - 1000*60*10);
		
		System.out.println(sdf.format(t2));
		
		Date t3 = new Date(1000);
		
		System.out.println(sdf.format(t3)+"haha");
		
		Calendar c =  Calendar.getInstance();
		
		int i = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(i+"kekek");
		
		String strTime2 = "2019-09-26";
		
		Date d2 =new SimpleDateFormat("yyyy-MM-dd").parse(strTime2);
		
		c.setTime(d2);
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK)+" /3");
		
		
	
	}

}
