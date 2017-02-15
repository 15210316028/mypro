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
		 * 请求通讯对象
		 */
		System.out.println("客户端启动...");

		/*
		 * 给服务器输送
		 */
		
		Socket so = new Socket("127.0.0.1", 1234);
		System.out.println("与服务端电脑IP：" + so.getInetAddress()+"建立连接"); // 获取ip地址
		BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		Scanner in  = new Scanner(System.in);//读取服务端控制台
		System.out.println("请输入内容");
		String my = in.next();
		while(!my.equals("bye"))
		{
			bw.write(my);
			bw.newLine();
			bw.flush();
			System.out.println("服务端："+so.getInetAddress()+"发来:"+br.readLine());
			System.out.println("请输入内容");
			my = in.next();

		}
		bw.close();

		so.close();
	}

}
