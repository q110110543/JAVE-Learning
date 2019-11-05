package com.shuaishuaide.Numbler;

import java.util.*;
import java.text.*;
import java.math.*;

public class NumberTest01 {

	public static void main(String[] args) {
		
	DecimalFormat df = new DecimalFormat("###,###");
	
	System.out.println(df.format(1234567890));//数字转换成String的过程
	
	DecimalFormat df2 = new DecimalFormat("###,###.##");
	
	System.out.println(df2.format(1234567890.9857498124));
	
	DecimalFormat df3 = new DecimalFormat("###,###.0000");
	
	System.out.println(df3.format(1234567890.9857598124));
	
	//BigDecimal精确度极高，适合做财务软件。Double精度仍然太低。
	BigDecimal d1 = new BigDecimal(10);
	
	BigDecimal d2 = new BigDecimal(20);
	
	System.out.println(d1.add(d2));//运算后仍然返回大数据。
	
	System.out.println(d2.divide(d1));
	
	//随机数生成
	
	Random r = new Random();
	
	System.out.println(r.nextInt(101));//[0-100]的随机数	
	
	
	}

}
