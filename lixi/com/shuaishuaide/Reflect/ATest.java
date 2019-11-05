package com.shuaishuaide.Reflect;

public class ATest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//发生了类加载，A.Class装载到了JVM虚拟机
		Class c = Class.forName("com.shuaishuaide.Reflect.A");//需要处理异常，必须写完整的包顺序；不能单写类名。//这里不会调用无参数构造方法
		
		//Class c = A.class;//不会加载到JVM虚拟机
		
		//A a = new A();//创建对象会自动调用无参数构造方法；内部的方法会执行。
		
		//Class c2 = a.getClass();//会加载，但只会加载一个，所以只会输出一个A... 
		
		//获取Class类型的对象之后，可以创建该“类”的对象.InStance()
		Object o = c.newInstance();//forName要newInstanc()后才调用无参数构造方法，如果没有无参构造方法就会出错
		
		System.out.println(o);//自动调用未重写的toString方法
		//
	}

}
