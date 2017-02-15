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
			b.setKind("三星");
			b.setEconomy("android");
			break;
		case 2:
			b.setKind("苹果");
			b.setEconomy("ios");
			break;
		case 3:
			b.setKind("小米");
			System.out.print("请选择你想要的手机系统（1：android（安卓）2：MiUi ）:");
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
				System.out.print("选择有误，重新选择");
//				return  kind(b);
			}
		size( b);
		return kind;
	}
	
	public  String size(Phone b)
	{
		String size = null;
		System.out.print("请选择你想要的手机尺寸（1：3.5寸  2：4.5寸  3：5.5寸）：");	
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
			System.out.print("选择有误，重新选择");
			return  size(b);
		}
		 color(b);
		return size;
	}
	public  String color(Phone b)
	{
		String color = null;
		System.out.print("请选择你想要的手机颜色（1：黑色  2：白色  3：土豪金）：");	
		num=I.nextInt();	
		switch(num)
		{
		case 1:
			b.setColor("黑色");			
			 break;
		case 2:
			b.setColor("白色");		
			break;
		case 3:
			b.setColor("土豪金");		
			break;
		default:
			System.out.print("选择有误，重新选择");
			return color(b);
		}
		price(b);
		return color;						
	}
	public  String price(Phone b)
	{			
		String price=null;
		System.out.print("请选择你想要的手机价格范围(1:998  2:1998 3:2498)：");
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
			System.out.print("选择有误，重新选择");
			return price(b);
			}
		phone( b);
		return price;						
	}	
	public  void phone(Phone b)
	{
		System.out.println("选择了一款"+b.getEconomy()+"系统，"+b.getSize()+"寸的"+b.getColor()+b.getKind()+"手机，价格"+b.getPrice()+"元");
	}
}
