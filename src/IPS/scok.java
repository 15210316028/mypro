package IPS;

import java.io.*;
import java.net.*;
import java.util.*;
/**
 * �����
 * @author QM
 *
 */
public class scok {

	public static void main(String[] args) throws Exception {
		System.out.println("����");
		Scanner I=new Scanner(System.in);
		ServerSocket ss=new ServerSocket(5536);
		Socket st=ss.accept();
		System.out.println("��ȡip"+ss.getInetAddress());
		BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));				
		System.out.println("��������");
		String str=I.next();
		while(!str.equals("bye"))
		{
			bw.write(str);
			bw.newLine();
			bw.flush();
			System.out.println("�ͻ��˷�������");
			System.out.println(br.readLine());
			System.out.println("��������");
			str=I.next();
		}				
		st.close();
		ss.close();
	}

}
