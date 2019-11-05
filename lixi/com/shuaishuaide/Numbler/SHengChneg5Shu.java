package com.shuaishuaide.Numbler;

import java.util.*;
import java.math.*;
import Std.*;

public class SHengChneg5Shu {//m1方法与m2方法的执行效率天差地别

	public static void main(String[] args) {
		
		int N = 5;	
		int M = 5;
		int sum = 0;
		int ALL =1000000;
	
		
		//System.out.println(m3(N,M));

		
		
		for(int i = 0; i<ALL; i++){//m1正确修改后为10次平均值
			
			sum += m3(N,M);
			
		}
		
	
		
		System.out.println(sum/ALL+"m3");
		
		sum = 0;
		
		for(int i = 0; i<ALL; i++){//m1正确修改后为10次平均值
			
			sum += m1(N,M);
		}
		System.out.println(sum/ALL+"m1");
		
		sum = 0;
		
		for(int i = 0; i<ALL; i++){//m1正确修改后为10次平均值
			
			sum += m2(N,M,0);
		}
		System.out.println(sum/ALL+"m2");
		
		
		
		
		/*
		int[] a ;
		
		a= m3(N,M);
		for(int i =0; i<N;i++){
			System.out.println(a[i]);//这里一定不能写m方法调用的形式啊！！！！！！！！！！！
		}
		*/
		//System.out.println(m1(N,M));
		}
		
		
		
	
	public static int m1(int N,int M){//暴力随机方法实现的——初级想法。//采取的是每次验证赋值法
		
		int[] a = new int[N];
		
		Random r = new Random();
				
		a[0] = r.nextInt(M);
		int k = 0;
		for(int i = 1; i<N;i++){			
			int d = 0;//必须在此处声明;for后while前
			while(d<i){//起到了if的作用但不能换为if。							
				int b = r.nextInt(M);				
				for(int j =0; j<i; j++){
					if(a[j] != b){
						d++;	//d和j实际错位1，所以下面判断d==1是可行的，				
					}else{
						k++;
						//System.out.println("---------");
						b = r.nextInt(M);
						j = -1;
						d = 0;	
						
					}
				/*	if(d==i){//这个if语句在内外都没关系，但是应该在外面执行效率更高，另外这一暴力方式及其复杂，j = -1；与j<i 以前是j =0；与j<=i 细节上及其容易出错，应该
						     //采用m2()方法，分块方式编程，而不是连续化的思维，这样思路清洗不出错，且只需修改任意一模块即可，模块间交互。不会一错全错。
							//m2()的方法效率比m1()的效率更高。
						a[i] = b;
						k++;											
				}*/
				}
				if(d==i){
					k++;
					//System.out.println("++++++++++");
					a[i] = b;	
				}
				
			}		
		}
		return k;
	}
	
	
	public static int m2(int N,int M,int k){//本次采用数学随机——并应用递归调用
		
		int[] a = new int[N];
		
		Random r = new Random();
		
		for(int i = 0;i<N;i++){
			
			a[i] = r.nextInt(M);
			
		}
		for(int i = 1;i < N;i++){//由于 模块化的思维，这里还可以单独定义出一个方法
			for(int j = 0; j<i;j++){
				
				if(a[i]==a[j]){
					k++;
					//System.out.println(k);
					return m2(N,M,k);//很高概率不会执行(呵呵)//注意最终return与重复调用return的区别。
				}
				
			}
		}
		
		
		
		return k+1;
	}
	
	public static int m3(int N, int M){
		
		int index = 0;
		int k = -1;
		Random r = new Random();
		
		int[] a = new int[N];
		
		while(index < N){
			
			int temp = r.nextInt(M);
			k++;	
			if(!contains(a,index,temp)){
				a[index] = temp;
				index++;
				//System.out.println("----------");
				
			}			
		}
		return k;
	}
	
	public static boolean contains(int[] a, int index, int temp){
		
		for(int i=0; i<index;i++){//这里其实是m2m3方法的综合，因为以前无法对if的累计判断；m1采取了for循环内判断，实际上m3也是，所以从意义上相当于把m1内层的for循环拿出来了，相当于
									//	把m2方法的for循环独立出来了
								//杜老师的视频方法没有index选项，则可能陷入死循环，
			
			if(a[i]==temp){			
				
				//System.out.println("+++++++++");
				return true;
				
				
			}
			
		}
	
		
		return false;
	} 
}
		
		

	
	

