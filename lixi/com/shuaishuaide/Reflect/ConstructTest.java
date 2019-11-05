package com.shuaishuaide.Reflect;

import java.lang.reflect.*;

public class ConstructTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//比较固定的一个方法
		Class c = Class.forName("java.lang.String");
		
		Constructor[] cs = c.getDeclaredConstructors();
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getName() + "{\n");
		
		for(Constructor con:cs){
			
			sb.append("\t");
			sb.append(Modifier.toString(con.getModifiers()) + " ");
			sb.append(c.getSimpleName()+" (");
			
			Class[] parameterTypes = con.getParameterTypes();
			for(int i=0; i<parameterTypes.length; i++){
				
				Class parameterType = parameterTypes[i];
				
				if(i==parameterTypes.length-1) sb.append(parameterType.getSimpleName());
				else sb.append(parameterType.getSimpleName() + ",");
			}
			
			sb.append(") {}\n");
		}
		sb.append("}");
		
		System.out.println(sb);
//=========================================================================
		//获取某个特定的构造方法
		//不是invoke()而是com.newInstance()方法;这里不是调用无参数钩爪方法，而是要传入实参
	}

}
