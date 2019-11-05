package com.shuaishuaide.linkedList;

import java.util.*;
public class CollectionTest {

	public static void main(String[] args) {
		/*
		Collection c = new ArrayList();
		
		c.add(1);//自动装箱
		c.add(new Integer(100));
		
		Object o = new Object();
		c.add(o);//只能添加引用类型。
		
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
		
		Iterator it = c2.iterator();//面向接口，前面是接口，后面是迭代器对象，所以是多态，注意不是new的形式；面向借口编程，it是个引用，保存了内存地址，指向了迭代器对象,
		System.out.println(it);//输出了内部类  java.util.ArrayList$Itr@6d06d69c $后面就是实际的迭代器
								//java.util.ArrayList$Itr@6d06d69c
		 
		while(it.hasNext()){//for(Iterator it; it.hasNext();){//可以改为这一形式
			
			Object element = it.next();
			System.out.println(element);//输出类型已经被自动装箱了。
		}
		for(Iterator it2 = c2.iterator(); it2.hasNext();){

			//Object element = it2.next();
			System.out.println(it2.next());
		}//如何用for来书写判断方式的循环
		
	}

}
