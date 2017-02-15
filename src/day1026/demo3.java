package day1026;

import java.util.Scanner;

public class demo3 
{

	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		String name="****";
		int miMa=0000;
		for(int i=3;i<3;i--)
		{
			System.out.println("输入名称：");
			name=I.next();
			System.out.println("输入密码：");
			miMa=I.nextInt();
			if(!name.equals("****")||miMa!=0000)			
			{							
				System.out.println("输入错误！还有"+i+"次机会！");
				if(i==0)
				System.out.println("3次输入错误，不能登陆！");
				continue;													
			}
			else
			{
				System.out.println("登陆成功！");
				break;
			}
		}
	}
}
