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
 * @Description: order 表的查询操作   
 * @author:    ShuaiShuaiDE
 * @date:   2019年11月3日 下午1:17:37
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
 * @Description: 全程自己操作的，活得表的别名，针对表名与field不一致的情况，必须声明SQL的使用，获取列的别名，如果没取别名，获取的默认列名
 * @param: @param sql
 * @param: @param args
 * @param: @return 
 * @return: Oreder 
 * @throws
 * @date: 2019年11月3日 下午2:05:22
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
					//getColumnName()这个始终似乎获取的表的列名,不推荐使用，而不是结果集的别名,getColumnLable()是表的别名，不起别名，就是自动获得表名
					String lable = rsmd.getColumnLabel(i+1);
					
					Object value = rs.getObject(i+1);
					
					Field field = Oreder.class.getDeclaredField(lable);//如果不与数据库字段民相同，如何解决类属性获得//采用在select语言中取别名，改变结果集的返回名
					
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
