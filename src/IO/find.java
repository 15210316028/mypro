package IO;

import java.io.*;

public class find {

	public static void main(String[] zhu) 
	{
		String path="d:// ";
		File file=new File(path);
		String[] f=file.list();		
		for(int i=0;i<f.length;i++)
		{
			try{
			if(f[i].substring(f[i].length()-4).equals(".txt"))
				System.out.println(f[i]);
			}
			catch(Exception ex)
			{
				continue;
			}
		}
//		for(int i=0;i<f.length;i++)
//		{
//			if(f[i].lastIndexOf(".txt")!=-1)
//				System.out.println(f[i]);
//		}
	}
}
