package IO;

import java.io.*;

public class copy {

	public static void main(String[] zhu) {
		String path = "d://";
		String child1 = "a.txt";
		String child2 = "b.txt";
		String child3 = "c.txt";
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		FileReader fr = null;
		FileWriter fw = null;
		FileInputStream fis = null;
		int i = 0;
		File file1 = new File(path, child1);
		File file2 = new File(path, child2);
		File file3 = new File(path, child3);
		try {
			if (file1.exists()) {				
				 while(true)
				 {
					 i++;
					 String s=String.valueOf(i);
					 fos1 = new FileOutputStream(file1);
						fos1.write(s.getBytes());
						fos1.close();
						fis = new FileInputStream(file1);
						byte[] b = new byte[1024];
						while ((i = fis.read(b)) != -1) {
							System.out.println(new String(b, 0, i));
						}
						fis.close();
				 }								
//				if (file2.exists()) {
//					
//					fos2 = new FileOutputStream(file2);
//					byte[] b = new byte[1024];
//					while ((i = fis.read(b)) != -1) {
//						System.out.println(new String(b, 0, i));
//						fos2.write(b, 0, i);
//					}
//				} else {
//					file2.createNewFile();
//				}
//				if (file3.exists()) {
//					fr = new FileReader(file1);
//					fw = new FileWriter(file3);
//					char[] c = new char[1024];
//					while ((i = fr.read(c)) != -1) {
//						fw.write(c, 0, i);
//					}
//				} else {
//					file3.createNewFile();
//				}
			} else {
				file1.createNewFile();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
				fw.close();
				fr.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
