package com.shuaishuaide.linkedList;

public class listTest {
	
	Entry entry;
	
	listTest(){//�Զ�����һ��������󲢴���һ���սڵ�
		
		entry = new Entry(null,null);
	}
	
	static class Entry{                                 //��һ�����ʵ���Ե�����������������ˣ������ⲿ��ֱ�ӷ����ڲ���
		
		Object data =null;								//
		
		Entry next = null;                             //
		
		Entry(){}									  //
		
		Entry(Object data, Entry next){				  //
			
			this.data = data;						//
			this.next = next;						//
		}
	}
	

}
