package day1122;

import java.sql.*;
public class jdbc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";// ���ݿ�����·��
		String dbName = "java_1009";// ���ݿ�����
		String userName = "root";
		String userPass = "123";// ���� 123
		String url = "jdbc:mysql://localhost:3306/" + dbName;// ���ݿ��������ַ
		try {
			Class.forName(driver);// �������ݿ������������ݿ⣩
			Connection conn = DriverManager.getConnection(url, userName, userPass);// ѡ�����ݿ�
			Statement st = conn.createStatement();// ִ�����ݿ�ű���
			ResultSet rs = st.executeQuery("select * From dept");// ִ��sql���ؽ����
			System.out.println("���ű��\t��������");			
			while (rs.next())// �ж��Ƿ�������
			{
				System.out.print(rs.getInt("dept_id"));
				System.out.println("    " + rs.getString("dept_name"));
			}
			rs.close();// �ر�����
			conn.close();// �ر������ݿ�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
