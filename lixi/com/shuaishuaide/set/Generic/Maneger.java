package com.shuaishuaide.set.Generic;

public class Maneger implements Comparable<Maneger>{//����TreeSet����ʵ��Comparable��comparaTo����;���ߴ����Ƚ���������ֻ�ڳ������׶������������ָ�����ͣ�������޷�ͨ����
	
	double sal;
	
	Maneger(double sal){
		this.sal = sal;
	}
	
	public String toString(){		
		return "sal="+sal;
	}
	
	public int compareTo(Maneger m){//Ҳ�����Ƿ�ʡ
		
		double sal1 = this.sal;//���ﲻ��ǿ��ת�;��ܱ���ͨ����
		double sal2 = m.sal;
		
		if(sal1>sal2)
			return 1;
		if(sal1<sal2)
			return -1;
		return 0;
	}
	
	public void work(){
		System.out.println("�ٹ�������ͱ����ˣ�");
	}
}
