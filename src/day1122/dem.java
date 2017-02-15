package day1122;

import java.sql.*;

public class dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";// 数据库驱动路径
		String dbName = "java_1009";// 数据库名称
		String userName = "root";
		String userPass = "123";
		String url = "jdbc:mysql://localhost:3306/" + dbName;// 数据库服务器地址路径
		try {
			Class.forName(driver);// 加载数据库驱动（打开数据库）
			Connection conn = DriverManager.getConnection(url, userName, userPass);// 选择数据库			
			PreparedStatement ps = conn.prepareStatement("creat procedure pro_emp(?,?)");			
			CallableStatement cs=conn.prepareCall("call pro_emp(?,?)");
			cs.setInt(1, 1);	
			cs.setString(2, "李");
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();// 关闭数据库
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
