package com.shuaishuaide.finallyo;

public class HandException {
	
	public void register(String name)	throws IllegalNameException {
		
		if(name.length()<6){
			
			throw new IllegalNameException("�û������Ȳ�������6λ����");
		}
		
		System.out.println("ע��ɹ���");
	}
}
