package com.shuaishuaide.Numbler;

public class EnumTest01 {

	public static void main(String[] args) {	
		
		int a =10;
		int b = 0;
		
		Result retValue = divide(a,b);
		
		System.out.println(retValue);		 

	}
	
	public static Result divide(int a, int b){
		
		try{
			
			int c = a /b;
			return Result.SUCCESS;
			
		}catch(Exception e){
			
			return Result.FALL;
		}
		
		
	}

}
enum Result{
	
	SUCCESS,FALL//枚举类型这样在编译期就取消错误//有限的类型；
	
}