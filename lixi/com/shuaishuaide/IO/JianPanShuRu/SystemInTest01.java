package com.shuaishuaide.IO.JianPanShuRu;

import java.io.*;
//import java.util.*;

public class SystemInTest01 {

	public static void main(String[] args) throws Exception {
		
		/*���ַ�ʽ��next�������ո���Ը�ΪnextLine()�ķ���
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		System.out.println("�������ˣ� "+str);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//ע���ڲ�Ҳ����new����
		
		String str = br.readLine();//��Ϊ������ReadLine()����������һ����һ�С�//����������֮��Ż�ִ����������
		
		System.out.println("�������ˣ�"+ str);
		
		br.close();
		
		BufferedWriter bw  =new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\temp03.txt"));
		
		bw.write("˧˧�Ķ�");
		bw.newLine();
		bw.write("��ĺ�˧����");
		bw.close();
	}

}
