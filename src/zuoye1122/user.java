package zuoye1122;

import java.sql.*;

public class user {
	public static void main(String[] zhu) {
		String driver = "com.mysql.jdbc.Driver";// ���ݿ�����·��
		String dbName = "java_1009";// ���ݿ�����
		String userName = "root";
		String userPass = "123";// ���� 123
		String url = "jdbc:mysql://localhost:3306/" + dbName;// ���ݿ��������ַ
		try {
			Class.forName(driver);// �������ݿ������������ݿ⣩
			Connection conn = DriverManager.getConnection(url, userName, userPass);// ѡ�����ݿ�
			PreparedStatement st = conn.prepareStatement("create table user (id int not null primary key,name varchar(4) not null,age int not null)");// ִ�����ݿ�ű���
			ResultSet rs = st.executeQuery("desc user");// ִ��sql���ؽ����			
			st.executeUpdate();
			System.out.println("user�ṹ");
			st.close();
			rs.close();// �ر�����
			conn.close();// �ر������ݿ�
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
