package com.shuaishuaide.IO.ObjectStream;

import java.io.Serializable;//�����л��ӿڣ��ڲ�û���κ�һ����������Ϊ��־�ӿڣ���java.lang.Cloneable

public class User implements Serializable {
	
	String name;
	
	User(String name){
		
		this.name = name;
		
	}
	public String toString(){
		return "User[name="+name+"]";
	}

}
