package day1031;

import java.util.Scanner;

public class demo6 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		int[] s=new int[10];
		System.out.print("�������:");
		for(int i=0;i<s.length;i++)
		{
			s[i]=s[i]=(int) (Math.random()*10);//0-9�������
			System.out.print(s[i]+",");
		}
		System.out.println("\n��������:");
		int num=I.nextInt();
		for(int i=0;i<s.length;i++)
		{
		if(s[i]==num)
		{
			System.out.print("������");
			break;
		}
		else if(i==9)
		{
			System.out.print("��������");
		}		
	}
	}
}
