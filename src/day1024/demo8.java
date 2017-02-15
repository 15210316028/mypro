package day1024;

import java.util.Scanner;

public class demo8 {

	public static void main(String[] zhu) 
	{
		System.out.println("欢迎使用系统");
		String a1="1、登录系统";
		String b1="2、退出";
		System.out.println(a1+"\n"+b1);
		Scanner sz1=new Scanner(System.in);
		System.out.println("*********************************************************************\n请选择，输入数字：");
		int xz1=sz1.nextInt();
		switch(xz1)
		{
		case 1:
		{
			String a2="1、客户信息管理";
			String b2="2、购物结算";
			String c2="3、真情回馈";
			String d2="4、注销";
			System.out.println(a2+"\n"+b2+"\n"+c2+"\n"+d2);
			Scanner sz2=new Scanner(System.in);
			System.out.println("请选择，输入数字：");
			int xz2=sz2.nextInt();
			switch(xz2)
			{
			case 1:
			{
				String a3="1、显示用户信息";
				String b3="2、添加用户信息";
				String c3="3、修改用户信息";
				String d3="4、查询用户信息";
				System.out.println(a3+"\n"+b3+"\n"+c3+"\n"+d3);
			}
			break;
			case 3:
			{
				String a4="1、幸运大放送";
				String b4="2、幸运抽奖";
				String c4="3、生日问候";				
				System.out.println(a4+"\n"+b4+"\n"+c4);
			}
			break;
			}
		}
		break;
		case 2:
			System.out.println("谢谢使用");
		}

	}

}
