package day1026;

import java.util.Scanner;

public class demo3 
{

	public static void main(String[] zhu)
	{
		Scanner I=new Scanner(System.in);
		String name="****";
		int miMa=0000;
		for(int i=3;i<3;i--)
		{
			System.out.println("�������ƣ�");
			name=I.next();
			System.out.println("�������룺");
			miMa=I.nextInt();
			if(!name.equals("****")||miMa!=0000)			
			{							
				System.out.println("������󣡻���"+i+"�λ��ᣡ");
				if(i==0)
				System.out.println("3��������󣬲��ܵ�½��");
				continue;													
			}
			else
			{
				System.out.println("��½�ɹ���");
				break;
			}
		}
	}
}
