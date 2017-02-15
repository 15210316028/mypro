package day1031;

import java.util.Scanner;

public class demo6 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		int[] s=new int[10];
		System.out.print("输出数组:");
		for(int i=0;i<s.length;i++)
		{
			s[i]=s[i]=(int) (Math.random()*10);//0-9的随机数
			System.out.print(s[i]+",");
		}
		System.out.println("\n输入数字:");
		int num=I.nextInt();
		for(int i=0;i<s.length;i++)
		{
		if(s[i]==num)
		{
			System.out.print("在里面");
			break;
		}
		else if(i==9)
		{
			System.out.print("不在里面");
		}		
	}
	}
}
