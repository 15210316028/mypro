package day1106;

import java.util.Scanner;

public class Computer 
{
	Scanner I=new Scanner(System.in);
	 String name;//��������
	int num;//ѡ�����֣�1��2��3��
	public boolean initialGame()
	{
		System.out.println("ѡ���ս��ɫ��1������ 2����Ȩ 3���ܲ٣���");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			name="����";
			break;
		case 2:
			name="��Ȩ";
			break;
		case 3:
			name="�ܲ�";
			break;
		default:
			System.out.print("ѡ����������ѡ��");
			return initialGame();
		}
		return false ;
	}
	public boolean showFist()
	{
		num = (int)(Math.random()*10%3+1);
		switch(num)
		{
		case 1:
			System.out.println(name+"��ȭ������");
			break;
		case 2:
			System.out.println(name+"��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(name+"��ȭ����");
			break;
		default:
			System.out.println("ѡ����������ѡ��");
			return showFist();
		}
		return false;
	}
}
