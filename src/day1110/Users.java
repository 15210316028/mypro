package day1110;

import java.util.Scanner;

public class Users 
{
	Scanner input=new Scanner(System.in);
	int num;
	public String brand()
	{
		String brand;
		System.out.print("ѡ�����Ʒ��:");
		num=input.nextInt();		
		switch(num)
		{
		case 1:
			brand="a";
			name1();
			break;
		case 2:
			brand="";
			name2();
			break;
		default:
		return 	brand();
		}
		return brand;		
	}
	public String name1()
	{
		String name;
		System.out.print("ѡ������ͺ�:");
		num=input.nextInt();		
		switch(num)
		{
		case 1:
			name="a";
			size();
			break;
		case 2:
			name="";
			size();
			break;
		default:
		return 	name1();
		}
		return name;
	}
	public String name2()
	{
		String name;
		System.out.print("��������ͺ�:");
		num=input.nextInt();		
		switch(num)
		{
		case 1:
			name="a";
			size();
			break;
		case 2:
			name="";
			size();
			break;
		default:
		return 	name2();
		}
		return name;
	}
	public String size()
	{
		String size;
		System.out.print("ѡ����Գߴ�:");
		num=input.nextInt();		
		switch(num)
		{
		case 1:
			size="a";
			color();
			break;
		case 2:
			size="";
			color();
			break;
		default:
		return 	size();
		}
		return size;
	}
	public String color()
	{
		String color;
		System.out.print("ѡ�������ɫ:");
		num=input.nextInt();		
		switch(num)
		{
		case 1:
			color="a";			
			break;
		case 2:
			color="";			
			break;
		default:
		return 	color();
		}
		return color;
	}
	
}	
