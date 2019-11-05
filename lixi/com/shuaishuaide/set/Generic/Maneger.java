package com.shuaishuaide.set.Generic;

public class Maneger implements Comparable<Maneger>{//调用TreeSet必须实现Comparable的comparaTo方法;或者创建比较器，范形只在程序编译阶段有用如果不是指定类型，其编译无法通过。
	
	double sal;
	
	Maneger(double sal){
		this.sal = sal;
	}
	
	public String toString(){		
		return "sal="+sal;
	}
	
	public int compareTo(Maneger m){//也可以是反省
		
		double sal1 = this.sal;//这里不用强制转型就能编译通过。
		double sal2 = m.sal;
		
		if(sal1>sal2)
			return 1;
		if(sal1<sal2)
			return -1;
		return 0;
	}
	
	public void work(){
		System.out.println("再工作三天就被辞退！");
	}
}
