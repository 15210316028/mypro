package day1122;

import java.sql.*;

public class de {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";// ���ݿ�����·��
		String dbName = "java_1009";// ���ݿ�����
		String userName = "root";
		String userPass = "123456";
		String url = "jdbc:mysql://localhost:3306/" + dbName;// ���ݿ��������ַ·��
		try {
			Class.forName(driver);// �������ݿ������������ݿ⣩
			Connection conn = DriverManager.getConnection(url, userName, userPass);// ѡ�����ݿ�
			// PreparedStatement ps = conn.prepareStatement("select * from dept
			// where deptname like ?");
			// ps.setInt(1, 222);
			// ps.setString(2, "��11");
			// ps.setString(1, "%��");
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
			ps.executeUpdate();// ִ�����ݿ�ű�
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();// �ر����ݿ�
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
