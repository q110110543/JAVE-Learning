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
 * @Description:   数据库基本的增、删、改//主要是注意SQL语句的占位符如何使用，以及填充占位符，并且第一次有了累积木的体验，还有就是Test的使用以及单元测试
 * @author:    ShuaiShuaiDE
 * @date:   2019年11月1日 上午9:44:15
 */
public class PreparedStatementUpdateTest {

	//结果集作为对象接受SQL的反馈，万事万物皆是对象，如何处理resultSet,在执行处是有结果集对象的，这也是封装好的
	
	
	
	
	
	//通用的增、删、改操作 ,传参数，修改为通用方法，函数总是有参数与具体的表达式，以及一些执行流程   
	
	@Test
	
	public void testCommonUpdate(){
		
		//String sql = "insert into customers(name,birth,email) values(?,?,?)";
		//update(sql,"帅帅的的","1993-4-3","2231@213.com ");
		String sql = "update `order` set order_name = ? where order_id = ?";//这里注意``的应用，以及update没有from
		update(sql,"DD","2");
	}
	/**
	 * 
	 * @Title: update
	 * @Description:同一个数据库中的增、删除、改操作，是统一的 
	 * @param: @param sql
	 * @param: @param args 
	 * @return: void 
	 * @throws
	 * @date: 2019年11月1日 上午10:39:31
	 */
	
	public void update(String sql,Object ... args){//注意这里的思路是Object代替具体的数据类型...采用可变形参数，且可变形参数的长度与？占位符的个数一致
		
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
 * @Description: 删除
 * @param:  
 * @return: void 
 * @throws
 * @date: 2019年11月1日 上午9:44:52
 */
	

	@Test
	public void testdelete() {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 1.获取数据库的连接
			conn = JDBCUtils.getConnection();
			// 2.预编译SQL语句，返回PreparedStatement的实列（区别就是SQL语句与占位符，但是可以写成一个模式化的范式）
			String sql = "delete from customers where id = ?";// ?号的顺序就是int参数的顺序
			ps = conn.prepareStatement(sql);
			// 3.填充占位符
			ps.setObject(1, "42");
			
			// 4.执行
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();// TODO Auto-generated catch block
		}finally{
			// 5.资源的关闭
			JDBCUtils.closeResource(conn, ps);
		}	

	}		
	// 修改customer的一条记录
/**
 * 	
 * @Title: testUpdate
 * @Description: 修改
 * @param:  
 * @return: void 
 * @throws
 * @date: 2019年11月1日 上午9:45:22
 */
	@Test	
	public void testUpdate() {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 1.获取数据库的连接
			conn = JDBCUtils.getConnection();
			// 2.预编译sql语句，返回PreparedStatement的实列（区别就是sql语句与占位符，但是可以写成一个模式化的范式）
			String sql = "update customers set name = ? where id = ?";// ?号的顺序就是int参数的顺序
			ps = conn.prepareStatement(sql);
			// 3.填充占位符
			ps.setObject(1, "莫扎特");
			ps.setObject(2, "18");
			// 4.执行
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();// TODO Auto-generated catch block
		}finally{
			// 5.资源的关闭
			JDBCUtils.closeResource(conn, ps);
		}	

	}
	// JUnit的作用是我测试一段代码就不需要再建一个主方法来执行了
/**
 * 
 * @Title: getConnection5
 * @Description: 添加数据
 * @param:  
 * @return: void 
 * @throws
 * @date: 2019年11月1日 上午9:45:41
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
			// 预编译SQL语句，返回PS实列
			String sql = "insert into customers(name,email,birth) values (?,?,?)";// 问号被称为占位符

			ps = conn.prepareStatement(sql);

			ps.setString(1, "蔡坤2");
			ps.setString(2, "6@213.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 传入sql.Date
			java.util.Date date = sdf.parse("1995-10-08");
			ps.setDate(3, new Date(date.getTime()));
			//ps.setObject(3, "1000-10-8");

			// 执行sql
			ps.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 数据库的连接需要关。ps也需要关
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

	}

}
