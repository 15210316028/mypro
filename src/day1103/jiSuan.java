package day1103;

import java.util.Scanner;

public class jiSuan 
{
	
	Scanner I=new Scanner(System.in);
	double money ;			
	public void a()
	{	
		System.out.println("��ӭ��½��");
		System.out.println("���\t��Ʒ\t�۸�");
		System.out.println("1\t�����\t200.5");
		System.out.println("2\tϴ�»�\t3000.0");
		System.out.println("3\t���ӻ�\t5000.05");
	}
	public double num(int num,int s)
	{				
		switch(num)
		{
			case 1:
				money=200.5*s;
				js();
				break;
			case 2:
				money=200.5*s;
				js();
				break;
			case 3:
				money=200.5*s;
				js();
				break;
		}
		return money;
	}			
	public void js()
	{
		String Money=String.valueOf(money);//doubleת���String�ͣ�����--�ַ�����
		StringBuffer jine=new StringBuffer(Money);
		for(int i=jine.indexOf(".")-3;i>0;i=i-3)
		{
			jine.insert(i,",");
		}
		System.out.print("�ܽ�"+jine);
	}
	
}
