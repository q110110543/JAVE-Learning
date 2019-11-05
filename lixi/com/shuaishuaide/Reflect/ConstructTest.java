package com.shuaishuaide.Reflect;

import java.lang.reflect.*;

public class ConstructTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//�ȽϹ̶���һ������
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
		//��ȡĳ���ض��Ĺ��췽��
		//����invoke()����com.newInstance()����;���ﲻ�ǵ����޲�����צ����������Ҫ����ʵ��
	}

}
