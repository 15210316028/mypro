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
			System.out.println("�����"+(i+1)+"�ʹ����");
			money[i]=I.nextDouble();
		}
			System.out.println("���\t\t�����");
			for(int j=0;j<5;j++)
		{
			System.out.println((j+1)+"\t\t"+money[j]);
			sum=sum+money[j];
		}				
		System.out.println("�ܽ��\t\t"+sum);
	}
}
