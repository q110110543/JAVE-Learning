package com.shuaishuaide.maopaopaixu;

import Std.*;
import java.util.*;

public class ErFenChaZhao {

	public static void main(String[] args) {
		
		int N = 5;
		int M = 100;
		
		int[] a = new int[N];
		
		for(int i = 0; i<a.length-1; i++){
			
			int b = StdRandom.uniform(0, M);
			
			a[i] = b; 
			
		}
		
		Arrays.sort(a);
		
		int temp = StdRandom.uniform(0,N);
		
		System.out.println(a[temp]);
		
		int b = a[temp];
		
		int	temp2 = rank(a, b);
		
		if(temp2==temp) System.out.println("true");
		
		else System.out.println("false");
		
		System.out.println(a[temp2]);

	}

		public static int rank(int[] a, int key){
			return rank(a, key, 0 ,a.length-1);
		}
		
		public static int rank(int[] a, int key, int lo, int hi){
			
			//int begin = lo; int end = hi;
			
			while(lo<=hi){//虽然查找上不需要等于了，但是需要return返回值，当相等时，必然a[mid]==key;
				
				int mid = (lo + hi)/2;
				
				if(a[mid]==key) return mid;
			
				else if(a[mid]>key) hi = mid-1;
			
				else if(a[mid]<key) lo = mid+1;
			}
			
			return -1;
			
		}
}
