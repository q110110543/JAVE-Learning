package com.shuaishuaide.ArrarTest;

public class ZhuanBao {

	public static void main(String[] args) {
		
		int b = 100;
		
		Integer b1 = new Integer(b);
		
		Integer a1 = 100;
		
		Integer a2 = 100;
		
		Byte c1 = 100;
		
		Byte c2 = 100;
		
		m1(b1);
		
		System.out.print(b);
		
		System.out.print(b1);
		
		String s = "s a ";
		
		Integer b2 = new Integer(b);
		
		System.out.println(c1==100);
		
		m1(b);//�ž۱�����Ƶ�е�����ˡ���������������Ϊ���������Objectʱ����Զ�װ�䡣
		
		System.out.println(a1.equals(b)+" e ");//����equalsʱ����һ������ת�͵��жϣ��Ƿ�����Integer�࣬����int�͵�b�Ѿ�����װ�ˡ�
		
		//Byte�ὫtoString������д��
	}
	
	public static void m1(Object o){
		System.out.println(o);
	}

}
