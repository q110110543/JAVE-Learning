package com.shuaishuaide.ArrarTest;

public class ArrayTest03 {
	public static void main(String[] args){
		
		if(args.length != 2){
			System.out.println("�������û���������");
			return;
		}
		String username = args[0];
		String password = args[1];
		if("admin".equals(username) && "123".equals(password)){//���Ա����ָ���쳣
			
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("�˻��������");
		}
		
	}
}