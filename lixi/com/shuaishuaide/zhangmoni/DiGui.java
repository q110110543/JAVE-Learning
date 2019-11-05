package com.shuaishuaide.zhangmoni;

import java.util.*;

public class DiGui {

	public static void main(String[] args) {
		
		double i = 10;
		
		double b = m1(i);
		
		System.out.println(m1(1));
		
		double sum = 2.0;
		
	    for(int x = 3; x <= 10; x++){
	    	sum *= x;
	    } 
	    
	    System.out.println(Math.log(sum));
	    
	    System.out.println(m2(1));
	    
	    String s1 = "hehe";
	    
	    String s2 = "heheh";
	    
	    System.out.println(s1);
	    		
		
		
	}
	
	public static double m1(double i){
		
		return m1(i, Math.log(i));
		
	}
	
	public static double m1(double i,double sum){
			
		while (i > 2){//这里用while与if是一样的啊，但应该用if；注意递归算法最后return调用的函数
			
			i--;//注意其位置在此循环的第一行；
			
			sum +=Math.log(i);
			
			return m1(i,sum);
		}
		
		return sum;	//这里实现了对log（1）的返回；没有单独的去定义，也算精巧。
		
	}
	
	public static double m2(double i){//无需定义sum的更简单的递归算法。通过if来返回最后所需的确切值Math.log(2);
		
		if(i <= 2)
			return i==1 ? 0 : Math.log(2);
		else
			return m2(i-1) + Math.log(i);//栈结构的对自身的累积和累加都可用递归方法，递归重要的是定义循环的开始与结束。
	}

}
