package day1031;

import java.util.Scanner;

public class demo1 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		System.out.println("��ӭ����\n\nѡ��ϲ������Ϸ��");
		String a="***********************************";
		String b="1��������";
		String c="2����ţ";
		String d="3��������";
		String e="4��������";
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+a);
		System.out.println("ѡ����������֣�");
		int s=I.nextInt();
		switch(s)
		{
		case 1:
			System.out.print("��ӭ���붷�������䣡");
			break;
		case 2:
			System.out.print("��ӭ���붷ţ���䣡");
			break;
		case 3:
			System.out.print("��ӭ�������������䣡");
			break;
		default:
			System.out.print("��ӭ�������������䣡");										
		}
		

	}
}
