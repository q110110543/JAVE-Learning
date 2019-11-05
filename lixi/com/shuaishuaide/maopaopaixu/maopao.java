package com.shuaishuaide.maopaopaixu;

public class maopao {
	
	public static void main(String[] args){
	
	int[] a = {1,24,2,7,2,8,4,9,8,3,2,5,4};
	
	
	
	for(int i = a.length-1; i>0; i--){
		
		for(int j = 0; j<i; j++){
			
			if(a[j] > a[j+1]){
				int temp;
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
			
			
			
		}
		
	}for(int i = 0; i < a.length; i++){
		System.out.print(a[i]+" ");
	}
		
		
	}

}
