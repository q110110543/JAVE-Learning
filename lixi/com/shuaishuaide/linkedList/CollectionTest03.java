package com.shuaishuaide.linkedList;
import java.util.*;

public class CollectionTest03 {//��д�ڼ����еĶ���Ҫ��дequals������

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		Integer i1 = new Integer(1000);
		
		c.add(i1);
		c.add(i1);
		c.add(i1);
		c.add(i1);
		c.add(i1);
		c.add(i1);
		
		
		
		Integer i2 = new Integer(1000);
		
		System.out.println(c.contains(i2)+"k");//��������Ϊ�ڳ������ӵ�ԭ�򣬶�����д��equals������
		
		Manager m2 = new Manager(100,"Jack");
		Manager m1 = new Manager(100,"Jack");
		
		c.add(m1);
		
		hehe h1 = new hehe(100,"hehe");
		
		c.add(h1);
		
		System.out.println(c.size());
		System.out.println(c.contains(m2)+"9375932759352");//������Manager��д��equals������
		
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next()+"hahah");
		}
		
		while(it.hasNext()){
			/*
			it.next();
			
			it.remove();//ͨ��������ɾ��
			*/
			  Object element = it.next();//��������ȥɾ��Ԫ�أ���������͸ı��ˣ���Ҫ���»�ȡ�����������ܼ���ִ�У�������һ�е�it������û�����»�ȡ�����ԡ�Ӧ�á�����(����ʦ����)
			  c.remove(element);
			  
			 it = c.iterator();//�ٴθ�it��ֵ����Ϳ����ü��ϵ�remove������ɾ���ˣ�
			  //����
			  //		:2��Ԫ��ʱ���ᱨ���ˣ�����ֻ��ɾ��һ��������һ��
			  //        �����ڵ���3��ʱ��39�оͻᱨ��
			 
		}
		System.out.println(c.size());
	}

}
//��дequals������  









