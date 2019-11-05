package com.shuaishuaide.IO.FileReader;

import java.io.*;

public class BaoZhuan {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\myeclipse\\lixi\\com\\shuaishuaide\\IO\\FileReader\\BaoZhuan.java");
		
		InputStreamReader isr = new InputStreamReader(fis);//将字节流转化为字符流
		
		BufferedReader br = new BufferedReader(isr);//必须传入字符流Reader类型 isr相对于br是节点流；相对于fis是包装流
		
		String temp = null;//字符流的temp设置与readline()方法的对应关系
		
		while((temp = br.readLine()) != null){
			System.out.println(temp);
		}
		
		br.close();//只关闭最外层可以
	}

}
