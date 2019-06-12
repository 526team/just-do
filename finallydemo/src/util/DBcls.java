package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 这个类用于实现数据库的连接
 * @author Administrator
 *
 */
public class DBcls {

	private static Connection con;
	public static Connection getcon() throws Exception {
		if(con==null) {
		    String url = "jdbc:mysql://localhost:3306/DB";
		    String root = "root";
		    String password = "abcd1234";
			Class.forName("com.mysql.jdbc.Driver");
			//连接远程数据库
//			con=DriverManager.getConnection("jdbc:mysql://192.168.1.103:3306/DB", "root", "abcd1234");
			con=DriverManager.getConnection(url, root, password);
		}
		return con;
	}
}
