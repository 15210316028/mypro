package IO;

import java.io.*;

public class c {

	public static void main(String[] args) {
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		FileReader fr = null;
		FileWriter fw = null;
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		int i = 1;
		
		String path1 = "d://a.txt";
		String path2 = "d://b.txt";
		String path3 = "d://c.txt";

		File file1 = new File(path1);
		File file2 = new File(path2);
		File file3 = new File(path3);

		try {
			if (file1.exists()) {
				if (file2.exists()) {
					
					while (true) {
						i++;
						String s = String.valueOf(i);
						fos1 = new FileOutputStream(file1);
						fos1.write(s.getBytes());
						
						fis1 = new FileInputStream(file1);
						fos2 = new FileOutputStream(file2);
						byte[] b = new byte[1024];						
						while ((i = fis1.read(b)) != -1) {
							System.out.println(new String(b, 0, i));
							fos2.write(b, 0, i);
						}
					
					}
				} else {
					file2.createNewFile();
				}
				if (file3.exists()) {
					fr = new FileReader(file1);
					fw = new FileWriter(file3);
					char[] c = new char[1024];					
					while ((i = fr.read(c)) != -1) {
						fw.write(c, 0, i);
					}					
				} else {
					file3.createNewFile();
				}
			} else {
				file1.createNewFile();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			try {
				fos1.close();
				fis1.close();
				fos2.close();
				fw.close();
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
