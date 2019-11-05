package com.preparedstatement.crud;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.luobin.util.JDBCUtils;

import luobin.bean.Customer;
import luobin.bean.Oreder;

/**
 * 
 * @Description: ʹ��PreparedStatementQuery��дͨ��һ������Ĳ����������һ����¼
 * @author: ShuaiShuaiDE
 * @date: 2019��11��3�� ����3:30:16
 */
public class PreparedStatementQueryTest {

	@Test
	public void testGetForList(){
		
		String sql = "select id,name,email from customers where id < ?";
		
		List<Customer> list = getForList(Customer.class,sql,12);
		
		list.forEach(System.out::println);		//list �����ⷽ��������дforѭ����				
	}
/**
 * 	
 * @Title: getForList
 * @Description: ������¼��ѯ(ͬһ�����е�)��ע�ⷶ�μ�����Class���棬Ҳ����˵ÿһ�еļ�¼�ȼ�Ϊһ������
 * @param: @param clazz
 * @param: @param sql
 * @param: @param args
 * @param: @return 
 * @return: List<T> 
 * @throws
 * @date: 2019��11��3�� ����5:06:23
 */
	
	public <T> List<T> getForList(Class<T> clazz, String sql, Object... args){//����List<T>,�Ѿ�Ҫ���ѯΪͬһ���ͬ�������¼��//ע������Class ������ط���
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JDBCUtils.getConnection();

			ps = conn.prepareStatement(sql);

			for (int i = 0; i < args.length; i++) {

				ps.setObject(i + 1, args[i]);

			}

			rs = ps.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();

			int columnCount = rsmd.getColumnCount();
			
			//�������϶���
			ArrayList<T> list = new ArrayList<T>();
			
			while (rs.next()) {//û�����ݵ�ʱ���Զ�����false

//				Oreder order = new Oreder();// �˴���Ҫ�޸�
				T t =  clazz.newInstance();//����Ҫ���������ṩһ���ղεĹ�����

				for (int i = 0; i < columnCount; i++) {
					// getColumnName()���ʼ���ƺ���ȡ�ı������,���Ƽ�ʹ�ã������ǽ�����ı���,getColumnLable()�Ǳ�ı�������������������Զ���ñ���
					String lable = rsmd.getColumnLabel(i + 1);

					Object value = rs.getObject(i + 1);
					//����û�е���t.class ����������ֱ���õ�clazz��clazz��ʾ����һ����
					Field field = clazz.getDeclaredField(lable);// ����������ݿ��ֶ�����ͬ����ν�������Ի��//������select������ȡ�������ı������ķ�����

					field.setAccessible(true);

					field.set(t, value);//������Ҫ�ö���

				}
				list.add(t);	
			}
			return list;//ע��return ��λ��
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, ps, rs);
		}
		return null;

	}
	
	@Test
	public void testGetInstance(){
		String sql = "select id,name,email from customers where id = ?";
		Customer customer = getInstance(Customer.class,sql,1);//���ܴ��������ٴ����ȥ
		System.out.println(customer);
	}
	
	public <T> T getInstance(Class<T> clazz, String sql, Object... args) {//���������//���β����Լ����η���

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JDBCUtils.getConnection();

			ps = conn.prepareStatement(sql);

			for (int i = 0; i < args.length; i++) {

				ps.setObject(i + 1, args[i]);

			}

			rs = ps.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();

			int columnCount = rsmd.getColumnCount();

			if (rs.next()) {

//				Oreder order = new Oreder();// �˴���Ҫ�޸�
				T t = clazz.newInstance();//����Ҫ���������ṩһ���ղεĹ�����

				for (int i = 0; i < columnCount; i++) {
					// getColumnName()���ʼ���ƺ���ȡ�ı������,���Ƽ�ʹ�ã������ǽ�����ı���,getColumnLable()�Ǳ�ı�������������������Զ���ñ���
					String lable = rsmd.getColumnLabel(i + 1);

					Object value = rs.getObject(i + 1);
					//����û�е���t.class ����������ֱ���õ�clazz��clazz��ʾ����һ����
					Field field = clazz.getDeclaredField(lable);// ����������ݿ��ֶ�����ͬ����ν�������Ի��//������select������ȡ�������ı������ķ�����

					field.setAccessible(true);

					field.set(t, value);//������Ҫ�ö���

				}
				return t;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, ps, rs);
		}
		return null;

	}

}
