package Phone;

import java.util.Scanner;

public class PhoneBiz 
{
	Scanner I=new Scanner(System.in);
	int num;
	public void a()
	{
		 Phone b = null;
		kind(b);
	}
	public String kind(Phone b)
	{
		String kind=null;		
		switch(num)
		{
		case 1:
			b.setKind("����");
			b.setEconomy("android");
			break;
		case 2:
			b.setKind("ƻ��");
			b.setEconomy("ios");
			break;
		case 3:
			b.setKind("С��");
			System.out.print("��ѡ������Ҫ���ֻ�ϵͳ��1��android����׿��2��MiUi ��:");
			num=I.nextInt();	
				switch(num)
				{
				case 1:
					b.setEconomy("android");			
					break;
				case 2:				
					b.setEconomy("MiUi");			
					break;
				}
			default:
				System.out.print("ѡ����������ѡ��");
//				return  kind(b);
			}
		size( b);
		return kind;
	}
	
	public  String size(Phone b)
	{
		String size = null;
		System.out.print("��ѡ������Ҫ���ֻ��ߴ磨1��3.5��  2��4.5��  3��5.5�磩��");	
		num=I.nextInt();	
		switch(num)
		{
		case 1:
			b.setSize("3.5");			
			 break;
		case 2:
			b.setSize("4.5");			
			 break;
		case 3:
			b.setSize("5.5");		
			 break;
		default:
			System.out.print("ѡ����������ѡ��");
			return  size(b);
		}
		 color(b);
		return size;
	}
	public  String color(Phone b)
	{
		String color = null;
		System.out.print("��ѡ������Ҫ���ֻ���ɫ��1����ɫ  2����ɫ  3�������𣩣�");	
		num=I.nextInt();	
		switch(num)
		{
		case 1:
			b.setColor("��ɫ");			
			 break;
		case 2:
			b.setColor("��ɫ");		
			break;
		case 3:
			b.setColor("������");		
			break;
		default:
			System.out.print("ѡ����������ѡ��");
			return color(b);
		}
		price(b);
		return color;						
	}
	public  String price(Phone b)
	{			
		String price=null;
		System.out.print("��ѡ������Ҫ���ֻ��۸�Χ(1:998  2:1998 3:2498)��");
		num=I.nextInt();	
		switch(num)
		{
		case 1:
			b.setPrice("998");
			break;
		case 2:
			b.setPrice("1998");
			break;
		case 3:
			b.setPrice("2498");
			break;
		default:
			System.out.print("ѡ����������ѡ��");
			return price(b);
			}
		phone( b);
		return price;						
	}	
	public  void phone(Phone b)
	{
		System.out.println("ѡ����һ��"+b.getEconomy()+"ϵͳ��"+b.getSize()+"���"+b.getColor()+b.getKind()+"�ֻ����۸�"+b.getPrice()+"Ԫ");
	}
}
