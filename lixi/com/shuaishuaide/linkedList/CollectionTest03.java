package com.shuaishuaide.linkedList;
import java.util.*;

public class CollectionTest03 {//重写在集合中的对象都要重写equals方法；

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
		
		System.out.println(c.contains(i2)+"k");//并不是因为在常量池子的原因，而是重写了equals方法。
		
		Manager m2 = new Manager(100,"Jack");
		Manager m1 = new Manager(100,"Jack");
		
		c.add(m1);
		
		hehe h1 = new hehe(100,"hehe");
		
		c.add(h1);
		
		System.out.println(c.size());
		System.out.println(c.contains(m2)+"9375932759352");//调用了Manager重写的equals方法；
		
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next()+"hahah");
		}
		
		while(it.hasNext()){
			/*
			it.next();
			
			it.remove();//通过迭代器删除
			*/
			  Object element = it.next();//集合自身去删除元素，集合整体就改变了，需要重新获取迭代器，才能继续执行，所以这一行的it迭代器没有重新获取，所以“应该”报错(杜老师讲的)
			  c.remove(element);
			  
			 it = c.iterator();//再次给it赋值对象就可以用集合的remove方法来删除了；
			  //这里
			  //		:2个元素时不会报错了，但是只会删除一个，保留一个
			  //        ：大于等于3个时候，39行就会报错，
			 
		}
		System.out.println(c.size());
	}

}
//重写equals方法；  









