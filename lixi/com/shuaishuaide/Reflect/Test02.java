package com.shuaishuaide.Reflect;
/*
 * io��properties
 * �����ļ�ʹ�ó���������ɱ�Ķ�������д�������ļ��У���д�����ļ��С�
 * dbinfor�������������ݵ��ļ����������ļ���java�淶��Ҫ�������ļ��ԡ�.properties��������һ����֪��д��key��valus��//�Ǳ���//�Ⱥ�/ð��/�ո�Ҳ���ԣ�˭���ֵ�һ����˭
 * ��native2ascilת����
 */
import java.util.*;
import java.io.*;

public class Test02 {
	
	public static void main(String[] args) throws IOException{
		
		Properties p = new Properties();//��mapһ����ȫ�ַ�����Key�����ظ������򸲸�
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\dbinfor.properties");//����Ҫ�׳��쳣
		
		//fis���е��������ݼ��ص����Զ���
		p.load(fis);//����Ҳ���쳣
		
		String v = p.getProperty("username");
		
		System.out.println(v);//����Ҫ���±���������г���key���ܶ�
		
		//���������
	}

}
