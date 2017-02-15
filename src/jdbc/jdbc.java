package jdbc;

import java.sql.*;
/**
 * 
 * 
 * @author QM
 *
 */
public class jdbc {
	private static final String driver = "com.mysql.jdbc.Driver";// 数据库驱动路径
	private static String dbName = "java_1009";// 数据库名称
	private static final String userName = "root";//用户名
	private static final String userPass = "123";// 密码 123
	private static String url = "jdbc:mysql://localhost:3306/" + dbName;// 数据库服务器地址
	
/**
 * 
 * 
 * @return
 * @throws Exception
 */
	public static Connection  getConnection() throws Exception 
	{		
			Class.forName(driver);// 加载数据库驱动（打开数据库）
			return   DriverManager.getConnection(url, userName, userPass);// 选择数据库		
	}
/**
 * 
 * 关闭工具方法
 * @param con
 * @param ps
 * @param st
 * @param rs
 * @throws Exception
 */
	public static  void close(Connection con,PreparedStatement ps,Statement st,ResultSet rs) throws Exception
	{
		if(con!=null)
		{
			con.close();
		}
		if(ps!=null)
		{
			ps.close();
		}
		if(st!=null)
		{
			st.close();
		}
		if(rs!=null)
		{
			rs.close();
		}
	}
}
