package day1103;

import java.util.Scanner;

public class jiSuan 
{
	
	Scanner I=new Scanner(System.in);
	double money ;			
	public void a()
	{	
		System.out.println("欢迎登陆！");
		System.out.println("编号\t商品\t价格");
		System.out.println("1\t电风扇\t200.5");
		System.out.println("2\t洗衣机\t3000.0");
		System.out.println("3\t电视机\t5000.05");
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
		String Money=String.valueOf(money);//double转变成String型（浮点--字符串）
		StringBuffer jine=new StringBuffer(Money);
		for(int i=jine.indexOf(".")-3;i>0;i=i-3)
		{
			jine.insert(i,",");
		}
		System.out.print("总金额："+jine);
	}
	
}
