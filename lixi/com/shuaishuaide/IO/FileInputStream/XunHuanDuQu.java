package com.shuaishuaide.IO.FileInputStream;

import java.io.*;

public class XunHuanDuQu {

	public static void main(String[] args) throws Exception {
		
		String filepath = "C:\\Users\\Administrator\\Desktop\\TT.txt";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		/*while(true){
			int temp = fis.read();//反复读取容易对硬盘有伤害，效率底。
			if(temp==13) break;//这里与杜老师讲的不一样，是13出来
			System.out.println(temp);
		}
		*/
		/*
		 * int temp = 0;
		 * while((temp=fis.read()) != 13){//直接再while中判断
		 * 		System.out.println(temp);
		 * }
		 */
		
		//fis.close();
		byte[] bytes = new byte[2];//有时候出错时因为txt文档的问题
		
		int i2 = fis.read(bytes);//返回值代表这次读取了多少个字节
		System.out.println(i2+"hehe");//2
		System.out.println(new String(bytes));
		int i3 = fis.read(bytes);
		System.out.println(i3);
		System.out.println(new String(bytes));//将能覆盖的覆盖掉
		int i4 = fis.read(bytes);
		System.out.println(i4);
		System.out.println(new String(bytes,0,i4));//注意是从0开始，这里bytes已经被重新覆盖了。
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
		//循环读取
		String filepath2 = "C:\\Users\\Administrator\\Desktop\\largeW.txt";//创建路径
		
		FileInputStream fis2 = new FileInputStream("C:/Users/Administrator/Desktop/myeclipse/lixi/com/shuaishuaide/IO/FileInputStream/XunHuanDuQu.java");//生成文件读取流。
		//居然可以读取自己，说明这个程序连1KB都没有。
		byte[] bytes2 = new byte[1024];//每次循环读取1KB；//每次读取1KB
		
		while(true){
			
			int temp = fis2.read(bytes2);//
			if(temp==-1) break;
			System.out.print(new String(bytes2,0,temp)+"haha");//这里不需要额外加换行
			System.out.println("=========");
			
		}
//==================================================
//  available 与
		
		System.out.println(fis.available());//返回流中剩余的估计字节数
		//fis.skip(2);跳过多少字节不读取
//===============================================		
		//FileOutputStream将内存中的数据写入硬盘中
		
		
		
	}

}
