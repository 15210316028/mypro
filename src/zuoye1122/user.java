package zuoye1122;

import java.sql.*;

public class user {
	public static void main(String[] zhu) {
		String driver = "com.mysql.jdbc.Driver";// 数据库驱动路径
		String dbName = "java_1009";// 数据库名称
		String userName = "root";
		String userPass = "123";// 密码 123
		String url = "jdbc:mysql://localhost:3306/" + dbName;// 数据库服务器地址
		try {
			Class.forName(driver);// 加载数据库驱动（打开数据库）
			Connection conn = DriverManager.getConnection(url, userName, userPass);// 选择数据库
			PreparedStatement st = conn.prepareStatement("create table user (id int not null primary key,name varchar(4) not null,age int not null)");// 执行数据库脚本类
			ResultSet rs = st.executeQuery("desc user");// 执行sql返回结果集			
			st.executeUpdate();
			System.out.println("user结构");
			st.close();
			rs.close();// 关闭连接
			conn.close();// 关闭书数据库
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
