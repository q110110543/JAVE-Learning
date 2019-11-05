package com.preparedstatement.crud;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import com.luobin.util.JDBCUtils;

import luobin.bean.Customer;

/**
 * 
 * @Description: ���Customer�Ĳ�ѯ����   
 * @author:    ShuaiShuaiDE
 * @date:   2019��11��1�� ����11:00:14
 */
public class CustomerForQuery {
	@Test
	public void testqueryForCustomers(){
		
		String sql = "select id, name, birth, email from customers where id = ?";
		Customer customer = queryForCustomers(sql, 13);
		System.out.println(customer);
		String sql2 = "select id, email from customers where name = ?";//ֻ��id�ͣ�email��ֵ
		Customer customer2 = queryForCustomers(sql2, "�ܽ���");
		System.out.println(customer2);
		
		
	}
	
	/**
	 * 
	 * @Title: queryForCustomers
	 * @Description: ����customers ��ͨ�ñ��ѯ����
	 * @param:  
	 * @return: void 
	 * @throws Exception 
	 * @throws
	 * @date: 2019��11��1�� ����8:58:57
	 */
	
	public Customer queryForCustomers(String sql,Object...args) {
		//1
		Connection conn = null;
		//2
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			//3
			for(int i = 0; i< args.length; i++){
				ps.setObject(i+1,args[i]);
			}
			//4
			 rs = ps.executeQuery();
			//5
			//��ȡ�������Ԫ���� ResultSetMetaData
			ResultSetMetaData rsmd = rs.getMetaData();
			
			//ͨ��ResultSetMeteData��ȡ����������ݵ�����
			//6
			int columnCount = rsmd.getColumnCount();
			
			if(rs.next()){
				
				Customer cust = new Customer();//���������ѯ�������������Customer���Ե�Ĭ��ֵ0��null�ȣ���û�з����ֶ������ֶ�ֵ������û�и�ֵ��
				//����һ�еĽ������ÿһ�е�����
				for(int i = 0; i< columnCount; i++) {
					
					Object columnValue = rs.getObject( i + 1);
					
					//��ȡÿ���е�����,�Ը�customer���ݲ���������ͨ�õķ����������ɱ䣩��ʵ�����õ���һ������
					String columnName = rsmd.getColumnName(i+1);
					//��cust����ָ����columnName���ԣ���ֵΪcolumnValue,ͨ������ķ���
					//���ѭ���������������������ÿղη���������set��get�����������ò�����������Ϊ��֪���û������󣬶�����һ�ξ͹���
					//7
					Field field = Customer.class.getDeclaredField(columnName);//ͨ�������õ�Customer �Ķ�Ӧ��columnName����
					//����������˽�е�����Ϊ�ɷ��ʵ�
					field.setAccessible(true);
					//�������Ը�ֵΪcustomerValue
					field.set(cust, columnValue);	
				}	
				return cust;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.closeResource(conn, ps, rs);
		}
		
		return null;//���ܷ���finally��
		
	}
	
	@Test
	public void testQuery1() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;//���ﲻ��ֵ����رղ����޷�����ͨ��
		try {
			//1.
			conn = JDBCUtils.getConnection();
			//2.
			String sql = "select id,name,email,birth from customers where id = ?";//����˳��Ҫ�͵���1��2��3��4��˳�� ��Ӧ
			//3.
			ps = conn.prepareStatement(sql );
			//No value specified for parameter 1 û�����ռλ��
			ps.setObject(1, 1);
			//4.ִ�У������ؽ��������
			rs = ps.executeQuery();
			//5.�����������ѵ㣩�����ڵ�����
			if(rs.next()){//������������һ�������ݣ��з���true����ָ�����ƣ���������
				//��ȡ��ǰ����һ�е��ֶ�ֵ
				int id = rs.getInt(1);//�����˳���Ǳ�customers�ֶε�˳�򣬶���select��ѯ����ֶε�˳��
				String name = rs.getString(2);
				String email = rs.getString(3);
				Date birth = rs.getDate(4);
				
				//��ʾ����//
				//��ʽ1
//			System.out.println("id = " + id + ",naem =  " + name + ",email = " +email + ",birth = " + birth);
				//��ʽ2
//			Object[] data = new Object[]{id,name,email,birth};
				//��ʽ3�����ݷ�װΪһ������ 
				Customer customer = new Customer(id, name, email, birth);
				System.out.println(customer);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//resultSetҲ��Ҫ�ر���Դ
			JDBCUtils.closeResource(conn, ps, rs);
		}
	}
	
}
