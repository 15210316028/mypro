package jdbc;

import java.sql.*;
/**
 * 
 * 
 * @author QM
 *
 */
public class jdbc {
	private static final String driver = "com.mysql.jdbc.Driver";// ���ݿ�����·��
	private static String dbName = "java_1009";// ���ݿ�����
	private static final String userName = "root";//�û���
	private static final String userPass = "123";// ���� 123
	private static String url = "jdbc:mysql://localhost:3306/" + dbName;// ���ݿ��������ַ
	
/**
 * 
 * 
 * @return
 * @throws Exception
 */
	public static Connection  getConnection() throws Exception 
	{		
			Class.forName(driver);// �������ݿ������������ݿ⣩
			return   DriverManager.getConnection(url, userName, userPass);// ѡ�����ݿ�		
	}
/**
 * 
 * �رչ��߷���
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
