package com.shuaishuaide.ShuXue;

import java.lang.*;
import java.util.Arrays;

public class Mathyanzheng {

	public static void main(String[] args) {

		double  a = -2.0;
		double c = 1.0;
		
		double b = Math.abs(a);
		System.out.println(b);
		System.out.println(Math.E);
		System.out.println(Math.max(a, c));
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.pow(b, a));
		System.out.println(Math.random());
		System.out.println(Math.exp(a));
	
	int[] ad = {1,2,4,1,2,4,5,6,87,3,6,3,6,2,5,7,8,2,76,4,6,3,6,3,57,687,3,65,4,76,43,6,434,5};
	int[] cd = new int[ad.length];
	
	 Arrays.sort(ad);

		System.out.print(ad);
		
		byte b2 = 2;
		
		Byte b1 = new Byte(b2);
		
		System.out.println(b1+" woi");
	}
	 
	
	}


