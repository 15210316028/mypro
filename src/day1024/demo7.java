package day1024;

import java.util.Scanner;

public class demo7
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);		
		System.out.println("�������ѽ��:");
		double money=I.nextDouble();		
		System.out.println("�ǣ�y����μ��Żݻ������");
		String yes=I.next();
		if(yes.equals("y"))
		{
			String a="1����50Ԫ����2Ԫ��������һƿ";
			String b="2����100Ԫ����3Ԫ����500ml����һƿ";
			String c="3����100Ԫ����10Ԫ����5�������";
			String d="4����200Ԫ����10Ԫ������1��";
			String e="5����200Ԫ����20Ԫ����ˬ��ˮ1ƿ";
			System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
			{				
				System.out.println("��ѡ��");
				if(money>=200)
				{
					int xz=I.nextInt();
					switch(xz)
					{
					case 1:
						System.out.println("�����ܽ�"+(money+2)+"\n�ɹ���������һƿ");
					break;
					case 2:
						System.out.println("�����ܽ�"+(money+3)+"\n�ɹ�����500ml����һƿ");
					break;
					case 3:
						System.out.println("�����ܽ�"+(money+10)+"\n�ɹ�����5�������");
					break;
					case 4:
						System.out.println("�����ܽ�"+(money+10)+"\n�ɹ�������1��");
					break;
					case 5:
						System.out.println("�����ܽ�"+(money+20)+"\n�ɹ�����ˬ��ˮһƿ");
					break;							
					}
				}
				else if(money>=100)
				{
					int xz=I.nextInt();
					switch(xz)
					{
					case 1:
						System.out.println("�����ܽ�"+(money+2)+"\n�ɹ���������һƿ");
					break;
					case 2:
						System.out.println("�����ܽ�"+(money+3)+"\n�ɹ�����500ml����һƿ");
					break;
					case 3:
						System.out.println("�����ܽ�"+(money+10)+"\n�ɹ�����5�������");
					break;
					case 4:
						System.out.println("�����㻻������");
					break;
					case 5:
						System.out.println("�����㻻������");
					break;							
					}
				}
				else if(money>=50)
				{
					int xz=I.nextInt();
					switch(xz)
					{
					case 1:
						System.out.println("�����ܽ�"+(money+2)+"\n�ɹ���������һƿ");
					break;
					case 2:
						System.out.println("�����㻻������");
					break;
					case 3:
						System.out.println("�����㻻������");
					break;
					case 4:
						System.out.println("�����㻻������");
					break;
					case 5:
						System.out.println("�����㻻������");
					break;							
					}
				}
				else
				{
					System.out.println("�����㻻������");
				}
			}
		}
		else
		{
			System.out.println("������");
		}
		
	}

}
