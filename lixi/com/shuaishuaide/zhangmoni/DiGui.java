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
			
		while (i > 2){//������while��if��һ���İ�����Ӧ����if��ע��ݹ��㷨���return���õĺ���
			
			i--;//ע����λ���ڴ�ѭ���ĵ�һ�У�
			
			sum +=Math.log(i);
			
			return m1(i,sum);
		}
		
		return sum;	//����ʵ���˶�log��1���ķ��أ�û�е�����ȥ���壬Ҳ�㾫�ɡ�
		
	}
	
	public static double m2(double i){//���趨��sum�ĸ��򵥵ĵݹ��㷨��ͨ��if��������������ȷ��ֵMath.log(2);
		
		if(i <= 2)
			return i==1 ? 0 : Math.log(2);
		else
			return m2(i-1) + Math.log(i);//ջ�ṹ�Ķ�������ۻ����ۼӶ����õݹ鷽�����ݹ���Ҫ���Ƕ���ѭ���Ŀ�ʼ�������
	}

}
