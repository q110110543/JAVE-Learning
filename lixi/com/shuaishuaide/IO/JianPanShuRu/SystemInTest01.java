package com.shuaishuaide.IO.JianPanShuRu;

import java.io.*;
//import java.util.*;

public class SystemInTest01 {

	public static void main(String[] args) throws Exception {
		
		/*这种方式用next不会键入空格可以改为nextLine()的方法
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		System.out.println("您输入了： "+str);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//注意内部也必须new才行
		
		String str = br.readLine();//因为调用了ReadLine()方法，所以一读读一行。//这里输入了之后才会执行下面的语句
		
		System.out.println("您输入了："+ str);
		
		br.close();
		
		BufferedWriter bw  =new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\temp03.txt"));
		
		bw.write("帅帅的鹅");
		bw.newLine();
		bw.write("真的很帅啊！");
		bw.close();
	}

}
