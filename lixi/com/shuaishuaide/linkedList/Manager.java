package com.shuaishuaide.linkedList;

class Manager {
	
	int no; 
	
	String name;
	
	Manager(int no,String name){
		
		this.no = no;
		this.name = name;
	}
	/*
	public boolean equals(Object o){//��дequals����
		if(this==o) return true;
		if(o instanceof Manager){
			Manager m  = (Manager) o;
			if(m.no==this.no && m.name.equals(this.name))
				return true;
		}
		return false;
	}
	*/
}
