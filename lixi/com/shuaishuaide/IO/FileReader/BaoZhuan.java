package com.shuaishuaide.IO.FileReader;

import java.io.*;

public class BaoZhuan {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO\\FileReader\\BaoZhuan.java");
		
		InputStreamReader isr = new InputStreamReader(fis);//���ֽ���ת��Ϊ�ַ���
		
		BufferedReader br = new BufferedReader(isr);//���봫���ַ���Reader���� isr�����br�ǽڵ����������fis�ǰ�װ��
		
		String temp = null;//�ַ�����temp������readline()�����Ķ�Ӧ��ϵ
		
		while((temp = br.readLine()) != null){
			System.out.println(temp);
		}
		
		br.close();//ֻ�ر���������
	}

}
