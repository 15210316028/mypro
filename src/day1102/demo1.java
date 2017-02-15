package day1102;

import java.util.Scanner;

public class demo1
{
	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		Luru s=new Luru();
		System.out.print("输入人数：");
		int num=I.nextInt();
		s.a(num);
		for(int i=0;i<num;i++)
		{
			System.out.print("输入名字：");
			String mz=I.next();									
			s.b(mz);
			System.out.println("是否继续(y/n)");
			String yes=I.next();
			if(yes.equals("y"))			
				continue;			
			else			
				break;			
		}
		System.out.println("名单："+" ");
		s.c();
		while(true)
		{
			System.out.println("\n输入要修改的名字：");
			String mz = I.next();
			System.out.println("输入修改的名字：");
			String nmz = I.next();
			if(s.d(mz,nmz)) 
			{			
				System.out.println("名字修改成功：");
				System.out.println("新名单："+" ");
				s.c();
				break;
			}
			else
			{
				System.out.println("没找到该学生！");
			}
		}
	}
}
