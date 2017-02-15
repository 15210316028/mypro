package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		String path = "d://java_1009_io";
		String path1 = "a.txt";
		
		File file=new File(path);
		String[]s=file.list();
		for(int i=0;i<s.length;i++){
			if(s[i].lastIndexOf(".txt")!=-1){
				System.out.println(s[i]);
			}
		}
		
		File file1 =new File(path+"/"+path1);
		file1.createNewFile();
		//写内容
		FileOutputStream fos=new FileOutputStream(file1);
		String str="你好！";
		fos.write(str.getBytes());
		fos.close();
		
		FileInputStream fis=new FileInputStream(file1);
		//字节流复制
		File file2=new File(path+"/"+"b.txt");
		FileOutputStream fos1=new FileOutputStream(file2);
	
		byte[]b=new byte[1024];
		int i=0;
		while((i=fis.read(b))!=-1){
			System.out.println(new String (b,0,i));
			fos1.write(b,0,i);
		}
		fis.close();
		fos1.close();
		
		//字符流复制
		FileReader fr=new FileReader(file1);
		FileWriter fw=new FileWriter(path+"/"+"c.txt");
		char[]c=new char[1024];
		int j=0;
		while((j=fr.read(c))!=-1){
			fw.write(c,0,j);
		}
		fw.close();
		fr.close();	
	}
}
