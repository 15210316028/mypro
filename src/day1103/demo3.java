package day1103;

import java.util.Scanner;

public class demo3 
{
	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);
		jiSuan A=new jiSuan();		
		while(true)
		{
			System.out.print("输入姓名：");
			String name=I.next();
			System.out.print("输入密码：");
			int mima=I.nextInt();		
			if(name.equals("****")&&mima==111111)
			{
				A.a();
				System.out.print("输入要选择的商品：");
				int num=I.nextInt();
				System.out.print("输入数量：");
				int s=I.nextInt();
				A.num(num,s);
				break;
			}
			else
				System.out.println("输入有误，重新输入！");
			continue;
		}
	}
}
