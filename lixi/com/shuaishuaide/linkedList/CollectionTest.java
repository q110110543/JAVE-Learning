package com.shuaishuaide.linkedList;

import java.util.*;
public class CollectionTest {

	public static void main(String[] args) {
		/*
		Collection c = new ArrayList();
		
		c.add(1);//�Զ�װ��
		c.add(new Integer(100));
		
		Object o = new Object();
		c.add(o);//ֻ������������͡�
		
		Customer cus = new Customer("Jack",20);
		c.add(cus);
		
		System.out.println(c.size());//4
		System.out.println(c.isEmpty());

		Object[] objs = c.toArray();
		for(int i =0; i<objs.length;i++){
			System.out.println(objs[i].toString());
		}	
		
		c.clear();
		System.out.println(c.size());//0
		System.out.println(c.isEmpty());
		*/
		Collection c2 = new HashSet();//new ArrayList();
		
		c2.add(1);
		c2.add(3.14);
		c2.add(false);
		
		Iterator it = c2.iterator();//����ӿڣ�ǰ���ǽӿڣ������ǵ��������������Ƕ�̬��ע�ⲻ��new����ʽ�������ڱ�̣�it�Ǹ����ã��������ڴ��ַ��ָ���˵���������,
		System.out.println(it);//������ڲ���  java.util.ArrayList$Itr@6d06d69c $�������ʵ�ʵĵ�����
								//java.util.ArrayList$Itr@6d06d69c
		 
		while(it.hasNext()){//for(Iterator it; it.hasNext();){//���Ը�Ϊ��һ��ʽ
			
			Object element = it.next();
			System.out.println(element);//��������Ѿ����Զ�װ���ˡ�
		}
		for(Iterator it2 = c2.iterator(); it2.hasNext();){

			//Object element = it2.next();
			System.out.println(it2.next());
		}//�����for����д�жϷ�ʽ��ѭ��
		
	}

}
