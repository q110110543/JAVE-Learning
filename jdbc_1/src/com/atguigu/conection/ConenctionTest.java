package com.atguigu.conection;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;

import org.junit.Test;

public class ConenctionTest {
		
	@Test
	/*
	public void testConnection1() throws SQLException{
		
		Driver driver = new com.mysql.jdbc.Driver();//������ڶ�̬
		
		//jdbc:mysql ָ����Э��
		//localhost: ip��ַ
		//3306 mysqlĬ�ϵĶ˿ں�
		//mysql���е�һ�����ݿ�
		String url = "jdbc:mysql://localhost:3306/test";
		//���û����������װ��Properties��
		Properties info = new Properties();
		info.setProperty("user", "root");
		
		String username = "root";
		
		info.setProperty("password", "01234569");
		
		
		Connection conn = driver.connect(url, info);//������sun��˾��connect�ķ�����ʵ�����е���com.mysql.jdbc.Driver()����ʵ�ֵķ��������ص�Ҳ�ǽӿ���ʵ�ֵĶ��󣬱�����ǿ�driver�Ķ���
		
		System.out.println(conn);
		
	}
	
	public void testConnection2() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
		
		//�����ȡDriver����
		
		Class clazz = Class.forName("com.mysql.jdbc.Driver");
		
		
		Driver driver = (Driver) clazz.newInstance();
		
		String url = "jdbc:mysql://localhost:3306/mysql";
		
		Properties info = new Properties();
		info.setProperty("user", "username");
		info.setProperty("password", "username");
		String username = "root";
		String password = "01234569";
		
		Connection conn = driver.connect(url, info);
		
		System.out.println(conn);
		
		
	}
	
	//��ʽ��
	
	@Test
	/*
	
	public void testConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
		
		//1.��ȡdriver ��ʵ����Ķ���
		
		Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
			
		Driver driver = (Driver) clazz.newInstance();
		
		DriverManager.registerDriver(driver);
		
		//2.�ṩ�����������ӵĻ�����Ϣ��
		
		String url = "jdbc:mysql://localhost:3306/test";
				
		String user = "root";
		
		String password = "01234569";
		
		//ע������
		
		
		//��ȡ����
		
		Connection conn= DriverManager.getConnection(url, user, password);
		
		System.out.println(conn);
		
	}
	*/
	/*
	public void testConnection4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
		
		//1.��ȡdriver ��ʵ����Ķ���
		
		Class.forName("com.mysql.cj.jdbc.Driver");//�Զ�����ע��//��������java���Զ�ִ�о�̬������sun��˾��DriverManager;
		//ֻ�Ǽ���������������ʾ��ע������
			
		
		
		//2.�ṩ�����������ӵĻ�����Ϣ��
		
		String url = "jdbc:mysql://localhost:3306/test";
				
		String user = "root";
		
		String password = "01234569";
		
		//ע������
		
		
		//��ȡ����
		
		Connection conn= DriverManager.getConnection(url, user, password);
		
		System.out.println(conn);
		
	}
	*/
	
	//��ʽ5���հ� ��ȡ�����ļ��ķ�ʽ��ȡ����
	
		public void getConnection5() throws IOException, ClassNotFoundException, SQLException{
			
		InputStream is = ConenctionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
		
		Properties pros = new Properties();
		
		pros.load(is);
		
		String password = pros.getProperty("password");
		String user = pros.getProperty("user");
		String url = pros.getProperty("url");
		String driverClass = pros.getProperty("driverClass");
		
		Class.forName(driverClass);
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		System.out.println(conn);
			 
			 
		}
	/*
	 * �ô���ֻҪ�޸������ļ������ˣ�ʵ�������������ķ��룬ʵ���˽��
	 * ����ֲ�Ժ�
	 * ����󽫱���ĳ����𵽷������ϣ���������ĳ����ö����޸������ļ���Ϣ�Ϳ��Ը��ĳ���
	 */
	
	
	
		

}
