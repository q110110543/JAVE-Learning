package com.shuaishuaide.IO.File;

//File���ļ���Ŀ¼·�����ĳ����ʾ
//����Ӳ���ϵ��ļ��к��ļ�

import java.io.*;
import java.util.*;
import java.text.*;

public class Test01 {

	public static void main(String[] args)throws Exception{
		
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\temp06.DBF");
		
		System.out.println(f1.exists());
		
		File f4 = new File("C:/TT");//�����ļ�Ŀ¼
		
		//f4.mkdir();
		
		f4.createNewFile();
		
		File f5 = new File("c:/a/b/d/e/f/g");
		
		if(!f5.exists()){
			f5.mkdirs();//��������Ŀ¼
		}
		
		File f2 = new File("Test01");
		
		String absolutePath = f2.getAbsolutePath();
		
		System.out.println(absolutePath);
		
		String temp = null;
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO\\File\\Test01.java");
		
		File f6 = new File("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO\\File\\Test01.java");
		
		System.out.println(f6.getName());
		
		BufferedReader br = new BufferedReader(fr);
		
		while((temp = br.readLine()) != null){
			//System.out.println(temp);
		}
		
		Date t = new Date(f6.lastModified());//��long����ת��Ϊʱ��������;ȷ���ļ����༭ʱ��
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
		
		File f7 = new File("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO");
		
		File[] fs = f7.listFiles();//���ص���һ������
		
		for(File f:fs){//��ǿforѭ��
			//System.out.println(f.getAbsolutePath());//�Ӳ���getAbsolutePath()�����ӡ����·����		
			if(f.getAbsolutePath().endsWith(".java")){//���endsWith()��String�ķ�����//��������Ҫ�ѳ���API������Ϥ��
				System.out.println(f.getAbsolutePath());
			}
		}
		
	}

}
