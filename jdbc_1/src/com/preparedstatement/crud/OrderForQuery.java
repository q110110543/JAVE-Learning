package com.preparedstatement.crud;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import com.luobin.util.JDBCUtils;

import luobin.bean.Oreder;

/**
 * 
 * @Description: order ��Ĳ�ѯ����   
 * @author:    ShuaiShuaiDE
 * @date:   2019��11��3�� ����1:17:37
 */
public class OrderForQuery {

	@Test
	public void testOrderForQuery(){
		
		String sql = "select order_id id,order_name name,order_date date from `order` where order_id = ?";
		Oreder order = orderForQuery(sql, 1);
		System.out.println(order);
		
	}
	
	
	
	
/**
 * 
 * @Title: orderForQuery
 * @Description: ȫ���Լ������ģ���ñ�ı�������Ա�����field��һ�µ��������������SQL��ʹ�ã���ȡ�еı��������ûȡ��������ȡ��Ĭ������
 * @param: @param sql
 * @param: @param args
 * @param: @return 
 * @return: Oreder 
 * @throws
 * @date: 2019��11��3�� ����2:05:22
 */
	
	public Oreder orderForQuery(String sql, Object ...args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtils.getConnection();
			
			ps = conn.prepareStatement(sql);
			
			for(int i = 0; i<args.length; i++ ){
				
				ps.setObject(i + 1, args[i]);
				
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			
			if(rs.next()){
				
				Oreder order = new Oreder();
				
				for(int i = 0; i<columnCount; i++){
					//getColumnName()���ʼ���ƺ���ȡ�ı������,���Ƽ�ʹ�ã������ǽ�����ı���,getColumnLable()�Ǳ�ı�������������������Զ���ñ���
					String lable = rsmd.getColumnLabel(i+1);
					
					Object value = rs.getObject(i+1);
					
					Field field = Oreder.class.getDeclaredField(lable);//����������ݿ��ֶ�����ͬ����ν�������Ի��//������select������ȡ�������ı������ķ�����
					
					field.setAccessible(true);
					
					field.set(order, value);
					
				}
				return order ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.closeResource(conn, ps, rs);		
		}				
		return null;
		
	}
		
}
