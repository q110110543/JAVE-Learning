package com.shuaishuaide.zuoye.HotelManage;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("��ӭʹ�þƵ����ϵͳ");
		
		Hotel h = new Hotel();
		
		h.print();
		
		while(true){
			
			System.out.println("�����뷿���ţ�  ");
			
			String no = s.next();
			
			h.order(no);
			
			h.print();
		}
	}

}
