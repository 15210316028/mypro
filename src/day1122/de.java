package day1122;

import java.sql.*;

public class de {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";// 数据库驱动路径
		String dbName = "java_1009";// 数据库名称
		String userName = "root";
		String userPass = "123456";
		String url = "jdbc:mysql://localhost:3306/" + dbName;// 数据库服务器地址路径
		try {
			Class.forName(driver);// 加载数据库驱动（打开数据库）
			Connection conn = DriverManager.getConnection(url, userName, userPass);// 选择数据库
			// PreparedStatement ps = conn.prepareStatement("select * from dept
			// where deptname like ?");
			// ps.setInt(1, 222);
			// ps.setString(2, "号11");
			// ps.setString(1, "%部");
			// ResultSet rs = ps.executeQuery();
			// while(rs.next())
			// {
			// System.out.println("deptno:"+rs.getInt("deptno")+"
			// deptname:"+rs.getString("deptname"));
			// }
			// if(rs!=null)
			// {
			// rs.close();
			// }
			// if(ps!=null)
			// {
			// ps.close();
			// }
			PreparedStatement ps = conn.prepareStatement("insert into dept values(?,?),(?,?)");
			ps.setInt(1, 7);
			ps.setString(2, "oooo");
			ps.setInt(3, 888);
			ps.setString(4, "xxoo");
			ps.executeUpdate();// 执行数据库脚本
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
