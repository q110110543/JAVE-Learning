package com.shuaishuaide.IO.Decoraor;

public class DecortorTest01 {

	public static void main(String[] args) {
		/*
		FileReader01 fr1 = new FileReader01();
		
		BufferedReader01 br01  =new BufferedReader01(fr1);
		*/
		
		BufferedReader01 br01  =new BufferedReader01(new FileReader01());//�����װ������ֻ��ر�����������ڲ���������Ҫ�ر�
													//���ڶ�̬��
		br01.close();
		
	}

}
