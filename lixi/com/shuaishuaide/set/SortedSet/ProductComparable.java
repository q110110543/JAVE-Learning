package com.shuaishuaide.set.SortedSet;

import java.util.*;

class ProductComparable implements Comparator {//自己创建一个比较器
	
	public int compare(Object o1,Object o2){
		
		double price1 = ((Product)o1).price;//不强制转型，编译无法通过
		double price2 = ((Product)o2).price;
		
		if(price1==price2){
			return 0;
		}else if(price1>price2){
			return 1;
		}else{
			return -1;
		}
	}
	

}
