package com.shuaishuaide.IO.SerialVersionUID;

import java.io.Serializable;//�����л��ӿڣ��ڲ�û���κ�һ����������Ϊ��־�ӿڣ���java.lang.Cloneable

//��ΪUserʵ����Serializable�ӿڣ�JVM���������������������һ�����ԣ�static final long serialVersionUID = ĳһ��ֵ

public class User implements Serializable {
	
	//static final long serialVersionUID = -2987419847983544242342; ����������һ������
	
	//Ϊ�˱ܷ����л����������ֶ����л���,����user��������class�ļ������кŻᱻ���¸�ֵ����DBG�ļ����߱����Ueser������кŻ�������ͬ�����Կ����ֶ���ֵ���л��ļ������ز�����ļ�������
	
	static final long serialVersionUID = -29874193131L;//������Long���͡�
	
	//�������String�������л�����transient�ؼ�������
	
	transient String name;//��ʱ�ٷ����л����ǿ��ˣ���Ϊname����û�б����л�
	
	User(String name){
		
		this.name = name;
		
	}
	public String toString(){
		return "User[name="+name+"]";
	}

}
