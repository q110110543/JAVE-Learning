package com.shuaishuaide.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FiledTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		
		Class c = Class.forName("com.shuaishuaide.Reflect.FieldUser");
		
		Field[] fs = c.getDeclaredFields();//�������Field����
		
		for(Field field:fs){
			
			Class type = field.getType();
			
			System.out.println(Modifier.toString(field.getModifiers())+ "+");//Reflect�����modifier����//ע��default�������
			System.out.println(type.getName());//��ȡ��������
			System.out.println(type.getSimpleName());
			System.out.println(field.getName());//��ȡ������
			System.out.println("================");
		}
		//�����뷽ʽ�ó�����
		StringBuffer sb = new StringBuffer();
		
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+" {\n");
		
		for(Field field:fs){
			sb.append("\t");
			sb.append(Modifier.toString(field.getModifiers()) + " ");
			sb.append(field.getType().getSimpleName()+" ");
			sb.append(field.getName()+";\n");
		}
		sb.append("}");
		System.out.println(sb);
		System.out.println("================");
		
		System.out.println(Modifier.toString(c.getDeclaredField("age").getModifiers()));//��ȡid����
		System.out.println("================");
		
		Field idF = c.getDeclaredField("addr");
		
		Object o =c.newInstance();
		//���Ʒ�װ;����˽�����ԡ�private������
		idF.setAccessible(true);
		
		idF.set(o,"�ط�" );//����������������Ը�ֵ;//idF-->age; o-->FieldUser; ��Ҫ�ض������� //����һ��Ҫ��Ӧ��
		
		System.out.println(idF.get(o));
		
		
	}

}
