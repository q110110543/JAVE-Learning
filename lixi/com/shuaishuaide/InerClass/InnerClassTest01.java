package com.shuaishuaide.InerClass;

import com.shuaishuaide.InerClass.InnerLei.InnerClass2;

public class InnerClassTest01 {

	public static void main(String[] args) {
		
		InnerLei.InnerClass.m3();
		
		InnerLei.InnerClass inner1 = new InnerLei.InnerClass();//����ǰ������ⲿ�ࡣ
		
		//InnerClass inner2 =new InnerLei.InnerClass();
		
		inner1.m4();
		inner1.m3();//����ʵ�з���Ҳ���Ե��ã���Ӧ���þ�̬������
		
		InnerLei outer1 = new InnerLei();//�ȴ����ⲿ����
		
		InnerClass2 inner2 = outer1.new InnerClass2();//�����ڲ��࣬���Ǹ��ӵĹ���ѽ��
		
		inner2.m4();
		
		outer1.m5();
		
		

		
	}

}
