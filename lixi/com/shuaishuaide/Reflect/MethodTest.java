package com.shuaishuaide.Reflect;

import java.lang.reflect.*;

public class MethodTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Class c = Class.forName("com.shuaishuaide.Reflect.MethodUser");
		//Class c = Class.forName("java.lang.String");
		
		Method[] med = c.getDeclaredMethods();//注意数组不加s
		int i = 0;
		/*
		for(Method m: med){
			
			System.out.println(i++);
			System.out.print(Modifier.toString(m.getModifiers())+" ");
			System.out.print(m.getReturnType().getSimpleName()+" ");//是teturnType而不是Type();
			System.out.print(m.getName()+" ");//与Field类似
			System.out.print("(");
			
			//获取形参
			Class[] parameterTypes = m.getParameterTypes();
			for(Class parameterType: parameterTypes){
				System.out.print(parameterType.getSimpleName()+" ");
			}
			System.out.println(")");
			System.out.println("=========");
			
		}	
		*/	
		/*
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+" class " + c.getSimpleName()+" {");
		
		
		for(Method m: med){
			//System.out.println("+++++++++");
			
			sb.append("\n");
			sb.append("\t");//缩进
			sb.append(++i + " ");
			sb.append(Modifier.toString(m.getModifiers())+" ");
			sb.append(m.getReturnType().getSimpleName()+" ");//是teturnType而不是Type();
			sb.append(m.getName()+" ");//与Field类似
			sb.append("(");
			
			//获取形参
			Class[] parameterTypes = m.getParameterTypes();
			for(Class parameterType: parameterTypes){//for循环末尾没有空格 // if else语句； 
				sb.append(parameterType.getSimpleName()+" ");
			}
			sb.append(") {}");
			
			
		}	
		sb.append("\n}");
		
		System.out.println(sb);
		*/
//===============================================		
		//获取某个特定的方法，通过反射机制调用。
		//MethodUser mu = new MethodUser();   //以前的方法调用方法。
		//boolean isSuccess = mu.logIn("admin","123");
		
		Method m = c.getDeclaredMethod("logIn", String.class, String.class);//需要class类型
		
		Object o = c.newInstance();
		
		Object retValue = m.invoke(o, "admin","123");//m代表方法，o代表方法所属于的对象
		
		System.out.println(retValue);
	}

}
