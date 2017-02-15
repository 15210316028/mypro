package IP;

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

		Socket so = new Socket("127.0.0.1", 8888);
		System.out.println("与服务端电脑IP：" + so.getInetAddress() + "建立连接"); // 获取ip地址
		BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		Scanner in = new Scanner(System.in);// 读取服务端控制台
		System.out.println("请输入内容");
		String my = in.next();
		while (!my.equals("bye") && !my.equals("88") && !my.equals("再见") && !my.equals("滚") && !my.equals("呵呵")) {
			bw.write(my);
			bw.newLine();
			bw.flush();
			String s = br.readLine();

			if (s == null) {
				System.out.println("服务器拒绝与你聊");
				break;
			}
			System.out.println("服务端：" + so.getInetAddress() + "发来:" + s);
			System.out.println("请输入内容");
			my = in.next();

		}
		System.out.println("已关闭连接");
		bw.close();

		so.close();
	}

}
