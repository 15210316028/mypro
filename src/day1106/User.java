package day1106;

import java.util.Scanner;

public class User 
{
	Scanner I=new Scanner(System.in);
	String name;//�������
	int num;//ѡ�����֣�1��2��3��	
	public void name()
	{
		System.out.print("�������������");
		name=I.next();
	}
	public boolean showFist()
	{			
		System.out.println("���ȭ��1������ 2��ʯͷ 3������������Ӧ���֣���");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			System.out.println(name+"��ȭ������"+"\t\t");
			break;
		case 2:
			System.out.println(name+"��ȭ��ʯͷ"+"\t\t");
			break;
		case 3:
			System.out.println(name+"��ȭ����"+"\t\t");
			break;
		default:
			System.out.println("ѡ����������ѡ��"+"\t");
			return showFist();
		}
		return false;
	}
}
