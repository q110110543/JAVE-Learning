package com.shuaishuaide.IO;

import java.io.*;
import java.util.*;
import java.text.*;

public class Print {
//Ĭ�ϴ�ӡ������̨
	public static void main(String[] args) throws Exception {
		
		System.out.println("haha");
		
		PrintStream ps = System.out;
		
		ps.println("java.....");
		
		System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\log.txt")));//������뿴api�ĵ�
		
		//setOut�ı��������PrintStream����OutputStream������Ϊ�ǳ���ģ�����newһ��FileOutputStream;
		
		System.out.println("hahahahhaha");//��ӡ���ļ��ͽ���log��־�ĵ��ˡ�
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		
		System.out.println("m1������ʼ����ʱ�� "+ sdf.format(new Date()));
		
		m1();
		
		System.out.println("m1����������ʱ�� "+ sdf.format(new Date()));//�����ϲ���Ҫ1mm�� 
		
		
	}
	
	public static void m1(){
		System.out.println("m1 method execute!");
	}

}
