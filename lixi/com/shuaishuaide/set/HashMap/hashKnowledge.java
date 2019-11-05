package com.shuaishuaide.set.HashMap;

import java.util.*;
import java.text.*;


public class hashKnowledge  {
	
	public static void main (String[] args) throws Exception {
		
		Set s = new HashSet();
		
		s.add(1);
		s.add(2);
		s.add(3);
		
		s.add(2);
		
		Iterator it  = s.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());//�߰汾��HashSet�Ѿ������ˡ�
		
		}
		
		String st1 = "2008-08-08";
		
		String st2 = "2009-07-06";
		
		SortedSet times = new TreeSet();
		
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(st1);
		
		Date t1 = sdf.parse(st1);
		
		Date t2 = sdf.parse(st2);
		
		System.out.println(sdf.format(t1));
		
		times.add(t2);
		
		times.add(t1);
		
		it = times.iterator();
		
		while(it.hasNext()){
			
			Object element = it.next();
			
			if(element instanceof Date){
				
				Date t = (Date) element;//ͨ��������������ʱ���ʽ
				System.out.println(sdf.format(t));
				System.out.println(it.next());
			}
		}
		
		User u1 = new User("55");//2  3  hashSet ��˳����Ȼ�ǹ̶��ģ���ʵȻ������
		User u2 = new User("55");//1 5
		User u3 = new User("33");//5  2
		User u4 = new User("54");//3  1
		User u5 = new User("13");//4   4
		
		Set users = new HashSet();//TreeSet users = new TreeSet();//Set users = new HashSet();//SortedSet users = new SortedSet();����HashSet���Զ������������ʦ�� SortedSet users = new TrssSet();����̳�comparable����
	    
	    users.add(u2);
	    users.add(u1);
	    users.add(u4);
	    users.add(u5);
	    users.add(u3);
	    
	    it = users.iterator();
	    
	    while(it.hasNext()){
	    	
	    	System.out.println(it.next());
	    }
		
		
	}

}
