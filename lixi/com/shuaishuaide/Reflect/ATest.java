package com.shuaishuaide.Reflect;

public class ATest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//����������أ�A.Classװ�ص���JVM�����
		Class c = Class.forName("com.shuaishuaide.Reflect.A");//��Ҫ�����쳣������д�����İ�˳�򣻲��ܵ�д������//���ﲻ������޲������췽��
		
		//Class c = A.class;//������ص�JVM�����
		
		//A a = new A();//����������Զ������޲������췽�����ڲ��ķ�����ִ�С�
		
		//Class c2 = a.getClass();//����أ���ֻ�����һ��������ֻ�����һ��A... 
		
		//��ȡClass���͵Ķ���֮�󣬿��Դ����á��ࡱ�Ķ���.InStance()
		Object o = c.newInstance();//forNameҪnewInstanc()��ŵ����޲������췽�������û���޲ι��췽���ͻ����
		
		System.out.println(o);//�Զ�����δ��д��toString����
		//
	}

}
