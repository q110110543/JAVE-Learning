package com.shuaishuaide.IO.FileInputStream;

import java.io.*;

public class XunHuanDuQu {

	public static void main(String[] args) throws Exception {
		
		String filepath = "C:\\Users\\Administrator\\Desktop\\TT.txt";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		/*while(true){
			int temp = fis.read();//������ȡ���׶�Ӳ�����˺���Ч�ʵס�
			if(temp==13) break;//���������ʦ���Ĳ�һ������13����
			System.out.println(temp);
		}
		*/
		/*
		 * int temp = 0;
		 * while((temp=fis.read()) != 13){//ֱ����while���ж�
		 * 		System.out.println(temp);
		 * }
		 */
		
		//fis.close();
		byte[] bytes = new byte[2];//��ʱ�����ʱ��Ϊtxt�ĵ�������
		
		int i2 = fis.read(bytes);//����ֵ������ζ�ȡ�˶��ٸ��ֽ�
		System.out.println(i2+"hehe");//2
		System.out.println(new String(bytes));
		int i3 = fis.read(bytes);
		System.out.println(i3);
		System.out.println(new String(bytes));//���ܸ��ǵĸ��ǵ�
		int i4 = fis.read(bytes);
		System.out.println(i4);
		System.out.println(new String(bytes,0,i4));//ע���Ǵ�0��ʼ������bytes�Ѿ������¸����ˡ�
		int i5 = fis.read(bytes);
		System.out.println(i5);
		int i6 = fis.read(bytes);
		System.out.println(i6);
		int i7 = fis.read(bytes);
		System.out.println(i7);
		int i8 = fis.read(bytes);
		System.out.println(i8);
		int i9 = fis.read(bytes);
		System.out.println(i9);
		
//===========================================
		//ѭ����ȡ
		String filepath2 = "C:\\Users\\Administrator\\Desktop\\largeW.txt";//����·��
		
		FileInputStream fis2 = new FileInputStream("C:/Users/Administrator/Desktop/myeclipse/lixi/com/shuaishuaide/IO/FileInputStream/XunHuanDuQu.java");//�����ļ���ȡ����
		//��Ȼ���Զ�ȡ�Լ���˵�����������1KB��û�С�
		byte[] bytes2 = new byte[1024];//ÿ��ѭ����ȡ1KB��//ÿ�ζ�ȡ1KB
		
		while(true){
			
			int temp = fis2.read(bytes2);//
			if(temp==-1) break;
			System.out.print(new String(bytes2,0,temp)+"haha");//���ﲻ��Ҫ����ӻ���
			System.out.println("=========");
			
		}
//==================================================
//  available ��
		
		System.out.println(fis.available());//��������ʣ��Ĺ����ֽ���
		//fis.skip(2);���������ֽڲ���ȡ
//===============================================		
		//FileOutputStream���ڴ��е�����д��Ӳ����
		
		
		
	}

}
