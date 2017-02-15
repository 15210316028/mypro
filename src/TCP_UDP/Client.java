package TCP_UDP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 客户端
 * @author QM
 *
 */
public class Client 
{
	/**
	 * TCP方法
	 */	
	
	String str;
	Scanner in = new Scanner(System.in);// 读取服务端控制台
	public void conTCP() throws Exception
	{			
		Socket st = new Socket("127.0.0.1", 8888);		
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));
		System.out.println("与服务端电脑IP：" + st.getInetAddress() + "建立连接"); // 获取ip地址
		System.out.println("请输入内容");		
		while (true) 
		{
			bw.write(in.next());
			bw.newLine();
			bw.flush();
			str = br.readLine();
			if(str.equals("bye"))
			{
				System.out.println("结束聊天");
				break;
			}
			if (in.next() == null) 
			{
				System.out.println("服务器拒绝与你聊");
				break;
			}
			System.out.println("服务端：" + st.getInetAddress() + "发来:" + in.next());						
		}
	}
	
	public void close(BufferedWriter bw,DatagramSocket ds,Socket st) throws Exception
		{			
			bw.close();
			st.close();
			ds.close();
		}
	public void conUDP() throws Exception
	{
		byte[] b=new byte[1024];
		DatagramSocket ds=new DatagramSocket();		
		DatagramPacket dp=new DatagramPacket(b,b.length);
		System.out.println("等待接受");
		ds.receive(dp);
		str=new String(dp.getData(),0,dp.getLength())+"from"+dp.getAddress().getHostAddress()+":"+dp.getPort();
		System.out.println(str);		
	}	
}
