package com.shuaishuaide.IO.FileInputStream;

import java.io.*;

public class FIStreamTest01 {

	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		
		try{
			String  filepath = "C:\\Users\\Administrator\\Desktop\\1.jpg";//�ѵ�б�߻���˫б�ߣ�����ת��������Ǿ���·��д��
			
			fis = new FileInputStream(filepath);//���쳣�����ٱ����ڽ��д���
			
			int i1 = fis.read();//���ֽڵķ�ʽ��ȡ
			int i2 = fis.read();//�Զ���ȡ��һ��
			int i3 = fis.read();
			int i4 = fis.read();
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println(i4);
		}catch(FileNotFoundException e){
			
			e.printStackTrace();//��ϸ���쳣����
		}catch(IOException e){
			e.printStackTrace();//�������read���쳣���ұ������FileNotFoundException����
		}finally{
			
			if(fis!=null){
				try{fis.close();//�ر�Ҳ���봦���쳣
				}catch(IOException e){					
					e.printStackTrace();			
				}				
			}			
		}		
	}

}
