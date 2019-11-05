package com.shuaishuaide.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FiledTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		
		Class c = Class.forName("com.shuaishuaide.Reflect.FieldUser");
		
		Field[] fs = c.getDeclaredFields();//返回体格Field数组
		
		for(Field field:fs){
			
			Class type = field.getType();
			
			System.out.println(Modifier.toString(field.getModifiers())+ "+");//Reflect下面的modifier类型//注意default不会输出
			System.out.println(type.getName());//获取属性类型
			System.out.println(type.getSimpleName());
			System.out.println(field.getName());//获取属性名
			System.out.println("================");
		}
		//反编译方式拿出属性
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
		
		System.out.println(Modifier.toString(c.getDeclaredField("age").getModifiers()));//获取id属性
		System.out.println("================");
		
		Field idF = c.getDeclaredField("addr");
		
		Object o =c.newInstance();
		//打破封装;访问私有属性。private的属性
		idF.setAccessible(true);
		
		idF.set(o,"地方" );//给这个对象的这个属性赋值;//idF-->age; o-->FieldUser; 三要素都有体现 //类型一定要对应啊
		
		System.out.println(idF.get(o));
		
		
	}

}
