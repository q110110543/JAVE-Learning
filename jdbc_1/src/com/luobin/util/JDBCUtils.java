
package com.luobin.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.atguigu.conection.ConenctionTest;

/**
 * 
 * @ClassName:     JDBCUtils
 * @Description:   TODO
 * @author:    ShuaiShuaiDE
 * @date:   2019年10月31日 下午9:58:03
 */
 


public class JDBCUtils {
/**
 * 
 * @Title: getConnection
 * @Description: 关闭连接和Statement操作
 * @param: @return
 * @param: @throws Exception 
 * @return: Connection 
 * @throws
 * @date: 2019年10月31日 下午10:09:49
 */
	public static Connection getConnection() throws Exception{

		InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");//不通过类的方式获取类加载器

		Properties pros = new Properties();

		pros.load(is);

		String user = pros.getProperty("user");
		String password = pros.getProperty("password");
		String url = pros.getProperty("url");
		String driverClass = pros.getProperty("driverClass");

		Class.forName(driverClass);

		Connection conn = DriverManager.getConnection(url, user, password);

		System.out.println(conn);
		
		return conn;
	}
	

/**
 * 
 * @Title: closeResource
 * @Description: TODO
 * @param: @param conn
 * @param: @param ps 
 * @return: void 
 * @throws
 * @date: 2019年10月31日 下午9:53:41
 */
	public static void closeResource(Connection conn, Statement ps){
		
		try {
			if (ps != null)//
				ps.close();// 避免ps对象没有创建的时候去执行close()
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();// 这是为了避免获取连接时报异常，这样对象就没拿到，避免去执行close()，因为finally始终会执行
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 	
 * @Title: closeResource
 * @Description: 增加了ResultSet参数的关闭方法
 * @param: @param conn
 * @param: @param ps
 * @param: @param rs 
 * @return: void 
 * @throws
 * @date: 2019年11月1日 下午4:16:31
 */
	public static void closeResource(Connection conn, Statement ps,ResultSet rs){
		
		try {
			if (ps != null)//
				ps.close();// 避免ps对象没有创建的时候去执行close()
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();// 这是为了避免获取连接时报异常，这样对象就没拿到，避免去执行close()，因为finally始终会执行
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (rs != null)
				rs.close();// 这是为了避免获取连接时报异常，这样对象就没拿到，避免去执行close()，因为finally始终会执行
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}

}	
