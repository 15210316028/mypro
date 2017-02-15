package day1125;

import java.io.*;

public class demo {

	public static void main(String[] args) throws IOException {
		String path1="d://bd";
		String path2="d://ac";
		String child="abcd.text";		
		File file1=new File(path1,child);
		if(file1.exists())
		{
//			if
			File file2=new File(path2);
			file2.mkdir();
			File file3=new File(path2,child);
			file2.createNewFile();
			file1.delete();
		}
		else
		{		
			file1.mkdir();
			file1.createNewFile();			
		}
//		String path1="";
//		String path2="";
//		File file1=new File(path1);
//		FileInputStream fis=new FileInputStream(file1);
//		File file2=new File(path2);
//		FileOutputStream fos=new FileOutputStream(file2);
//		byte[] bytes=new byte[1024];
//		int i=fis.read(bytes);
//		while(i!=-1)
//		{
//			System.out.println(new String(bytes,0,i));
//			fos.write(bytes, 0, i);
//		}
//		fos.close();
//		fis.close();
	}
}
