package day1101;

import java.util.Scanner;

public class Myshopping 
{
	Scanner I=new Scanner(System.in);
	String xi="***************************";
	String xz1="请选择，输入数字：";
	String xz2="请选择，输入数字或按0返回上一级菜单：";
	
	String A="欢迎登陆系统";
	String B="1、登录系统";
	String C="2、退出";
	
	String D="1、客户信息管理";
	String E="2、真情回馈";
	
	String F="1、幸运大放送";
	String G="2、幸运抽奖";
	String H="3、生日问候";
		
	String name="****";
	int miMa=111111;
	public void denglu()
	{
		System.out.println("\t"+A+"\n\t"+B+"\n\t"+C+"\n"+xi);
		System.out.println(xz1);
		int num1;
		num1=I.nextInt();
		switch(num1)
		{
		case 1:
			for(int i=2;i>=0;i--)
			{
				System.out.println("请输入用户名：");
				name=I.next();
				System.out.println("请输入密码：");
				miMa=I.nextInt();						
				if(!name.equals("****")||miMa!=111111)
					{
						System.out.println("输入有误，重新输入");
						System.out.println("还剩"+i+"次机会");															
						if(i==0)
						{
							System.out.println("机会用光，联系客服解锁");
							break;
						}
					}
				else
				{					
					System.out.println("欢迎登陆");
					zhucaidan();
					break;
				}
			}
			break;
		case 2:
			System.out.println("谢谢使用！");
			break;
		}		
	}
	public void zhucaidan()
	{
		System.out.println("\t"+D+"\n\t"+E+"\n"+xi);
		System.out.println(xz2);
		int num2;
		num2=I.nextInt();
		switch(num2)
		{
		case 1:
			break;
		case 2:
			huikui();
			break;
		default:
			denglu();
			break;
		}
	}
	public void huikui()
	{
		System.out.println("\t"+F+"\n\t"+G+"\n\t"+H+"\n"+xi);
		System.out.println(xz2);
		int num3;
		num3=I.nextInt();
		switch(num3)
		{
		case 1:
			System.out.println("幸运大放送");			
			break;
		case 2:
			System.out.println("幸运抽奖");
			break;
		case 3:
			System.out.println("生日问候");
			break;
		default:
			zhucaidan();
			break;
		}		
	}					
}
