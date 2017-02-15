package day1031;

import java.util.Scanner;

public class demo2 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		double j=0;//赢得局数
		for(int i=0;i<5;i++)//玩的局数
		{
			System.out.println("您正在玩第"+(i+1)+"局游戏，成绩是：");
			int w=I.nextInt();																
			if(w>=80)
			{
				j++;
			}					
			System.out.println("是否继续（y/n）:");
			String yes=I.next();
			if(yes.equals("y"))
			{
				System.out.println("进入下一局");
			}
			else
			{
				System.out.println("您已经中途退出游戏。");
				break;
			}
		}
		if(j>=4)
		{
			System.out.println("一！");
		}
		else if(j>=3)
		{
			System.out.println("2！");
		}
		else
		{
			System.out.println("对不起，您不能晋级！");
		}														
	}
}
