package com.shuaishuaide.IO.FileReader;

import java.io.*;

public class Copy02 {//�Լ�д���ļ���������ֻ�ܸ��ƴ��ı��ļ�

	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		FileReader fr = null;
		
		BufferedReader br = null;
		
		try{
			
			fr = new FileReader("C:\\Users\\Administrator\\Desktop\\temp01.txt");//�ڵ���
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\temp02.txt");
			
			br = new BufferedReader(fr);//��װ�����ߴ�����
			/*
			int temp = 0;
			
			char[] chars = new char[502];
			
			while((temp = br.read(chars)) != -1){
				fw.write(chars, 0, temp);
				
				
			}
			*/
			String temp2 = null;//ע����String
			
			while((temp2 = br.readLine()) != null){//br.readLine�����������Դ����з�
				System.out.println(temp2);//���һ��
			}
			
			fw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fw != null){
					fw.close();
				}//if(fr != null){
					//fr.close();
				//}ֻ�ر������Ϳ����ˣ�23�����ģʽ��װ����ģʽ
			if(br != null){
					br.close();
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
