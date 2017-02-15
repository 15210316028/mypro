package day1025;

public class demo3 {

	public static void main(String[] args) {			
			int i=1;
			int C=0;
			int F=32;
			while(C<=250&&i<=10)
			{				
				System.out.println("第"+i+"次"+C+"\t"+F);
				i++;
				C=C+20;
				F=(int) (C*9/5.0+32);
			}
				System.out.println("第"+i+"次"+C+"\t"+F);
	}			
				

}
