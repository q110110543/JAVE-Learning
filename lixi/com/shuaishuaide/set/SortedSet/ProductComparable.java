package com.shuaishuaide.set.SortedSet;

import java.util.*;

class ProductComparable implements Comparator {//�Լ�����һ���Ƚ���
	
	public int compare(Object o1,Object o2){
		
		double price1 = ((Product)o1).price;//��ǿ��ת�ͣ������޷�ͨ��
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
