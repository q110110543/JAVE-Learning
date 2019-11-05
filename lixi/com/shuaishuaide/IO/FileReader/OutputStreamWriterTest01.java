package com.shuaishuaide.IO.FileReader;

import java.io.*;

public class OutputStreamWriterTest01 {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\temp01.txt",true);
		
		fw.write("李海波！！！！");//不会写入“”
		
		char[] chars = {'帅','帅','的','鹅','！','！'};
		
		fw.write(chars,0,5);
		
		
		fw.flush();
		fw.close();
		
	}

}
