package com.shuaishuaide.maopaopaixu;

public class XuanZhePaiXu {

	public static void main(String[] args) {
		
		int[] a = {1,3,4,6,2,6,7};
		
		
		
		for(int i =a.length-1 ;i>0;i--){
			
		
			int x = 1;//����������λ�ú���Ҫ��
			int temp =0;
			
			for(int j = 0;j<=i; j++){
				
				if(a[j]>a[x]){
					
					x = j;//����x��͸���ڲ��forѭ����ͨ�������forѭ�������ķ�ʽ�����ұ�����ָ�롣
							//ͨ��ָ�����ʽѰ�����ֵ��������ֱ��������ֵ��//�ⲿ�����ķǲ����Ĵ�͸��ʽ
				}
			}
			
			if(x!=0){//������if�����ÿһ�ζ�Ҫִ������������䣬����������������޵ģ��ظ�����Խ������ٵ�Խ�ࣩ���١�
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
