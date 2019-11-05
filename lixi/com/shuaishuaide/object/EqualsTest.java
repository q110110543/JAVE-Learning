package com.shuaishuaide.object;

public class EqualsTest {

	public static void main(String[] args) {
		
		People p1 = new People("»ÆÏþÃ÷",100);
		
		People p2 = new People("»ÆÏþÃ÷",100);
		
		System.out.println(p1.equals(p2));
		
	}
}