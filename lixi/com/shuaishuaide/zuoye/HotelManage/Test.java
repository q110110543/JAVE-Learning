package com.shuaishuaide.zuoye.HotelManage;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("欢迎使用酒店管理系统");
		
		Hotel h = new Hotel();
		
		h.print();
		
		while(true){
			
			System.out.println("请输入房间编号：  ");
			
			String no = s.next();
			
			h.order(no);
			
			h.print();
		}
	}

}
