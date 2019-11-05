package com.shuaishuaide.object;

public class People {
	
	String name;
	
	int id;
	
	public People(String name, int id){
		
		this.name = name;
		
		this.id = id ;
			
	}
	
	public boolean equals(Object obj){
		
		if (this == obj) return true;
		
		if(obj instanceof People){
			People p = (People)obj;
			if(p.id == id && this.name.equals(p.name)){
				return true;
			}
			
		}
		
		return false;
	}
	

}
