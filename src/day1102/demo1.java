package day1102;

import java.util.Scanner;

public class demo1
{
	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		Luru s=new Luru();
		System.out.print("����������");
		int num=I.nextInt();
		s.a(num);
		for(int i=0;i<num;i++)
		{
			System.out.print("�������֣�");
			String mz=I.next();									
			s.b(mz);
			System.out.println("�Ƿ����(y/n)");
			String yes=I.next();
			if(yes.equals("y"))			
				continue;			
			else			
				break;			
		}
		System.out.println("������"+" ");
		s.c();
		while(true)
		{
			System.out.println("\n����Ҫ�޸ĵ����֣�");
			String mz = I.next();
			System.out.println("�����޸ĵ����֣�");
			String nmz = I.next();
			if(s.d(mz,nmz)) 
			{			
				System.out.println("�����޸ĳɹ���");
				System.out.println("��������"+" ");
				s.c();
				break;
			}
			else
			{
				System.out.println("û�ҵ���ѧ����");
			}
		}
	}
}
