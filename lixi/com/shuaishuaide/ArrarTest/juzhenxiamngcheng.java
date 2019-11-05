package com.shuaishuaide.ArrarTest;

public class juzhenxiamngcheng {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,},{1,2,4},{1,3,5}}; 
		int[][] b = {{2,3},{3,4},{7,6}};
		
		int n = a.length;
		int m = b[1].length;
		int[][] c =new int[n][m];
		
		for(int i = 0;i<n;i++){
			
			for(int j = 0;j<m;j++){
				for(int k = 0;k<n;k++){
					c[i][j] = a[i][k]*b[k][j];
				}
			}
		}
		for(int i = 0; i<n;i++){
			for(int j = 0;j<m;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
