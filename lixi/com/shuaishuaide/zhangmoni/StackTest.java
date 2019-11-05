package com.shuaishuaide.zhangmoni;

public class StackTest {

	public static void main(String[] args) {
		
		User u1 = new User("miko",100);
		User u2 = new User("miko",101);
		User u3 = new User("miko",102);
		User u4 = new User("miko",103);
		
		StackMoni s  = new StackMoni();
		
		try{
		s.pussh(u1);
		s.pussh(u2);
		s.pussh(u3);
		s.pussh(u4);
		s.pussh(u3);
		s.pussh(u3);
		
		}catch(StackException e){
			
			e.printStackTrace();
		}
		try{
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		}catch(StackException e){
			e.printStackTrace();
			
		}
	}

}
