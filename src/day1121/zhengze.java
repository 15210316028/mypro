package day1121;

import java.util.Scanner;

public class zhengze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner I=new Scanner(System.in);
		System.out.println("�������䣺");
		int num=I.nextInt();	
		System.out.println("�������䣺");
		String emial=I.next();		
		String reg="^[0-9a-zA-Z_]*(@){1}[0-9a-zA-Z_]*(.){1}[a-zA-Z]*$";
		for(int i=0;i<num;i++)
			if(emial.matches(reg))		
				System.out.println("��ȷ");		
			else		
				System.out.println("����");
			
			
	
	}

}
