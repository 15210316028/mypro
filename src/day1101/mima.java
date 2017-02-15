package day1101;

import java.util.Scanner;

public class mima 
{
	Scanner I=new Scanner(System.in);
	String mz="****";
	int mm=111111;
	public void ma()
	{
		System.out.println("输入名字：");
		 mz=I.next();
		System.out.println("输入密码：");
		 mm=I.nextInt();
		if(mz.equals("****")&&mm==111111)
		{
			System.out.println("输入新密码：");
			int nmm=I.nextInt();
		}
		else
		{
			System.out.println("输入有误，无权修改。");
		}		
	}
	
}
