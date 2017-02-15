package day1024;

import java.util.Scanner;

public class demo3 
{
	public static void main(String[] zhu)
	{
		Scanner input=new Scanner(System.in);
//		System.out.println("输入成绩:\n");
//		double score=input.nextDouble();
//		if (score == 100)
//		{
//			System.out.println("买车");
//		}
//		else if (score >= 90)
//		{
//			System.out.println("买MP3");
//		}
//		else if (score >= 60) 
//		{
//			System.out.println("买参考书");
//		}
//		else
//		{
//			System.out.println("什么都不买");
//		}
	System.out.println("输入是（y）否（n）会员");
	String huiYuan=input.next();
	if(huiYuan.equals("y"))
	{
		System.out.println("输入金额：");
		double money=input.nextDouble();
		if(money>=200)
		{
			System.out.println("实际金额："+money*0.75);
		}
		else
		{
			System.out.println("实际金额："+money*0.8);
		}
	}
	else
	{
		System.out.println("输入金额：");
		double money=input.nextDouble();
		if(money>=100)
		{
			System.out.println("实际金额："+money*0.9);
		}
		else
		{
			System.out.println("实际金额：");
		}
	}
		
	
	
	
	
	}
}
