package day1108;

import java.util.Scanner;

public  class dog extends pet
{	
	Scanner I=new Scanner(System.in);
	int num;
	@Override
	public boolean sex(char sex) 
	{		
		System.out.println("输入选择：");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			sex='雄';
			break;
		case 2:
			sex='雌';
			break;
		default:
			System.out.println("选择有误，重新选择！");
			return sex(sex);
		}
		System.out.println("我的性别是："+sex);
		return false;
	}		
	@Override
	public boolean kind(String kind) 
	{		
		System.out.println("输入选择：");
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
			System.out.println("选择有误，重新选择！");
			return kind(kind);
		}
		System.out.println("我的品种是："+kind);
		return false;		
	}		
	public void name(String name)
	{
		System.out.println("输入名字：");
		name=I.next();	
		System.out.println("我的名字是："+name);
	}
}
