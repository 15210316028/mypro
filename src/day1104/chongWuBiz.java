package day1104;

import java.util.Scanner;

public class chongWuBiz 
{
	Scanner I=new Scanner(System.in);
	int num;
	public void name(chongWu a)
	{				
		System.out.print("�������������");
		String name=I.next();
		a.setName(name);
		lei(a);
	}
	public boolean lei(chongWu a)
	{									
		System.out.println("ѡ��������ͣ�1������  2��QQ	");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			a.setLei("����");
			kind1(a);
			break;
		case 2:
			a.setLei("QQ");
			kind2(a);
			break;
		default:
			System.out.print("ѡ����������ѡ��");
			return lei(a) ;
		}
		return false;		
	}		
	public boolean kind1(chongWu a)
	{				
		System.out.println("ѡ��������ࣺ1����������Ȯ  2��ѩ����");					
		num=I.nextInt();								
		switch(num)
		{
		case 1:	
			a.setKind("��������Ȯ");			
			break;			
		case 2:
			a.setKind("ѩ����");
			break;				
		default:
			System.out.print("ѡ����������ѡ��");
			return kind1(a);								
		}
			age(a);
			return false;
	}			
	public boolean kind2(chongWu a)
	{
		System.out.println("ѡ��������ࣺ1��Q�� 2��Q��");				
		num=I.nextInt();								
		switch(num)
		{
		case 1:
			a.setKind("Q��");
			break;
		case 2:
			a.setKind("Q��");
			break;
		default:
			System.out.print("ѡ����������ѡ��");
			return kind2(a);
		}
		age(a);
		return false;		
	}
	public void age(chongWu a)
	{
		System.out.print("����������䣺");
		int age = I.nextInt();
		a.setAge(age);
		health(a);
	}
	public void health(chongWu a)
	{
		System.out.print("������｡��ֵ��");
		int health = I.nextInt();		
		if(health<0||health>100)		
			a.setHealth(60);
		else		
			a.setHealth(health);
		System.out.println("������ܣ�");
		System.out.println("���֣�"+a.getName());
		System.out.println("���ͣ�"+a.getLei());
		System.out.println("���ࣺ"+a.getKind());
		System.out.println("���䣺"+a.getAge()+"��");
		System.out.println("����ֵ(Ӧ����0-100�䣬Ĭ��60)��"+a.getHealth());		
	}		
}
