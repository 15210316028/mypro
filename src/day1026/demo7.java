package day1026;

import java.util.Scanner;

public class demo7
{

	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);		
		double qk = 0,dk = 0,yk=10000;//ÿ��ȡǮ���  ȡ�����н�� ���		
		for(int i=0;i<=100;i++)//ȡ�����
		{
			System.out.println("����ȡ���");
			qk=I.nextInt();			
			if(qk%100==0)
			{				
				if(qk>3000)
				{					
					System.out.println("ȡǮʧ�ܣ��������");	
					continue;
				}
				else
				{	
					if(yk>=100&&yk>qk)
					{		
						dk=dk+qk;						
					System.out.println("ȡǮ:"+qk+"�����"+(yk-qk));
					yk=yk-qk;
					}
					else
					{		
						System.out.println("ȡǮʧ�ܣ�����");
						break;
					}					
				}								
			}
			else
			{
				System.out.println("����ʧ�ܣ�������ȷ��");				
			}
		}		
	}

}
