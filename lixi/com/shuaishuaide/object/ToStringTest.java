package com.shuaishuaide.object;

public class ToStringTest {
	
	public static void main(String[] args){
		Object o1 = new Object();
		
		Person p1 = new Person("ÁùµÃ»¨",50);
		
		String pStr = p1.toString();
		
		System.out.println(pStr);
		
		Person p2 = new Person("hh",20);
		System.out.println(p2);
		}

}
class Person{
	String name;
	int age;
	Person(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	public String toString(){
		
		return "Person{name = "+name+",age= "+age+"}";
				
	}
}