package com.shuaishuaide.maopaopaixu;

public class XuanZhePaiXu {

	public static void main(String[] args) {
		
		int[] a = {1,3,4,6,2,6,7};
		
		
		
		for(int i =a.length-1 ;i>0;i--){
			
		
			int x = 1;//变量声明的位置很重要。
			int temp =0;
			
			for(int j = 0;j<=i; j++){
				
				if(a[j]>a[x]){
					
					x = j;//这里x穿透了内层的for循环，通过在外层for循环声明的方式；并且保存了指针。
							//通过指针的形式寻找最大值，而不是直接针对最大值。//外部声明的非参数的穿透形式
				}
			}
			
			if(x!=0){//若不加if语句则每一次都要执行下面三段语句，但若加上这可以有限的（重复的数越多见减少的越多）减少。
			temp = a[i];
			a[i] =a[x];
			a[x] = temp;
			}
		
		}
		
		for(int i= 0; i<=a.length-1;i++){
			System.out.print(a[i]+" ");
		
		}
	}

}
