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
 * @Description: 使用PreparedStatementQuery编写通用一个对象的查操作，返回一条记录
 * @author: ShuaiShuaiDE
 * @date: 2019年11月3日 下午3:30:16
 */
public class PreparedStatementQueryTest {

	@Test
	public void testGetForList(){
		
		String sql = "select id,name,email from customers where id < ?";
		
		List<Customer> list = getForList(Customer.class,sql,12);
		
		list.forEach(System.out::println);		//list 的特殊方法，不用写for循环了				
	}
/**
 * 	
 * @Title: getForList
 * @Description: 多条记录查询(同一个表中的)，注意范形加载在Class上面，也就是说每一行的记录等价为一个类型
 * @param: @param clazz
 * @param: @param sql
 * @param: @param args
 * @param: @return 
 * @return: List<T> 
 * @throws
 * @date: 2019年11月3日 下午5:06:23
 */
	
	public <T> List<T> getForList(Class<T> clazz, String sql, Object... args){//这里List<T>,已经要求查询为同一表的同类多条记录了//注意是在Class 上面加载范形
		
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
			
			//创建集合对象
			ArrayList<T> list = new ArrayList<T>();
			
			while (rs.next()) {//没有数据的时候自动返回false

//				Oreder order = new Oreder();// 此处需要修改
				T t =  clazz.newInstance();//这里要求所有类提供一个空参的构造器

				for (int i = 0; i < columnCount; i++) {
					// getColumnName()这个始终似乎获取的表的列名,不推荐使用，而不是结果集的别名,getColumnLable()是表的别名，不起别名，就是自动获得表名
					String lable = rsmd.getColumnLabel(i + 1);

					Object value = rs.getObject(i + 1);
					//这里没有调用t.class 方法，而是直接用的clazz，clazz表示的是一个类
					Field field = clazz.getDeclaredField(lable);// 如果不与数据库字段民相同，如何解决类属性获得//采用在select语言中取别名，改变结果集的返回名

					field.setAccessible(true);

					field.set(t, value);//而这里要用对象

				}
				list.add(t);	
			}
			return list;//注意return 的位置
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
		Customer customer = getInstance(Customer.class,sql,1);//不能创建对象再传入进去
		System.out.println(customer);
	}
	
	public <T> T getInstance(Class<T> clazz, String sql, Object... args) {//告诉类对象//范形参数以及范形方法

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

//				Oreder order = new Oreder();// 此处需要修改
				T t = clazz.newInstance();//这里要求所有类提供一个空参的构造器

				for (int i = 0; i < columnCount; i++) {
					// getColumnName()这个始终似乎获取的表的列名,不推荐使用，而不是结果集的别名,getColumnLable()是表的别名，不起别名，就是自动获得表名
					String lable = rsmd.getColumnLabel(i + 1);

					Object value = rs.getObject(i + 1);
					//这里没有调用t.class 方法，而是直接用的clazz，clazz表示的是一个类
					Field field = clazz.getDeclaredField(lable);// 如果不与数据库字段民相同，如何解决类属性获得//采用在select语言中取别名，改变结果集的返回名

					field.setAccessible(true);

					field.set(t, value);//而这里要用对象

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
