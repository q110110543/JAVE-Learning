package com.shuaishuaide.FanXing;

import java.util.*;

public class GenericTesr05 {

	public static void main(String[] args) {
		
		MyClass<String> mc = new MyClass<String>();
		
		mc.m1("jack");//只能传字符串类型，否者编译期无法通过
		
		int[] a = {1,2,3,4,2,35,5};
		
		for(int e: a){//增强for循环
			
			System.out.println(e);
			
		}
		
		Set<String> strs = new HashSet<String>();

		strs.add("123");
		strs.add("23");
		strs.add("323");
		strs.add("423");
		
		for(String e: strs){//原先使用迭代器
			System.out.println(strs);
		}
		System.out.println("=============");
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(4);
		
		
		for(Integer o: l){
			System.out.println(o);
		}
		
	}

}
