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
//		System.out.println("100����������:"+sum);
		Scanner I=new Scanner(System.in);
//		double sum1=0,sum2=0;//�������
//		double l1=0,l2=0;//����
//		for(int i=1;i<=10;i++)
//		{			
//			System.out.println("�����"+i+"λ�˿����䣺");
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
//		System.out.println("30�����ϱ���:"+l1+"\n30���±�����"+l2);
		int a=12345;
		int A;
		System.out.println("��ת����");
		while(a!=0)
		{
			A=a%10;
			System.out.println(A);
			a=a/10;
		}
	}

}
