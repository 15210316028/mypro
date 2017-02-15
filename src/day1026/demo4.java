package day1026;

import java.util.Scanner;

public class demo4
{
	public static void main(String[] zhu) 
	{
		double[] money=new double[5];
		double sum=0;		
		int i;
		for(i=0;i<5;i++)
		{
			Scanner I=new Scanner(System.in);
			System.out.println("输入第"+(i+1)+"笔购物金额：");
			money[i]=I.nextDouble();
		}
			System.out.println("序号\t\t￥金额");
			for(int j=0;j<5;j++)
		{
			System.out.println((j+1)+"\t\t"+money[j]);
			sum=sum+money[j];
		}				
		System.out.println("总金额\t\t"+sum);
	}
}
