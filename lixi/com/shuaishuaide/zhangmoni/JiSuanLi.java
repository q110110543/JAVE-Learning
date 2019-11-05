package com.shuaishuaide.zhangmoni;

import Std.StdOut;

public class JiSuanLi {

	public static void main(String[] args) {
		
		for(int N = 0; N< 100; N++){
			StdOut.print(N +" " + F(N));
			}
		
	}
	
	public static long F(int N){
		
		if(N==0) return 0;
		if(N==1) return 1;
		return F(N-1) + F(N-2);
	}

}
