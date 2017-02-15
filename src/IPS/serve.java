package IPS;

import java.io.*;
import java.net.*;
import java.util.*;

public class serve {
/**
 * 客户端
 * @param args
 * @throws Exception
 */
	public static void main(String[] args) throws Exception {
		Scanner I=new Scanner(System.in);
		Socket st=new Socket("192.168.110.246",5536);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(st.getOutputStream()));
		BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));		
		System.out.println("开机");
		System.out.println("输入内容");
		String str=I.next();
		while(!str.equals("bye"))			
		{									
			bw.write(str);
			bw.newLine();
			bw.flush();
			System.out.println("服务端发来内容");
			System.out.println(br.readLine());
			System.out.println("输入内容");
			str=I.next();						
		}		
		bw.close();	
		st.close();
	}
}
