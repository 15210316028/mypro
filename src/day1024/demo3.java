package day1024;

import java.util.Scanner;

public class demo3 
{
	public static void main(String[] zhu)
	{
		Scanner input=new Scanner(System.in);
//		System.out.println("����ɼ�:\n");
//		double score=input.nextDouble();
//		if (score == 100)
//		{
//			System.out.println("��");
//		}
//		else if (score >= 90)
//		{
//			System.out.println("��MP3");
//		}
//		else if (score >= 60) 
//		{
//			System.out.println("��ο���");
//		}
//		else
//		{
//			System.out.println("ʲô������");
//		}
	System.out.println("�����ǣ�y����n����Ա");
	String huiYuan=input.next();
	if(huiYuan.equals("y"))
	{
		System.out.println("�����");
		double money=input.nextDouble();
		if(money>=200)
		{
			System.out.println("ʵ�ʽ�"+money*0.75);
		}
		else
		{
			System.out.println("ʵ�ʽ�"+money*0.8);
		}
	}
	else
	{
		System.out.println("�����");
		double money=input.nextDouble();
		if(money>=100)
		{
			System.out.println("ʵ�ʽ�"+money*0.9);
		}
		else
		{
			System.out.println("ʵ�ʽ�");
		}
	}
		
	
	
	
	
	}
}
