package day1122;

import java.sql.*;


public class jdbcgx {

	public static void main(String[] args) 
	{
		String driver = "com.mysql.jdbc.Driver";// 数据库驱动路径
		String dbName = "java_1009";// 数据库名称
		String userName = "root";
		String userPass = "123";// 密码 123
		String url = "jdbc:mysql://localhost:3306/" + dbName;// 数据库服务器地址
		int num;
		try {
			Class.forName(driver);// 加载数据库驱动（打开数据库）
			Connection conn = DriverManager.getConnection(url, userName, userPass);// 选择数据库
			Statement st = conn.createStatement();// 执行数据库脚本类
		    num = st.executeUpdate("delete from dept where dept_id='13' or dept_id=14");
			num=st.executeUpdate("insert  into  dept values(13,'贸易'),(14,'管理') ");
			num=st.executeUpdate("update dept set dept_name='销售' where dept_id=12");
			ResultSet rs = st.executeQuery("select * From dept");// 执行sql返回结果集
			System.out.println("部门编号\t部门名称");			
			while (rs.next())// 判断是否有数据
			{
				System.out.print(rs.getInt("dept_id"));
				System.out.println("    " + rs.getString("dept_name"));
			}
			st.close();
			rs.close();// 关闭连接
			conn.close();// 关闭书数据库
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
