package com.shuaishuaide.linkedList;

public class listTest {
	
	Entry entry;
	
	listTest(){//自动创建一个链表对象并创建一个空节点
		
		entry = new Entry(null,null);
	}
	
	static class Entry{                                 //这一大段其实可以单独提出来看就明白了，可以外部类直接访问内部类
		
		Object data =null;								//
		
		Entry next = null;                             //
		
		Entry(){}									  //
		
		Entry(Object data, Entry next){				  //
			
			this.data = data;						//
			this.next = next;						//
		}
	}
	

}
