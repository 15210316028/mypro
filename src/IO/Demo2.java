package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file=new File("d://java_1009_io/test1.txt");
		if(file.exists()){
			System.out.println("´æÔÚ test1.txt");
		}else{
			file.createNewFile();
		}	
		FileOutputStream fos=new FileOutputStream(file,true);
		String s="1";
		fos.write(s.getBytes());
		fos.close();
		FileInputStream fis=new FileInputStream(file);
		byte[]b=new byte[1024];
		int i=0;
		while((i=fis.read(b))!=-1){
			System.out.println(new String (b,0,i));
		}
		fis.close();
	}
}
