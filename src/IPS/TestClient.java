package IPS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] ly) throws IOException {

		/*
		 * ����ͨѶ����
		 */
		System.out.println("�ͻ�������...");

		/*
		 * ������������
		 */
		
		Socket so = new Socket("127.0.0.1", 1234);
		System.out.println("�����˵���IP��" + so.getInetAddress()+"��������"); // ��ȡip��ַ
		BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		Scanner in  = new Scanner(System.in);//��ȡ����˿���̨
		System.out.println("����������");
		String my = in.next();
		while(!my.equals("bye"))
		{
			bw.write(my);
			bw.newLine();
			bw.flush();
			System.out.println("����ˣ�"+so.getInetAddress()+"����:"+br.readLine());
			System.out.println("����������");
			my = in.next();

		}
		bw.close();

		so.close();
	}

}
