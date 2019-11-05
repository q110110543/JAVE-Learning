package com.shuaishuaide.luo.jiekou;

public class TestCar {
	
	public static void main(String[] args){ 
			
		Engine e1 = new YMAHA();
		
		Car c = new Car(e1);
		
		//Engine e2 = new honda();
		
		//Car c2 = new Car(e2);
		
		//c.testEngine();
		
		//c2.testEngine();
		
		c.e = new honda();
		c.testEngine();//但是第一步任然是必须的
			
		}
	}
