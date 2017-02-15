package day1122;

import java.sql.*;
public class jdbc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";// 数据库驱动路径
		String dbName = "java_1009";// 数据库名称
		String userName = "root";
		String userPass = "123";// 密码 123
		String url = "jdbc:mysql://localhost:3306/" + dbName;// 数据库服务器地址
		try {
			Class.forName(driver);// 加载数据库驱动（打开数据库）
			Connection conn = DriverManager.getConnection(url, userName, userPass);// 选择数据库
			Statement st = conn.createStatement();// 执行数据库脚本类
			ResultSet rs = st.executeQuery("select * From dept");// 执行sql返回结果集
			System.out.println("部门编号\t部门名称");			
			while (rs.next())// 判断是否有数据
			{
				System.out.print(rs.getInt("dept_id"));
				System.out.println("    " + rs.getString("dept_name"));
			}
			rs.close();// 关闭连接
			conn.close();// 关闭书数据库
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
