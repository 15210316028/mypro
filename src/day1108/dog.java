package day1108;

import java.util.Scanner;

public  class dog extends pet
{	
	Scanner I=new Scanner(System.in);
	int num;
	@Override
	public boolean sex(char sex) 
	{		
		System.out.println("����ѡ��");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			sex='��';
			break;
		case 2:
			sex='��';
			break;
		default:
			System.out.println("ѡ����������ѡ��");
			return sex(sex);
		}
		System.out.println("�ҵ��Ա��ǣ�"+sex);
		return false;
	}		
	@Override
	public boolean kind(String kind) 
	{		
		System.out.println("����ѡ��");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			kind="";
			break;
		case 2:
			kind="";
			break;
		default:
			System.out.println("ѡ����������ѡ��");
			return kind(kind);
		}
		System.out.println("�ҵ�Ʒ���ǣ�"+kind);
		return false;		
	}		
	public void name(String name)
	{
		System.out.println("�������֣�");
		name=I.next();	
		System.out.println("�ҵ������ǣ�"+name);
	}
}
