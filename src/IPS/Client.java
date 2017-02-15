package IPS;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * 客户端
 * @author QM
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		Scanner I=new Scanner(System.in);
		String sa="127.0.0.1";
		String words="hello";
		String s;
		byte[] b=new byte[1024];
		InputStreamReader isr;
		int l;
		Socket st = null;
		OutputStream ops=null;
		InputStream ips = null;
		System.out.println("输入IP");
		isr=new InputStreamReader(System.in);
		try
		{
			s=new BufferedReader(isr).readLine();
			if(!s.equals(""))
				sa=s;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("输入");
		isr=new InputStreamReader(System.in);
		while(true)
		{
			try
			{
				s=I.next();
				s=new BufferedReader(isr).readLine();
				words=s;
				if(words.equals("quit"))
					break;
				s="客户端……"+words;
				st=new Socket(InetAddress.getByName(sa),0);
				ops=st.getOutputStream();
				ips=st.getInputStream();
				ops.write(s.getBytes("gbk"));
				l=ips.read(b);
				System.out.println(new String(b,0,l));
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			finally
			{				
				ips.close();
				ops.close();
				st.close();																	
			}
		}
	}

}
