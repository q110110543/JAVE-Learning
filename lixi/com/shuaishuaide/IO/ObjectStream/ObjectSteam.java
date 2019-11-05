package com.shuaishuaide.IO.ObjectStream;

import java.io.*;

public class ObjectSteam {//！！！！！不支持序列化错误！！！！！！ n
	//与DateStream一样是专项流,所以看不懂
	public static void main(String[] args) throws Exception{
		
	//java.io.ObjectOutputStrea序列化Java对象到硬盘（Serial）
	//java.io.ObjectIntputStream将硬盘中的对象“反序列化”到内存(DeSerial)
		
		User u1 = new User("刘德华");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\temp04"));
		
		oos.writeObject(u1);
		
		oos.flush();
		oos.close();
//==========================================================
		
//反序列化
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\temp04"));
		
		Object o1 = ois.readObject();//这里存在父类型的引用，指向子类型的对象。
		
		System.out.println(o1);//这里会调toString方法，
		
		ois.close();
	}

}
