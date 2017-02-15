package day1026;

import java.util.Arrays;
import java.util.Scanner;

public class demo5 
{

	public static void main(String[] args)
	{				 
			int j; 			 
			double Price[]=new double[5]; 			 
			double sum=0; //输入部分			 			 
			for(j=0;j<Price.length;j++)
			{ 			 
			Scanner input=new Scanner(System.in); 			 
			System.out.print("请输入第"+(j+1)+"笔购物金额:"); 
			Price[j]=input.nextDouble(); 
			} 
//			System.out.println(""); //输出部分
			System.out.println("序号\t\t金额(元)"); 
			for(int i=0;i<5;i++)
			{ 
			System.out.println((i+1)+"\t\t"+Price[i]); 
			sum+=Price[i]; 
			} 
			System.out.println("总金额\t\t"+sum); 
//			System.out.println(""); //表格输出部分
//			Arrays.sort(Price); 
//			System.out.println("----------------------------------------------------------"); 
//			System.out.print("|序号\t|"); 
//			for(int i=0;i<5;i++)
//			{ 
//			System.out.print((i+1)+"\t|"); 
//			} 
//			System.out.print("总金额"+"\t|"); 
//			System.out.println(""); 
//			System.out.println("----------------------------------------------------------"); 
//			System.out.print("|金额\t|"); 
//			for(int i=0;i<5;i++)
//			{ 
//			System.out.print(Price[i]+"\t|"); 
//			} 
//			System.out.print(sum+"\t|"); 
//			System.out.println(""); 
//			System.out.println("----------------------------------------------------------"); 
	} 			
}


