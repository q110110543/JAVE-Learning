package com.shuaishuaide.ArrarTest;

import Std.*;

public class Animal {
	


	
	
	public static void main(String[] args){
		
		int[] a = {1,2,43,5,3,5,3,2,54,25,32,5};
		
		for(int i = 0 ;i<a.length-1;i++){
			System.out.print(a[i]+" ");	
		}
		
		
		int N =100;
		StdDraw.setXscale(0,N);
		
		StdDraw.setYscale(0,N*N);
		StdDraw.setPenRadius(.01);
		for(int i = 1;i<=N;i++){
			StdDraw.point(i,i);
			StdDraw.point(i,i*i);
			StdDraw.point(i,i*Math.log(i));
		}
		
		
	}
	public  void shuffle(int[] a ){
		
		int N =a.length;
		for(int i = 0;i<N;i++){
			
			int r = i + StdRandom.uniform(N-i);
			
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}

}
