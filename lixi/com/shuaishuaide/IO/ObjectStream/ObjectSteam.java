package com.shuaishuaide.IO.ObjectStream;

import java.io.*;

public class ObjectSteam {//������������֧�����л����󣡣��������� n
	//��DateStreamһ����ר����,���Կ�����
	public static void main(String[] args) throws Exception{
		
	//java.io.ObjectOutputStrea���л�Java����Ӳ�̣�Serial��
	//java.io.ObjectIntputStream��Ӳ���еĶ��󡰷����л������ڴ�(DeSerial)
		
		User u1 = new User("���»�");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\temp04"));
		
		oos.writeObject(u1);
		
		oos.flush();
		oos.close();
//==========================================================
		
//�����л�
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\temp04"));
		
		Object o1 = ois.readObject();//������ڸ����͵����ã�ָ�������͵Ķ���
		
		System.out.println(o1);//������toString������
		
		ois.close();
	}

}
