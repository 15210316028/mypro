package day1027;

import java.util.Scanner;

public class demo2
{

	public static void main(String[] zhu) 
	{		        
		Scanner I=new Scanner(System.in);
		int [] cj=new int []{99,85,82,63,60,0};				
		int wz=cj.length;//���������ɼ���λ��
		System.out.println("�����������ɼ���");
		int s=I.nextInt();//����Ҫ���������
		//�ҵ���Ԫ�ز����λ��
		for (int i = 0; i < cj.length; i++) 
		{			             
			if (s>cj[i]) 
			{
			   wz=i+1;
			   break;
			 }
		}
		//Ԫ�غ���
		for (int i =cj.length-1 ; i >wz ; i--) 
		{
			cj[i]=cj[i-1];//�±꿪ʼ��Ԫ�غ���һ��λ��
		}
			cj[wz-1]=s;
			System.out.println("����ɼ����±꣺"+wz);			     
			System.out.println("�����ɼ���Ϣ�ǣ�");
		for (int i = 0; i < cj.length; i++)
		{
			 System.out.println(cj[i]+"\t");
		}
	}
}

