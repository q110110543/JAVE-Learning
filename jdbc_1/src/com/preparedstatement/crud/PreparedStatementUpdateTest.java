package com.preparedstatement.crud;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import org.junit.Test;

import com.atguigu.conection.ConenctionTest;
import com.luobin.util.JDBCUtils;
/**
 * 
 * @ClassName:     PreparedStatementUpdateTest
 * @Description:   ���ݿ����������ɾ����//��Ҫ��ע��SQL����ռλ�����ʹ�ã��Լ����ռλ�������ҵ�һ�������ۻ�ľ�����飬���о���Test��ʹ���Լ���Ԫ����
 * @author:    ShuaiShuaiDE
 * @date:   2019��11��1�� ����9:44:15
 */
public class PreparedStatementUpdateTest {

	//�������Ϊ�������SQL�ķ���������������Ƕ�����δ���resultSet,��ִ�д����н��������ģ���Ҳ�Ƿ�װ�õ�
	
	
	
	
	
	//ͨ�õ�����ɾ���Ĳ��� ,���������޸�Ϊͨ�÷��������������в��������ı��ʽ���Լ�һЩִ������   
	
	@Test
	
	public void testCommonUpdate(){
		
		//String sql = "insert into customers(name,birth,email) values(?,?,?)";
		//update(sql,"˧˧�ĵ�","1993-4-3","2231@213.com ");
		String sql = "update `order` set order_name = ? where order_id = ?";//����ע��``��Ӧ�ã��Լ�updateû��from
		update(sql,"DD","2");
	}
	/**
	 * 
	 * @Title: update
	 * @Description:ͬһ�����ݿ��е�����ɾ�����Ĳ�������ͳһ�� 
	 * @param: @param sql
	 * @param: @param args 
	 * @return: void 
	 * @throws
	 * @date: 2019��11��1�� ����10:39:31
	 */
	
	public void update(String sql,Object ... args){//ע�������˼·��Object����������������...���ÿɱ��β������ҿɱ��β����ĳ����룿ռλ���ĸ���һ��
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtils.getConnection();
			
			ps = conn.prepareStatement(sql);
			
			for(int i = 0; i < args.length; i++){
				ps.setObject(i + 1, args[i]);
			}
			
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.closeResource(conn, ps);
		}
	}
	
	
	
	
	
/**
 * 	
 * @Title: testdelete
 * @Description: ɾ��
 * @param:  
 * @return: void 
 * @throws
 * @date: 2019��11��1�� ����9:44:52
 */
	

	@Test
	public void testdelete() {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 1.��ȡ���ݿ������
			conn = JDBCUtils.getConnection();
			// 2.Ԥ����SQL��䣬����PreparedStatement��ʵ�У��������SQL�����ռλ�������ǿ���д��һ��ģʽ���ķ�ʽ��
			String sql = "delete from customers where id = ?";// ?�ŵ�˳�����int������˳��
			ps = conn.prepareStatement(sql);
			// 3.���ռλ��
			ps.setObject(1, "42");
			
			// 4.ִ��
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();// TODO Auto-generated catch block
		}finally{
			// 5.��Դ�Ĺر�
			JDBCUtils.closeResource(conn, ps);
		}	

	}		
	// �޸�customer��һ����¼
/**
 * 	
 * @Title: testUpdate
 * @Description: �޸�
 * @param:  
 * @return: void 
 * @throws
 * @date: 2019��11��1�� ����9:45:22
 */
	@Test	
	public void testUpdate() {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 1.��ȡ���ݿ������
			conn = JDBCUtils.getConnection();
			// 2.Ԥ����sql��䣬����PreparedStatement��ʵ�У��������sql�����ռλ�������ǿ���д��һ��ģʽ���ķ�ʽ��
			String sql = "update customers set name = ? where id = ?";// ?�ŵ�˳�����int������˳��
			ps = conn.prepareStatement(sql);
			// 3.���ռλ��
			ps.setObject(1, "Ī����");
			ps.setObject(2, "18");
			// 4.ִ��
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();// TODO Auto-generated catch block
		}finally{
			// 5.��Դ�Ĺر�
			JDBCUtils.closeResource(conn, ps);
		}	

	}
	// JUnit���������Ҳ���һ�δ���Ͳ���Ҫ�ٽ�һ����������ִ����
/**
 * 
 * @Title: getConnection5
 * @Description: �������
 * @param:  
 * @return: void 
 * @throws
 * @date: 2019��11��1�� ����9:45:41
 */
	@Test
	public void getConnection5() {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			InputStream is = ConenctionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

			Properties pros = new Properties();

			pros.load(is);

			String user = pros.getProperty("user");
			String password = pros.getProperty("password");
			String url = pros.getProperty("url");
			String driverClass = pros.getProperty("driverClass");

			Class.forName(driverClass);

			conn = DriverManager.getConnection(url, user, password);

			// System.out.println("haha");
			// Ԥ����SQL��䣬����PSʵ��
			String sql = "insert into customers(name,email,birth) values (?,?,?)";// �ʺű���Ϊռλ��

			ps = conn.prepareStatement(sql);

			ps.setString(1, "����2");
			ps.setString(2, "6@213.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// ����sql.Date
			java.util.Date date = sdf.parse("1995-10-08");
			ps.setDate(3, new Date(date.getTime()));
			//ps.setObject(3, "1000-10-8");

			// ִ��sql
			ps.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ���ݿ��������Ҫ�ء�psҲ��Ҫ��
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

	}

}
