package day1026;

import java.util.Scanner;

public class demo6
{
	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		System.out.println("输入学生姓名：");
		String name=I.next();
		for(int i=0;i<5;i++)
		{
			System.out.println("输入第"+(i+1)+"门成绩：");
			double fen=I.nextDouble();
			if(fen<0)
			{
				System.out.println("分数有误，重新录入！");
				break;
			}
		}
	}

}
