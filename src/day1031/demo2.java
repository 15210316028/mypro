package day1031;

import java.util.Scanner;

public class demo2 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		double j=0;//Ӯ�þ���
		for(int i=0;i<5;i++)//��ľ���
		{
			System.out.println("���������"+(i+1)+"����Ϸ���ɼ��ǣ�");
			int w=I.nextInt();																
			if(w>=80)
			{
				j++;
			}					
			System.out.println("�Ƿ������y/n��:");
			String yes=I.next();
			if(yes.equals("y"))
			{
				System.out.println("������һ��");
			}
			else
			{
				System.out.println("���Ѿ���;�˳���Ϸ��");
				break;
			}
		}
		if(j>=4)
		{
			System.out.println("һ��");
		}
		else if(j>=3)
		{
			System.out.println("2��");
		}
		else
		{
			System.out.println("�Բ��������ܽ�����");
		}														
	}
}
