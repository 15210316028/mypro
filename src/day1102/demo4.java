package day1102;

import java.util.Scanner;

public class demo4
{
	public static void main(String[] args)
	{		
		Scanner I=new Scanner(System.in);
		String yes;
		boolean pd=true;
		System.out.print("����Ҫ¼��������");
		int num=I.nextInt();
		xinXi[] x=new xinXi[num];
		for(int i=0;i<num;i++)
		{
			xinXi r=new xinXi();
			System.out.println("�������֣�");
			String name=I.next();			
			System.out.println("�������䣺");
			int age=I.nextInt();
			if(age>=18)			
				pd=true;
			else
				pd=false;
			System.out.println("�Ƿ������y/n����");
			yes=I.next();
			if(yes.equals("y"))
				continue;			
			r.show(name, age, pd);
			x[i]=r;			
		}
		xinXiBiz cb=new xinXiBiz();
		cb.length(x);
		cb.shows();
		
	}
}
