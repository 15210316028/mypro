package day1102;

import java.util.Scanner;

public class demo3 
{
	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		paiXu A=new paiXu();
		String name = null;
		System.out.print("输入人数：");
		int num=I.nextInt();
		A.a(num);
		for(int i=0;i<num;i++)
		{
			System.out.print("输入名称：");
			 name=I.next();
			A.b(name);
			System.out.print("是否继续(y/n):");
			String yes=I.next();
			if(yes.equals("y"))
				continue;
			else
				break;
		}	
		System.out.print("排序前："+" ");
		A.c();	
		System.out.println(" ");
		System.out.print("排序后："+" ");
		A.d(name);
	}
}
