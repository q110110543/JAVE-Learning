package com.shuaishuaide.Reflect;

import java.lang.reflect.*;

public class MethodTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Class c = Class.forName("com.shuaishuaide.Reflect.MethodUser");
		//Class c = Class.forName("java.lang.String");
		
		Method[] med = c.getDeclaredMethods();//ע�����鲻��s
		int i = 0;
		/*
		for(Method m: med){
			
			System.out.println(i++);
			System.out.print(Modifier.toString(m.getModifiers())+" ");
			System.out.print(m.getReturnType().getSimpleName()+" ");//��teturnType������Type();
			System.out.print(m.getName()+" ");//��Field����
			System.out.print("(");
			
			//��ȡ�β�
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
			sb.append("\t");//����
			sb.append(++i + " ");
			sb.append(Modifier.toString(m.getModifiers())+" ");
			sb.append(m.getReturnType().getSimpleName()+" ");//��teturnType������Type();
			sb.append(m.getName()+" ");//��Field����
			sb.append("(");
			
			//��ȡ�β�
			Class[] parameterTypes = m.getParameterTypes();
			for(Class parameterType: parameterTypes){//forѭ��ĩβû�пո� // if else��䣻 
				sb.append(parameterType.getSimpleName()+" ");
			}
			sb.append(") {}");
			
			
		}	
		sb.append("\n}");
		
		System.out.println(sb);
		*/
//===============================================		
		//��ȡĳ���ض��ķ�����ͨ��������Ƶ��á�
		//MethodUser mu = new MethodUser();   //��ǰ�ķ������÷�����
		//boolean isSuccess = mu.logIn("admin","123");
		
		Method m = c.getDeclaredMethod("logIn", String.class, String.class);//��Ҫclass����
		
		Object o = c.newInstance();
		
		Object retValue = m.invoke(o, "admin","123");//m��������o�����������ڵĶ���
		
		System.out.println(retValue);
	}

}
