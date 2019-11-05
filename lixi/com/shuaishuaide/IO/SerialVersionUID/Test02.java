package com.shuaishuaide.IO.SerialVersionUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test02 {

	public static void main(String[] args) throws Exception {

//==============================================
//∑¥–Ú¡–ªØ
				
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\temp06.DBF"));
		
		Object o1 = ois.readObject();
		
		System.out.println(o1);
		
		ois.close();
	}

}
