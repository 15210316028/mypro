package IPS;

import java.io.*;
import java.net.*;

public class Server {
/**
 * 服务端
 * @param args
 * @throws Exception 
 */
	public static void main(String[] args) throws Exception 
	{
		String s=null;
		int l;
		Socket st=null;
		OutputStream ops = null;
		InputStream ips = null;
		ServerSocket ss = null;
		byte[] b=new byte[1024];
		try
		{
			ss=new ServerSocket();
			while(true)
			{
				st=ss.accept();
				ips=st.getInputStream();
				ops=st.getOutputStream();
				l=ips.read(b);
				if(l!=0)				
					s=new String(b,0,l);
				System.out.println(s);
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				ops.write(("服务器……"+br.readLine()).getBytes());
			}
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
			ss.close();									
		}
	}

}
