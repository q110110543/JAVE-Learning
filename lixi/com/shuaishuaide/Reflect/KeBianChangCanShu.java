package com.shuaishuaide.Reflect;

import java.util.*;


public class KeBianChangCanShu {
	
	public static void m1(int... a){//�ɱ䳤������
		System.out.println("Test");
	}
	public static void m1(int i){//����о�ȷƥ��ĵ���ȷƥ�䷽��������ִ�пɱ䳤������
		System.out.println(i);
	}
	public static void m2(String... args){//������Ϊ����
		for(int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	public static void m3(Class...args) throws InstantiationException, IllegalAccessException{
		for(int i=0; i<args.length;i++){
			Class c = args[i];
			System.out.println(c.newInstance());//����Ҫ�׳��쳣,���޲η���ֱ�ӵ����޲η���������ʹ��δ�ı��toString����
		}
	}
	//�ɱ䳤����ֻ�ܷ������λ�ã�ֻ�ܳ���һ��
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		m1(1);
		m1(1,2);
		m1();
		m2("��","��","rap","����");
		m3(Date.class,Emplore.class);
	}

}
