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
			System.out.print("����������");
			String name=I.next();
			System.out.print("�������룺");
			int mima=I.nextInt();		
			if(name.equals("****")&&mima==111111)
			{
				A.a();
				System.out.print("����Ҫѡ�����Ʒ��");
				int num=I.nextInt();
				System.out.print("����������");
				int s=I.nextInt();
				A.num(num,s);
				break;
			}
			else
				System.out.println("���������������룡");
			continue;
		}
	}
}
