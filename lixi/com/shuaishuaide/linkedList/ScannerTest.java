package com.shuaishuaide.linkedList;

import java.util.Scanner; 

public class ScannerTest {
    public static void main(String[] args) {
       
    	
    	
    	Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
 
        // next��ʽ�����ַ���
        
        System.out.println("next��ʽ���գ�");
        // �ж��Ƿ�������
        while(true){
        if (scan.hasNext()) {
            String str1 = scan.nextLine();
            System.out.println("���������Ϊ��" + str1);
       
        }
    	}
    }
}