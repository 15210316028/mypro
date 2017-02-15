package TCP_UDP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务端
 * @author QM
 *
 */
public class Server 
{
	String str;
	public void conTCP() throws Exception
	{
		ServerSocket ss = new ServerSocket(8888);
		Socket st = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));
		Scanner in = new Scanner(System.in);// 读取服务端控制台
		str= br.readLine();
		System.out.println("client:" + str);
		System.out.println("请输入内容：");		
		while (true) {
			bw.write(in.next());
			bw.newLine();
			bw.flush();
			str = br.readLine();
			if((in.next()).equals("bye"))
			if (str == null) {
				System.out.println("客户端拒绝与你聊");
				break;
			}
			System.out.println("客户端：" + st.getInetAddress() + "发来:" + str);		
		}
	}	
	public void close(ServerSocket ss,Socket st) throws Exception
	{
		st.close();
		ss.close();
	}		
}
