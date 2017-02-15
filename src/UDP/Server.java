package UDP;

import java.net.*;
import java.util.*;

/**
 * 服务端
 * @author QM
 *
 */
public class Server {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(6666);
		String str;
		byte[] b;
		DatagramPacket dp;
		Scanner I=new Scanner(System.in);
		System.out.println("输入内容");		
		while(true)
		{
			str=I.next();
			b=(str).getBytes();
			dp=new DatagramPacket(b,b.length,InetAddress.getByName(""),5555);		
			ds.send(dp);			
			b=new byte[1024];
			dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			str=new String(dp.getData(),0,dp.getLength());
			System.out.println(str);
			if((I.next()).equals("bye"))
				break;
		}		
		
		ds.close();
	}

}
