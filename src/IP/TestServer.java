package IP;

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
		ServerSocket ss = new ServerSocket(8888);
		/*
		 * �ȴ��ͻ�����������
		 */
		Socket st = ss.accept();
		/*
		 * һ���ͻ�������ִ�����
		 */
		System.out.println("����IP��" + st.getInetAddress() + "��������"); // ��ȡip��ַ
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));
		Scanner in = new Scanner(System.in);// ��ȡ����˿���̨
		String context = br.readLine();
		System.out.println("client:" + context);
		System.out.println("���������ݣ�");
		String re = in.next();
		while (!re.equals("bye") && !re.equals("88") && !re.equals("�ټ�") && !re.equals("��") && !re.equals("�Ǻ�")) {
			bw.write(re);
			bw.newLine();
			bw.flush();
			String s = br.readLine();
			if (s == null) {
				System.out.println("�ͻ��˾ܾ�������");
				break;
			}
			System.out.println("�ͻ��ˣ�" + st.getInetAddress() + "����:" + s);
			System.out.println("���������ݣ�");
			re = in.next();
		}
		System.out.println("�ѹر����ӣ�");
		st.close();
		ss.close();
	}

}
