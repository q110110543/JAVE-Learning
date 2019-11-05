package com.shuaishuaide.ArrarTest;

public class ArraryTest {

	public static void main(String[] args) {
		Animal[] as = new Animal[4];
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		as[0] = c1;
		as[1] = c2;
		as[2] = d1;
		as[3] = d2;
		
		for(int i=0;i<as.length;i++){
			
			if(as[i] instanceof Dog){
				 Dog a = (Dog)as[i];
				 a.move();
			}else if(as[i] instanceof Cat){
				Cat a = (Cat)as[i];
				a.eat();
			}
		}
	}

}
