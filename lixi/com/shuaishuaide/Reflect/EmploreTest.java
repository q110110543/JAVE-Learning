package com.shuaishuaide.Reflect;

import java.util.*;

import java.sql.Date;

public class EmploreTest {

	public static void main(String[] args) throws Exception {
		
		//��ȡClass��������ַ�ʽ
		Class c1 = Class.forName("com.shuaishuaide.Reflect.Emplore");
		
		Class c2 = Emplore.class;//java��ÿ��������class����
		
		//�κ�һ��java������һ��getClass����;
		Emplore e = new Emplore("˧˧�Ķ�");//�ȴ�������
		Class c3 = e.getClass();//����ʱ��
		
		System.out.println(c1==c2);
		System.out.println(c3==c2);
		
		Class c4 = Date.class;
		Class c5 = Class.forName("java.util.Date");//����д��ȫ��,��ȫ����а���
		
		Date d = new Date(0);
		Class c6 = d.getClass();
		
	}

}
