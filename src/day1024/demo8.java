package day1024;

import java.util.Scanner;

public class demo8 {

	public static void main(String[] zhu) 
	{
		System.out.println("��ӭʹ��ϵͳ");
		String a1="1����¼ϵͳ";
		String b1="2���˳�";
		System.out.println(a1+"\n"+b1);
		Scanner sz1=new Scanner(System.in);
		System.out.println("*********************************************************************\n��ѡ���������֣�");
		int xz1=sz1.nextInt();
		switch(xz1)
		{
		case 1:
		{
			String a2="1���ͻ���Ϣ����";
			String b2="2���������";
			String c2="3���������";
			String d2="4��ע��";
			System.out.println(a2+"\n"+b2+"\n"+c2+"\n"+d2);
			Scanner sz2=new Scanner(System.in);
			System.out.println("��ѡ���������֣�");
			int xz2=sz2.nextInt();
			switch(xz2)
			{
			case 1:
			{
				String a3="1����ʾ�û���Ϣ";
				String b3="2������û���Ϣ";
				String c3="3���޸��û���Ϣ";
				String d3="4����ѯ�û���Ϣ";
				System.out.println(a3+"\n"+b3+"\n"+c3+"\n"+d3);
			}
			break;
			case 3:
			{
				String a4="1�����˴����";
				String b4="2�����˳齱";
				String c4="3�������ʺ�";				
				System.out.println(a4+"\n"+b4+"\n"+c4);
			}
			break;
			}
		}
		break;
		case 2:
			System.out.println("ллʹ��");
		}

	}

}
