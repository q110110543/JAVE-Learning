package com.shuaishuaide.luo.jiekou;

public class Car {
	
	Engine e;

	Car(Engine e){
		
		this.e = e;
	}
	
	public void testEngine(){
		e.start();//����ӿڵ���
	}
}
