package com.shuaishuaide.Reflect;

import java.util.*;
import java.io.*;

public class DongTaiDuiXiang {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//1.�������Զ���
		Properties p = new Properties();
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\Classinfo.properties");
		
		p.load(fr);
		
		fr.close();
		
		String className = p.getProperty("className");
		
		System.out.println(className);
		
		//ͨ������ƴ�������,��̬��������
		
		Class c = Class.forName(className);//�������д��ϸ�İ�����
		
		Object o  = c.newInstance();
		
		System.out.println(o);
		
		//ʹ�÷�����ƽ�����϶ȡ�
	}

}
