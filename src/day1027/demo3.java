package day1027;

import java.util.Arrays;
import java.util.Scanner;

public class demo3 
{
	public static void main(String[] zhu) 
	{
//		char[] zm=new char[]{'a','c','u','p','e','f','z'};
//		Arrays.sort(zm);
//		for(int i=0;i<zm.length;i++)
//		{
//			System.out.print(zm[i]+"\t");
//		}
//		for(int j=zm.length-1;j>=0;j--)
//		{
//			System.out.print(zm[j]+"\t");
//		}		
		System.out.println("输入四家店的价格");				
		double[] money=new double[4];				
		for(int i=0;i<money.length;i++)
		{
			System.out.println("第"+(i+1)+"家的价格：");
			Scanner I=new Scanner(System.in);
			money[i]=I.nextDouble();									
		}
		Arrays.sort(money);
		System.out.println("最低价格是："+money[0]);
	}
}
