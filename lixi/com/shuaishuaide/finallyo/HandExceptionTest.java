package com.shuaishuaide.finallyo;

public class HandExceptionTest {

	public static void main(String[] args) {

		String username = "jack";
		
		HandException hand = new HandException();
		
		try{
			hand.register(username);
		
		}catch(IllegalNameException e){
			
			System.out.println(e.getMessage());
		}
		
	}

}
