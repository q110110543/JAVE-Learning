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
 * @Description: 针对Customer的查询操作   
 * @author:    ShuaiShuaiDE
 * @date:   2019年11月1日 上午11:00:14
 */
public class CustomerForQuery {
	@Test
	public void testqueryForCustomers(){
		
		String sql = "select id, name, birth, email from customers where id = ?";
		Customer customer = queryForCustomers(sql, 13);
		System.out.println(customer);
		String sql2 = "select id, email from customers where name = ?";//只有id和，email有值
		Customer customer2 = queryForCustomers(sql2, "周杰伦");
		System.out.println(customer2);
		
		
	}
	
	/**
	 * 
	 * @Title: queryForCustomers
	 * @Description: 争对customers 的通用表查询操作
	 * @param:  
	 * @return: void 
	 * @throws Exception 
	 * @throws
	 * @date: 2019年11月1日 下午8:58:57
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
			//获取结果集的元数据 ResultSetMetaData
			ResultSetMetaData rsmd = rs.getMetaData();
			
			//通过ResultSetMeteData获取结果集中数据的列数
			//6
			int columnCount = rsmd.getColumnCount();
			
			if(rs.next()){
				
				Customer cust = new Customer();//这里如果查询不完整，会采用Customer属性的默认值0、null等，即没有返回字段名与字段值，所以没有赋值，
				//处理一行的结果集中每一列的数据
				for(int i = 0; i< columnCount; i++) {
					
					Object columnValue = rs.getObject( i + 1);
					
					//获取每个列的列名,以给customer传递参数由于是通用的方法（参数可变），实际上用的是一个反射
					String columnName = rsmd.getColumnName(i+1);
					//给cust对象指定的columnName属性，赋值为columnValue,通过反射的方法
					//如何循环的向对象输入参数，采用空参方法，调用set与get方法，不能用参数方法，因为不知道用户的需求，对象造一次就够了
					//7
					Field field = Customer.class.getDeclaredField(columnName);//通过反射拿到Customer 的对应的columnName属性
					//将此属性由私有的设置为可访问的
					field.setAccessible(true);
					//将此属性赋值为customerValue
					field.set(cust, columnValue);	
				}	
				return cust;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.closeResource(conn, ps, rs);
		}
		
		return null;//不能放在finally内
		
	}
	
	@Test
	public void testQuery1() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;//这里不赋值下面关闭操作无法编译通过
		try {
			//1.
			conn = JDBCUtils.getConnection();
			//2.
			String sql = "select id,name,email,birth from customers where id = ?";//这里顺序要和低下1、2、3、4的顺序 对应
			//3.
			ps = conn.prepareStatement(sql );
			//No value specified for parameter 1 没有填充占位符
			ps.setObject(1, 1);
			//4.执行，并返回结果集对象
			rs = ps.executeQuery();
			//5.处理结果集（难点）类似于迭代器
			if(rs.next()){//如果结果集的下一条有数据，有返回true，并指针下移；否则不下移
				//获取当前数据一行的字段值
				int id = rs.getInt(1);//这里的顺序不是表customers字段的顺序，而是select查询语句字段的顺序
				String name = rs.getString(2);
				String email = rs.getString(3);
				Date birth = rs.getDate(4);
				
				//显示数据//
				//方式1
//			System.out.println("id = " + id + ",naem =  " + name + ",email = " +email + ",birth = " + birth);
				//方式2
//			Object[] data = new Object[]{id,name,email,birth};
				//方式3将数据封装为一个对象 
				Customer customer = new Customer(id, name, email, birth);
				System.out.println(customer);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//resultSet也需要关闭资源
			JDBCUtils.closeResource(conn, ps, rs);
		}
	}
	
}
