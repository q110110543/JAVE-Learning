package com.shuaishuaide.IO.SerialVersionUID;

import java.io.*;

public class Test01 {

	public static void main(String[] args) throws Exception {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\temp06.DBF"));
		
		User u1 = new User("˧˧�Ķ�");
		
		oos.writeObject(u1);
		
		oos.flush();
		
		oos.close();
//==============================================
//�����л�,���ļ�д���ڴ��У�
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\temp06.DBF"));
		
		Object o1 = ois.readObject();
		
		System.out.println(o1);
		
		ois.close();
	}

}
