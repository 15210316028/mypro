package day1111;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args)
	{		
		Scanner I=new Scanner(System.in);
		
		try
		{
			System.out.print("输入数字：");
			int num=I.nextInt();
			switch(num)
			{
			case 1:
				System.out.print("c#");
				break;
			case 2:
				System.out.print("java");
				break;
			case 3:
				System.out.print("d");
				break;
			default:
				throw new Exception("错误提示!");				
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}
		finally
		{
			System.out.println("欢迎提出建议!");
		}

	}

}
