package day1103;

import java.util.Scanner;

public class zhuCe1
{
	String name;
	String pwd1;
	String pwd2;
	public void luRu()
	{
		Scanner I=new Scanner(System.in);		
		System.out.print("�����û���������3�����ȣ���");
		name=I.next();
		System.out.print("�������루����6�����ȣ���");
		pwd1=I.next();
		System.out.print("�����������루����6�����ȣ���");
		pwd2=I.next();
	}
	public boolean verify()
	{																	
		if(name.length()<3||pwd1.length()<6)
		{		
			System.out.println("ע��ʧ�ܣ��û�����С��3�����ȣ����벻С��6�����ȣ�����ע�ᣡ");
			return false;
		}
		else
		{
			if(!pwd2.equals(pwd1))
			{
				System.out.println("�������벻ͬ������ע�ᣡ");	
				return false;
			}				
			else
			{				
				System.out.println("ע��ɹ���");
				return true;
			}						
		}		 				
	}
}
