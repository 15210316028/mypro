package day1026;

import java.util.Arrays;
import java.util.Scanner;

public class demo5 
{

	public static void main(String[] args)
	{				 
			int j; 			 
			double Price[]=new double[5]; 			 
			double sum=0; //���벿��			 			 
			for(j=0;j<Price.length;j++)
			{ 			 
			Scanner input=new Scanner(System.in); 			 
			System.out.print("�������"+(j+1)+"�ʹ�����:"); 
			Price[j]=input.nextDouble(); 
			} 
//			System.out.println(""); //�������
			System.out.println("���\t\t���(Ԫ)"); 
			for(int i=0;i<5;i++)
			{ 
			System.out.println((i+1)+"\t\t"+Price[i]); 
			sum+=Price[i]; 
			} 
			System.out.println("�ܽ��\t\t"+sum); 
//			System.out.println(""); //����������
//			Arrays.sort(Price); 
//			System.out.println("----------------------------------------------------------"); 
//			System.out.print("|���\t|"); 
//			for(int i=0;i<5;i++)
//			{ 
//			System.out.print((i+1)+"\t|"); 
//			} 
//			System.out.print("�ܽ��"+"\t|"); 
//			System.out.println(""); 
//			System.out.println("----------------------------------------------------------"); 
//			System.out.print("|���\t|"); 
//			for(int i=0;i<5;i++)
//			{ 
//			System.out.print(Price[i]+"\t|"); 
//			} 
//			System.out.print(sum+"\t|"); 
//			System.out.println(""); 
//			System.out.println("----------------------------------------------------------"); 
	} 			
}


