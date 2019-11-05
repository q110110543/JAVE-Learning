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
		
		Driver driver = new com.mysql.jdbc.Driver();//这里存在多态
		
		//jdbc:mysql 指的是协议
		//localhost: ip地址
		//3306 mysql默认的端口号
		//mysql其中的一个数据库
		String url = "jdbc:mysql://localhost:3306/test";
		//将用户名和密码封装在Properties；
		Properties info = new Properties();
		info.setProperty("user", "root");
		
		String username = "root";
		
		info.setProperty("password", "01234569");
		
		
		Connection conn = driver.connect(url, info);//编译是sun公司的connect的方法，实际运行的是com.mysql.jdbc.Driver()重新实现的方法，返回的也是接口类实现的对象，编译的是看driver的对象
		
		System.out.println(conn);
		
	}
	
	public void testConnection2() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
		
		//反射获取Driver对象
		
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
	
	//方式三
	
	@Test
	/*
	
	public void testConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
		
		//1.获取driver 的实现类的对象
		
		Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
			
		Driver driver = (Driver) clazz.newInstance();
		
		DriverManager.registerDriver(driver);
		
		//2.提供另外三个连接的基本信息；
		
		String url = "jdbc:mysql://localhost:3306/test";
				
		String user = "root";
		
		String password = "01234569";
		
		//注册驱动
		
		
		//获取连接
		
		Connection conn= DriverManager.getConnection(url, user, password);
		
		System.out.println(conn);
		
	}
	*/
	/*
	public void testConnection4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
		
		//1.获取driver 的实现类的对象
		
		Class.forName("com.mysql.cj.jdbc.Driver");//自动驱动注册//这里会加载java，自动执行静态代码中sun公司的DriverManager;
		//只是加载驱动，不是显示的注册驱动
			
		
		
		//2.提供另外三个连接的基本信息；
		
		String url = "jdbc:mysql://localhost:3306/test";
				
		String user = "root";
		
		String password = "01234569";
		
		//注册驱动
		
		
		//获取连接
		
		Connection conn= DriverManager.getConnection(url, user, password);
		
		System.out.println(conn);
		
	}
	*/
	
	//方式5最终版 读取配置文件的方式获取连接
	
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
	 * 好处是只要修改配置文件就行了，实现了数据与代码的分离，实现了解耦；
	 * 可移植性好
	 * 打包后将编译的程序部署到服务器上，这样打包的程序不用动，修改配置文件信息就可以更改程序
	 */
	
	
	
		

}
