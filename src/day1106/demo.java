package day1106;

import java.util.Scanner;

public class demo 
{
	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);
		int num;//ѡ�����֣�1��2��3��
		int sum = 0;//��ҷ���
		int SUM = 0;//���Է���
		int count = 0;//��¼����
		String quan = null;//���Գ�ȭ
		String NAME = null;
		String yes;
		System.out.println("��ӭ������Ϸ����");
		System.out.println("***********");
		System.out.println("**��ȭ����ʼ**");
		System.out.println("***********");
		System.out.println("��ȭ����1������ 2��ʯͷ 3����");
		System.out.print("ѡ���ս��ɫ��1������ 2����Ȩ 3���ܲ٣���");
		num=I.nextInt();		
		System.out.print("�������������");
		String name=I.next();
		while(true)
		{
			switch(num)
			{
			case 1:
				NAME="����";
				break;
			case 2:
				NAME="��Ȩ";
				break;
			case 3:
				NAME="�ܲ�";
				break;
			default:
				System.out.print("ѡ����������ѡ��");
			}
			System.out.println(name+"VS"+NAME+"��ս");				
			do
			{
				System.out.print("���ȭ��1������ 2��ʯͷ 3������������Ӧ���֣���");
				num=I.nextInt();
				switch(num)
				{
				case 1:
					quan="����";
					break;
				case 2:
					quan="ʯͷ";
					break;
				case 3:
					quan="��";
					break;
				default:
					System.out.print("ѡ����������ѡ��");
				}
				System.out.print(name+"��ȭ��"+quan);
				int random = (int)(Math.random()*10%3+1);
				switch(random)
				{
				case 1:
					System.out.print(NAME+"��ȭ������");
					break;
				case 2:
					System.out.print(NAME+"��ȭ��ʯͷ");
					break;
				case 3:
					System.out.print(NAME+"��ȭ����");
					break;									
				}
				if(((num==random-1)&&num!=3)||(num==3&&random==1))
				{
					System.out.print("����䣡");
					SUM++;
				}
				else if(num==random)
				{
					System.out.print("ƽ�֣��ͣ�");
				}
				else
				{
					System.out.print("���Ӯ��");
					sum++;
				}
				System.out.print("�Ƿ������y/n��");
				yes=I.next();
				count++;
			}													
			while(yes.equals("y"));
			if(SUM>sum)
				System.out.print("�����������ˣ�");
			else if(SUM<sum)
				System.out.print("��ϲ����Ӯ�ˣ�");
			else
				System.out.print("��˥��ƽ�ˣ�");
			System.out.println(name+"VS"+NAME);
			System.out.println("��ս������"+count);
			System.out.println("����\t�÷�");
			System.out.println(name+"\t"+sum+"\n"+NAME+"\t"+SUM);
			System.out.println("��Ϸ������");
			break;
		}
	}
}
