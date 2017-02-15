package Shopping;

import java.sql.*;


public class BaseDao 
{
	private static final String driver="com.mysql.jdbc.Driver";
	private static String dbName="java_1009";
	private static final String userName="root";
	private static final String userPassword="123";
	private static String url="jdbc:mysql://localhost:3306/"+dbName;
	
	private BaseDao(){}
	
	static
	{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	private static BaseDao bd;
	
	public static synchronized BaseDao getIntance()
	{
		if(bd==null)
			bd=new BaseDao();
		return bd;
	}
	
//	public int getMaxId() throws Exception
//	{		
//		String sql="select ifnull(max(id),1) as maxid from shopcar";
//		Statement st=getConnection().createStatement();
//		ResultSet rs=st.executeQuery(sql);
//		int id=1;
//		if(rs.next())		
//			id=rs.getInt("maxid");
//		closeAll(null, null, st, rs);
//		return id;
//	}
	
	public Connection getConnection() throws Exception
	{
		return DriverManager.getConnection(url, userName, userPassword);
	}
	
	public void closeAll(Connection con,PreparedStatement ps,Statement st,ResultSet rs) throws Exception
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
