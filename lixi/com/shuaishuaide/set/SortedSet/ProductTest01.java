package com.shuaishuaide.set.SortedSet;

import java.util.*;

public class ProductTest01 {

	public static void main(String[] args) {
		
		SortedSet products = new TreeSet(new ProductComparable());
		
		/*
		 * 采用匿名内部类的形式：但会导致比较器不能重复利用，只能在这里用，其他地方用不了
		 * SortedSet product = new TreeSet(new Comparator(){
		 * 			public int compare(Object o1,Object o2){
		
						double price1 = ((Product)o1).price;
						double price2 = ((Product)o2).price;
		
						if(price1==price2){
							return 0;
						}else if(price1>price2){
							return 1;
						}else{
							return -1;
						}
					}
		 * });//注意最后是括号加分号
		 */
		
		Product p1 = new Product(335);
		System.out.println(p1.price+"dd");
		Product p2 = new Product(2.0);
		
		Product p3 = new Product(32.0);
		Product p4 = new Product(3.0);
		Product p5 = new Product(5.0);
		Product p6 = new Product(7.4);
		Product p7 = new Product(3.0);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		
		Iterator it = products.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
