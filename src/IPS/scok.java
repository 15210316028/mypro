package IPS;

import java.io.*;
import java.net.*;
import java.util.*;
/**
 * 服务端
 * @author QM
 *
 */
public class scok {

	public static void main(String[] args) throws Exception {
		System.out.println("待机");
		Scanner I=new Scanner(System.in);
		ServerSocket ss=new ServerSocket(5536);
		Socket st=ss.accept();
		System.out.println("获取ip"+ss.getInetAddress());
		BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));				
		System.out.println("输入内容");
		String str=I.next();
		while(!str.equals("bye"))
		{
			bw.write(str);
			bw.newLine();
			bw.flush();
			System.out.println("客户端发来内容");
			System.out.println(br.readLine());
			System.out.println("输入内容");
			str=I.next();
		}				
		st.close();
		ss.close();
	}

}
