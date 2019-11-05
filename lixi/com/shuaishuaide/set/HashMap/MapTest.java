package com.shuaishuaide.set.HashMap;

import java.util.*; 

public class MapTest {//无序不可重复，重复就覆盖
	
	public static void main(String[] args){
		
		Map persons = new HashMap();
		
		persons.put("1000", "Jack0");//这样就不用创建对象了
		persons.put("1001", "Jack1");
		persons.put("1002", "Jack2");
		persons.put("1003", "Jack3");
		persons.put("1004", "Jack4");
		persons.put("1005", "Jack5");
		persons.put("1000", "Jack6");
		
		System.out.println(persons.size());
		System.out.println(persons.containsKey("1000"));
		System.out.println(persons.isEmpty());

		System.out.println(persons.size());
		System.out.println(persons.get("1000"));
		System.out.println(persons.containsValue("Jack6"));
		persons.remove("1004");
		
		Collection values = persons.values();//Collection 的values方法
		Iterator it = values.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next()+"hehe");
		}
		
		Set keys = persons.keySet();
		
		it = keys.iterator();//keySet方法的Set集合
		
		while(it.hasNext()){
			
			Object k = it.next();
			System.out.println(k+"ha");//通过key键集合获取键值//更灵活
			System.out.println(persons.get(k));
		}
		
		Set entrysSet = persons.entrySet();//直接返回键值对  相当于将Set转化成map集合
		
		it = entrysSet.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		List l = new ArrayList();
		
		l.add(10);
		l.add(5);
		l.add(3);
		l.add(2);
		l.add(4);
		
		for(int i = 0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
		for(Iterator it2 = l.iterator();it.hasNext(); ){
			System.out.println(it2.next());
		}
		
		
		System.out.println("===================================");
		
		Collections.sort(l);		
		
		Iterator it3 = l.iterator();//改顺序必在迭代器创建以前。
		while(it3.hasNext()){
			System.out.println(it3.next());
		}	
		
		Set s = new HashSet();
		
		s.add(10);
		s.add(5);
		s.add(3);
		s.add(6);
		s.add(4);
		
		List list2 = new ArrayList(s);//ArrayList这里才需要排序。
		
		//Collections.sort(list2);
		
		for(Iterator it4 = list2.iterator();it4.hasNext(); ){
			System.out.println(it4.next()+"haha");
		}
		
		
		
		
		
		
	}
		

}
