package jdbc;

import java.sql.*;

import org.apache.log4j.Logger;

public class zcdl {
	public static void main(String[] zhu) {
		String driver = "com.mysql.jdbc.Driver";
		String dbName = "java_1009";
		String userName = "root";
		String userPass = "123";
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		Logger log=Logger.getLogger(zcdl.class);
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName, userPass);
			// Statement st=con.createStatement();
			// String sql_1 = "insert into user values(1,'11',111)";
			// String sql_2 = "insert into user values(2,'22',222)";
			// String sql_3 = "insert into user values(3,'33',333)";
			// st.addBatch(sql_1);
			// st.addBatch(sql_2);
			// st.addBatch(sql_3);
			// st.executeBatch();
			// st.clearBatch();
			// st.close();
			// con.close();
			// String sql = "insert into user
			// values(1,'11',111),(2,'22',222),(3,'33',333)";
			// st.addBatch(sql);
			// st.executeBatch();
			// st.clearBatch();
			// st.close();
			// con.close();
			// PreparedStatement ps=con.prepareStatement("insert into user
			// values(?,?,?),(?,?,?),(?,?,?)");
			// ps.setInt(1, 1);
			// ps.setString(2,"11");
			// ps.setInt(3, 111);
			// ps.setInt(4, 2);
			// ps.setString(5,"22");
			// ps.setInt(6, 222);
			// ps.setInt(7, 3);
			// ps.setString(8,"33");
			// ps.setInt(9, 333);
			// ps.addBatch();
			// ps.executeBatch();
			// ps.clearBatch();
			// PreparedStatement ps=
			// ps.close();
			// con.close();
			Statement st = null;
			try {
				st = con.createStatement();
				String sql = "insert into user values(9,'99',999)";
				con.setAutoCommit(false);
				st.executeUpdate(sql);
				con.commit();
			} catch (Exception ex) {
				log.debug("ÓÐÎó");
				con.rollback();
			}

			finally {
				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
