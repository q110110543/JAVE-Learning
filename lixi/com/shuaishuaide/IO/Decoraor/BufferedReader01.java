package com.shuaishuaide.IO.Decoraor;

public class BufferedReader01 extends Reader01 {//װ�����к��б�װ���ߵ����ã�װ�����뱻װ����Ӧ��ʵ��ͬһ����������
	
	Reader01 reader;//����Ͳ���д���������ˣ�д��������;Ϳ����ˣ����ʱ��ʹ��ڶ�̬��
	
	BufferedReader01(Reader01 reader){
		
		this.reader = reader;
	}
	
	public void close(){
		
		System.out.println("�����ٴα�ִ��");
		reader.close();
		System.out.println("ȷ�Ϲ�����ִ��");
		
	}
	
	
	

}
