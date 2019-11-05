package com.shuaishuaide.set.Generic;

import java.util.*;

public class ManagerTest {

	public static void main(String[] args) {
		
		SortedSet<Maneger> ss = new TreeSet<Maneger>();
		
		Maneger m1 = new Maneger(10.9);
		Maneger m2 = new Maneger(100);
		Maneger m3 = new Maneger(1000);
		Maneger m4 = new Maneger(1);
		Maneger m5 = new Maneger(10.5);
		
		ss.add(m5);
		ss.add(m4);
		ss.add(m1);
		ss.add(m2);
		ss.add(m3);
		
		
		Iterator<Maneger> it = ss.iterator();
		
		while(it.hasNext()){
			Maneger m = it.next();
			System.out.println(m);//这里可以直接调用work方法，如果没有范形的化，就必须强制类型转换
			
		}
	}	
	
	
}
