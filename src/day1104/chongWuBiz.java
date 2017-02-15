package day1104;

import java.util.Scanner;

public class chongWuBiz 
{
	Scanner I=new Scanner(System.in);
	int num;
	public void name(chongWu a)
	{				
		System.out.print("输入宠物姓名：");
		String name=I.next();
		a.setName(name);
		lei(a);
	}
	public boolean lei(chongWu a)
	{									
		System.out.println("选择宠物类型：1、狗狗  2、QQ	");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			a.setLei("狗狗");
			kind1(a);
			break;
		case 2:
			a.setLei("QQ");
			kind2(a);
			break;
		default:
			System.out.print("选择有误，重新选择");
			return lei(a) ;
		}
		return false;		
	}		
	public boolean kind1(chongWu a)
	{				
		System.out.println("选择宠物种类：1、拉布拉多犬  2、雪纳瑞");					
		num=I.nextInt();								
		switch(num)
		{
		case 1:	
			a.setKind("拉布拉多犬");			
			break;			
		case 2:
			a.setKind("雪纳瑞");
			break;				
		default:
			System.out.print("选择有误，重新选择");
			return kind1(a);								
		}
			age(a);
			return false;
	}			
	public boolean kind2(chongWu a)
	{
		System.out.println("选择宠物种类：1、Q仔 2、Q妹");				
		num=I.nextInt();								
		switch(num)
		{
		case 1:
			a.setKind("Q仔");
			break;
		case 2:
			a.setKind("Q妹");
			break;
		default:
			System.out.print("选择有误，重新选择");
			return kind2(a);
		}
		age(a);
		return false;		
	}
	public void age(chongWu a)
	{
		System.out.print("输入宠物年龄：");
		int age = I.nextInt();
		a.setAge(age);
		health(a);
	}
	public void health(chongWu a)
	{
		System.out.print("输入宠物健康值：");
		int health = I.nextInt();		
		if(health<0||health>100)		
			a.setHealth(60);
		else		
			a.setHealth(health);
		System.out.println("宠物介绍：");
		System.out.println("名字："+a.getName());
		System.out.println("类型："+a.getLei());
		System.out.println("种类："+a.getKind());
		System.out.println("年龄："+a.getAge()+"岁");
		System.out.println("健康值(应该在0-100间，默认60)："+a.getHealth());		
	}		
}
