package com.shuaishuaide.zhangmoni;
public class StackMoni {
	
	Object[] elements;
	
	int index;
	
	public StackMoni(){
		this(4);
	}
	
	
	public StackMoni(int max){
		
		elements = new Object[max];
	}
	
	public void pussh(Object element) throws StackException {
		if(index == elements.length){
			throw new StackException("张一曼！");
		}
		elements[index++] = element;
	}
	public Object pop() throws StackException{
		if(index== 0){
			throw new StackException("空数据");
			
		}
		return elements[--index];
	}
}
