package day1031;

import java.util.Scanner;

public class demo5 
{
	public static void main(String[] zhu) 
	{
	Scanner I=new Scanner(System.in);
	String yes="y";
	String yhm="*****";//用户名
	int mm=111111;//密码
	int hyh;//会员号
	int sj;
	int max=9999;
	int min=1000;
	int sum=0;
	do
	{								
		System.out.println("******欢迎进入奖克富翁系统******");
		System.out.println("\t1、注册");
		System.out.println("\t2、登陆");
		System.out.println("\t3、抽奖");
		System.out.println("**************************");
		System.out.print("请选择菜单：");		
		int xz=I.nextInt();
		switch(xz)
			{	
			case 1:
				System.out.println("注册");
				System.out.println("输入注册信息：");
				System.out.print("用户名：");
				yhm=I.next();
				System.out.print("用户密码：");
				mm=I.nextInt();
				hyh=(int)(Math.random()*(max-min)) +min;
				System.out.println("注册成功，请记住会员号");
				System.out.println(yhm+"\t"+mm+"\t"+hyh);
				break;
			case 2:
				System.out.println("登陆");
				for(int i=2;i>=0;i--)
				{
					System.out.println("请输入用户名：");
					yhm=I.next();
					System.out.println("请输入用户密码：");
					mm=I.nextInt();										
					if((!yhm.equals("*****"))||(mm!=111111))
					{
						System.out.println("输入有误，请重新输入！还有"+i+"次机会");
						if(i==0)
						{
							System.out.println("机会用光，请联系客服解锁！");
							break;
						}						
					}					
					else
					{
						sum++;
						System.out.println("欢迎登陆！");						
						break;
					}										
				}
				break;
			case 3:
				if(sum==1)
				{
				System.out.println("抽奖");
				System.out.println("请输入您的会员号");
				hyh=I.nextInt();
				System.out.println("本日幸运数是：");
				for(int j=0;j<5;j++)
				{
					sj=(int)(Math.random()*(max-min)) +min;
					System.out.print(sj+" ");
					if(hyh==sj)
					{
						System.out.print("恭喜你，你是本日幸运星，获得奖品一份");
					}
					else
					{
						System.out.print("很遗憾，您不是今日幸运星");
					}
				}
				}
				else
				{
					System.out.println("请先登录");
				}
				break;
				default:		
					System.out.println("您输入有误");
			}
	
		System.out.println("\n是否继续（y/n）:");
		yes=I.next();
	}
	while(yes.equals("y"));
	System.out.println("系统退出，谢谢使用！");
	
	}
}
