package day1203;

import java.util.Scanner;

public class random {

	public static void main(String[] args) 
	{
		int random=(int) (Math.random()*100);
	
		Scanner I=new Scanner(System.in);
		while(true)
		{			
			System.out.print("输入任意一个数：");
			int num=I.nextInt();
			if(num>random)
			{
				System.out.println("猜错了，比这个数小!");
			}
			if(num<random)
			{
				System.out.println("猜错了，比这个数大!");
			}
			if(num==random)
			{
				System.out.println("恭喜你，答对了!");
				break;
			}
			System.out.println("是否继续（y/n）");
			String yes=I.next();
			if(yes.equals("y"))
			{
				continue;
			}
			else
			{
				System.out.println("谢谢使用！");
				break;
			}
		}
		
	}

}
