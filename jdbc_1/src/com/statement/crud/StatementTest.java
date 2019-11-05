package com.statement.crud;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import org.junit.Test;

public class StatementTest {

	// 浣跨敤Statement鐨勫紛绔細闇�瑕佹嫾鍐檚ql璇彞锛屽苟涓斿瓨鍦⊿QL娉ㄥ叆鐨勯棶棰�
	@Test
	public void testLogin() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String user = scanner.nextLine();//next 在又空格或者换行就视为结束
		System.out.println("请输入密码");
		String password = scanner.nextLine();

//		String sql = "select user,password from user_table where user = '1' or 'and password = ' = 1 or '1' = '1';//这里8个''存在secql注入问题
		String sql = "select user,password from user_table where user = '" + user + "' and password = '" + password + "'";
		User returnUser = get(sql, User.class);
		if (returnUser != null) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}

	}

	// 浣跨敤Statement瀹炵幇瀵规暟鎹〃鐨勬煡璇㈡搷浣�
	public <T> T get(String sql, Class<T> clazz) {
		T t = null;

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// 1.鍔犺浇閰嶇疆鏂囦欢
			InputStream is = StatementTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
			Properties pros = new Properties();
			pros.load(is);

			// 2.璇诲彇閰嶇疆淇℃伅
			String user = pros.getProperty("user");
			String password = pros.getProperty("password");
			String url = pros.getProperty("url");
			String driverClass = pros.getProperty("driverClass");

			// 3.鍔犺浇椹卞姩
			Class.forName(driverClass);

			// 4.鑾峰彇杩炴帴
			conn = DriverManager.getConnection(url, user, password);

			st = conn.createStatement();

			rs = st.executeQuery(sql);

			// 鑾峰彇缁撴灉闆嗙殑鍏冩暟鎹�
			ResultSetMetaData rsmd = rs.getMetaData();

			// 鑾峰彇缁撴灉闆嗙殑鍒楁暟
			int columnCount = rsmd.getColumnCount();

			if (rs.next()) {

				t = clazz.newInstance();

				for (int i = 0; i < columnCount; i++) {
					// //1. 鑾峰彇鍒楃殑鍚嶇О
					// String columnName = rsmd.getColumnName(i+1);

					// 1. 鑾峰彇鍒楃殑鍒悕
					String columnName = rsmd.getColumnLabel(i + 1);

					// 2. 鏍规嵁鍒楀悕鑾峰彇瀵瑰簲鏁版嵁琛ㄤ腑鐨勬暟鎹�
					Object columnVal = rs.getObject(columnName);

					// 3. 灏嗘暟鎹〃涓緱鍒扮殑鏁版嵁锛屽皝瑁呰繘瀵硅薄
					Field field = clazz.getDeclaredField(columnName);
					field.setAccessible(true);
					field.set(t, columnVal);
				}
				return t;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 鍏抽棴璧勬簮
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

}
