package day1028;

import java.util.Scanner;

public class demo3 
{

	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);		
		for(int i=0;i<3;i++)
		{			
			System.out.println("�����"+(i+1)+"�ҵ�������Ʒ�۸�:");
			int s=0;
			for(int j=0;j<3;j++)
			{
				double money=I.nextDouble();
				if(money<300)
			{				
				continue;
			}						
					s++;							
			}
			System.out.println("���۲�Ʒ��"+s+"����");
		}		
	}

}
