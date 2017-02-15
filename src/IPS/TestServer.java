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
		 * 准备通讯端口
		 */
		System.out.println("服务端启动...等待链接机器");
		ServerSocket ss = new ServerSocket(1234);
		/*
		 * 等待客户机发送请求
		 */
		Socket st = ss.accept();
		/*
		 * 一旦客户机链接执行输出
		 */
		System.out.println("电脑IP：" + st.getInetAddress()+"建立连接"); // 获取ip地址
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));
		Scanner in  = new Scanner(System.in);//读取服务端控制台
		String context =  br.readLine();
		System.out.println("client:"+context);
		System.out.println("请输入内容：");
		String re = in.next();
		while(!re.equals("bye"))
		{
			bw.write(re);
			bw.newLine();
			bw.flush();
			System.out.println("客户端："+st.getInetAddress()+"发来:"+br.readLine());
			System.out.println("您请输入内容：");
			re = in.next();
		}
		st.close();
		ss.close();
	}

}
