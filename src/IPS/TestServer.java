package IPS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServer {
	public static void main(String[] ly) throws IOException {
		/*
		 * ׼��ͨѶ�˿�
		 */
		System.out.println("���������...�ȴ����ӻ���");
		ServerSocket ss = new ServerSocket(1234);
		/*
		 * �ȴ��ͻ�����������
		 */
		Socket st = ss.accept();
		/*
		 * һ���ͻ�������ִ�����
		 */
		System.out.println("����IP��" + st.getInetAddress()+"��������"); // ��ȡip��ַ
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));
		Scanner in  = new Scanner(System.in);//��ȡ����˿���̨
		String context =  br.readLine();
		System.out.println("client:"+context);
		System.out.println("���������ݣ�");
		String re = in.next();
		while(!re.equals("bye"))
		{
			bw.write(re);
			bw.newLine();
			bw.flush();
			System.out.println("�ͻ��ˣ�"+st.getInetAddress()+"����:"+br.readLine());
			System.out.println("�����������ݣ�");
			re = in.next();
		}
		st.close();
		ss.close();
	}

}
