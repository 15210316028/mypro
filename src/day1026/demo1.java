package day1026;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] zhu)
	{
//		int sum=0;
//		for(int i=0,j=0;2*i<=100;j=2*i+1,i++)
//		{
//					sum=sum+j;	
//		}
//		System.out.println("100以内奇数和:"+sum);
		Scanner I=new Scanner(System.in);
//		double sum1=0,sum2=0;//年龄个数
//		double l1=0,l2=0;//比例
//		for(int i=1;i<=10;i++)
//		{			
//			System.out.println("输入第"+i+"位顾客年龄：");
//			double age=I.nextDouble();						
//			if(age>=30)
//			{
//				sum1++;
//				l1=sum1/10;				
//			}
//			else
//			{
//				sum2++;
//				l2=sum2/10;
//			}			
//		}
//		System.out.println("30岁以上比例:"+l1+"\n30以下比例："+l2);
		int a=12345;
		int A;
		System.out.println("反转数：");
		while(a!=0)
		{
			A=a%10;
			System.out.println(A);
			a=a/10;
		}
	}

}
