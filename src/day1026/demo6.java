package day1026;

import java.util.Scanner;

public class demo6
{
	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		System.out.println("����ѧ��������");
		String name=I.next();
		for(int i=0;i<5;i++)
		{
			System.out.println("�����"+(i+1)+"�ųɼ���");
			double fen=I.nextDouble();
			if(fen<0)
			{
				System.out.println("������������¼�룡");
				break;
			}
		}
	}

}
