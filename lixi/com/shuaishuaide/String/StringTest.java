
package com.shuaishuaide.String;

import java.util.*;
import java.text.*;

public class StringTest {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		
		int i2 = i1.intValue();
		
		int i3 = i1;
		
		Integer i4 = i2;
		
		String s4 = i2 + "";
		
		int i5 = Integer.parseInt(s4);
		
		System.out.println(i2+1);
		
		//Integer i6 = s4;
		
		//String s6 = i4;
		
		int x = Integer.parseInt("10");
		
		int price = Integer.parseInt("1");//�˴����������������ַ����ſ���ת��
		
		String s1 = Integer.toBinaryString(8);
		String s2 = Integer.toHexString(16);
		String s3 = Integer.toOctalString(9); 
		
		Integer i7 = new Integer(10);
		
		System.out.println(i7.equals(i1));//��д�ˣ�
		
		System.out.println(System.currentTimeMillis());
		
		Date nowTime = new Date();
		
		System.out.println(nowTime);//�Ѿ���д��toString������
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss SSS����");
		
		String strTime = sdf.format(nowTime);
		
		System.out.println(strTime);
		
	}

}
