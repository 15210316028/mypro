package day1122;

import java.sql.*;


public class jdbcgx {

	public static void main(String[] args) 
	{
		String driver = "com.mysql.jdbc.Driver";// ���ݿ�����·��
		String dbName = "java_1009";// ���ݿ�����
		String userName = "root";
		String userPass = "123";// ���� 123
		String url = "jdbc:mysql://localhost:3306/" + dbName;// ���ݿ��������ַ
		int num;
		try {
			Class.forName(driver);// �������ݿ������������ݿ⣩
			Connection conn = DriverManager.getConnection(url, userName, userPass);// ѡ�����ݿ�
			Statement st = conn.createStatement();// ִ�����ݿ�ű���
		    num = st.executeUpdate("delete from dept where dept_id='13' or dept_id=14");
			num=st.executeUpdate("insert  into  dept values(13,'ó��'),(14,'����') ");
			num=st.executeUpdate("update dept set dept_name='����' where dept_id=12");
			ResultSet rs = st.executeQuery("select * From dept");// ִ��sql���ؽ����
			System.out.println("���ű��\t��������");			
			while (rs.next())// �ж��Ƿ�������
			{
				System.out.print(rs.getInt("dept_id"));
				System.out.println("    " + rs.getString("dept_name"));
			}
			st.close();
			rs.close();// �ر�����
			conn.close();// �ر������ݿ�
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
