package day1122;

import java.sql.*;

public class dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";// ���ݿ�����·��
		String dbName = "java_1009";// ���ݿ�����
		String userName = "root";
		String userPass = "123";
		String url = "jdbc:mysql://localhost:3306/" + dbName;// ���ݿ��������ַ·��
		try {
			Class.forName(driver);// �������ݿ������������ݿ⣩
			Connection conn = DriverManager.getConnection(url, userName, userPass);// ѡ�����ݿ�			
			PreparedStatement ps = conn.prepareStatement("creat procedure pro_emp(?,?)");			
			CallableStatement cs=conn.prepareCall("call pro_emp(?,?)");
			cs.setInt(1, 1);	
			cs.setString(2, "��");
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
