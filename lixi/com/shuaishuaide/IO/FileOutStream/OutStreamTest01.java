package com.shuaishuaide.IO.FileOutStream;

import java.io.*;

//����������������ĸ�ʽһ�㶼�ȽϹ̶�

public class OutStreamTest01 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;//����Ӧ�÷�������
		
		try{//�����ļ������Ҳ���봦���쳣
			fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\T2.txt",true);//�ļ���ʽ���Զ����Դ�Сд��//���ַ�ʽ���Զ�������ǰ������,��true�������ĺ����
			//��ʱ��try�ڿ�ʼд������
			String msg = "HelloWorld!";
			
			byte[] bytes = msg.getBytes();
			
			fos.write(bytes,0,3);//ֻд��һ�����Ҳ�����������һ����
			
			fos.flush();//��֤����ǿ��д�룻
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try{
					fos.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}

	}

}
