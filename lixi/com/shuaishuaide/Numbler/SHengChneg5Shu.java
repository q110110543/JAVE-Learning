package com.shuaishuaide.Numbler;

import java.util.*;
import java.math.*;
import Std.*;

public class SHengChneg5Shu {//m1������m2������ִ��Ч�����ر�

	public static void main(String[] args) {
		
		int N = 5;	
		int M = 5;
		int sum = 0;
		int ALL =1000000;
	
		
		//System.out.println(m3(N,M));

		
		
		for(int i = 0; i<ALL; i++){//m1��ȷ�޸ĺ�Ϊ10��ƽ��ֵ
			
			sum += m3(N,M);
			
		}
		
	
		
		System.out.println(sum/ALL+"m3");
		
		sum = 0;
		
		for(int i = 0; i<ALL; i++){//m1��ȷ�޸ĺ�Ϊ10��ƽ��ֵ
			
			sum += m1(N,M);
		}
		System.out.println(sum/ALL+"m1");
		
		sum = 0;
		
		for(int i = 0; i<ALL; i++){//m1��ȷ�޸ĺ�Ϊ10��ƽ��ֵ
			
			sum += m2(N,M,0);
		}
		System.out.println(sum/ALL+"m2");
		
		
		
		
		/*
		int[] a ;
		
		a= m3(N,M);
		for(int i =0; i<N;i++){
			System.out.println(a[i]);//����һ������дm�������õ���ʽ������������������������
		}
		*/
		//System.out.println(m1(N,M));
		}
		
		
		
	
	public static int m1(int N,int M){//�����������ʵ�ֵġ��������뷨��//��ȡ����ÿ����֤��ֵ��
		
		int[] a = new int[N];
		
		Random r = new Random();
				
		a[0] = r.nextInt(M);
		int k = 0;
		for(int i = 1; i<N;i++){			
			int d = 0;//�����ڴ˴�����;for��whileǰ
			while(d<i){//����if�����õ����ܻ�Ϊif��							
				int b = r.nextInt(M);				
				for(int j =0; j<i; j++){
					if(a[j] != b){
						d++;	//d��jʵ�ʴ�λ1�����������ж�d==1�ǿ��еģ�				
					}else{
						k++;
						//System.out.println("---------");
						b = r.nextInt(M);
						j = -1;
						d = 0;	
						
					}
				/*	if(d==i){//���if��������ⶼû��ϵ������Ӧ��������ִ��Ч�ʸ��ߣ�������һ������ʽ���临�ӣ�j = -1����j<i ��ǰ��j =0����j<=i ϸ���ϼ������׳���Ӧ��
						     //����m2()�������ֿ鷽ʽ��̣���������������˼ά������˼·��ϴ��������ֻ���޸�����һģ�鼴�ɣ�ģ��佻��������һ��ȫ��
							//m2()�ķ���Ч�ʱ�m1()��Ч�ʸ��ߡ�
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
	
	
	public static int m2(int N,int M,int k){//���β�����ѧ���������Ӧ�õݹ����
		
		int[] a = new int[N];
		
		Random r = new Random();
		
		for(int i = 0;i<N;i++){
			
			a[i] = r.nextInt(M);
			
		}
		for(int i = 1;i < N;i++){//���� ģ�黯��˼ά�����ﻹ���Ե��������һ������
			for(int j = 0; j<i;j++){
				
				if(a[i]==a[j]){
					k++;
					//System.out.println(k);
					return m2(N,M,k);//�ܸ߸��ʲ���ִ��(�Ǻ�)//ע������return���ظ�����return������
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
		
		for(int i=0; i<index;i++){//������ʵ��m2m3�������ۺϣ���Ϊ��ǰ�޷���if���ۼ��жϣ�m1��ȡ��forѭ�����жϣ�ʵ����m3Ҳ�ǣ����Դ��������൱�ڰ�m1�ڲ��forѭ���ó����ˣ��൱��
									//	��m2������forѭ������������
								//����ʦ����Ƶ����û��indexѡ������������ѭ����
			
			if(a[i]==temp){			
				
				//System.out.println("+++++++++");
				return true;
				
				
			}
			
		}
	
		
		return false;
	} 
}
		
		

	
	

