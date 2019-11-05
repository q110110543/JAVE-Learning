
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
 * @date:   2019��10��31�� ����9:58:03
 */
 


public class JDBCUtils {
/**
 * 
 * @Title: getConnection
 * @Description: �ر����Ӻ�Statement����
 * @param: @return
 * @param: @throws Exception 
 * @return: Connection 
 * @throws
 * @date: 2019��10��31�� ����10:09:49
 */
	public static Connection getConnection() throws Exception{

		InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");//��ͨ����ķ�ʽ��ȡ�������

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
 * @date: 2019��10��31�� ����9:53:41
 */
	public static void closeResource(Connection conn, Statement ps){
		
		try {
			if (ps != null)//
				ps.close();// ����ps����û�д�����ʱ��ȥִ��close()
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();// ����Ϊ�˱����ȡ����ʱ���쳣�����������û�õ�������ȥִ��close()����Ϊfinallyʼ�ջ�ִ��
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * 	
 * @Title: closeResource
 * @Description: ������ResultSet�����Ĺرշ���
 * @param: @param conn
 * @param: @param ps
 * @param: @param rs 
 * @return: void 
 * @throws
 * @date: 2019��11��1�� ����4:16:31
 */
	public static void closeResource(Connection conn, Statement ps,ResultSet rs){
		
		try {
			if (ps != null)//
				ps.close();// ����ps����û�д�����ʱ��ȥִ��close()
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();// ����Ϊ�˱����ȡ����ʱ���쳣�����������û�õ�������ȥִ��close()����Ϊfinallyʼ�ջ�ִ��
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (rs != null)
				rs.close();// ����Ϊ�˱����ȡ����ʱ���쳣�����������û�õ�������ȥִ��close()����Ϊfinallyʼ�ջ�ִ��
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}

}	
