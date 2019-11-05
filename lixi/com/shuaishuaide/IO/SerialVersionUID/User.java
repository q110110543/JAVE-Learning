package com.shuaishuaide.IO.SerialVersionUID;

import java.io.Serializable;//可序列化接口，内部没有任何一个方法，称为标志接口，如java.lang.Cloneable

//因为User实现了Serializable接口，JVM会特殊待遇，会给该类添加一个属性：static final long serialVersionUID = 某一个值

public class User implements Serializable {
	
	//static final long serialVersionUID = -2987419847983544242342; 会隐含这样一个代码
	
	//为了避反序列化出错，可以手动序列化，,所以user被升级后，class文件的序列号会被重新赋值，与DBG文件离线保存的Ueser类的序列号会有所不同，所以可以手动赋值序列化文件，不回产生类的兼容问题
	
	static final long serialVersionUID = -29874193131L;//必须是Long类型。
	
	//如果不想String属性序列化，用transient关键字修饰
	
	transient String name;//此时再反序列化就是空了，因为name属性没有被序列化
	
	User(String name){
		
		this.name = name;
		
	}
	public String toString(){
		return "User[name="+name+"]";
	}

}
