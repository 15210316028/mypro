package UDP;
/**
 * �ͻ���
 */
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(5555);	
		Scanner I=new Scanner(System.in);
		byte[] b;
		DatagramPacket dp;
		System.out.println("�ȴ�����");
		while(true)
		{
			b=new byte[1024];
			dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String str=new String(dp.getData(),0,dp.getLength());
			System.out.println(str);			
			System.out.println("��������");
			b=(I.next()).getBytes();
			dp=new DatagramPacket(b,b.length,InetAddress.getByName(""),5555);		
			ds.send(dp);
			if(str.equals("bye"))
				break;
		}
		
		ds.close();
	}

}
