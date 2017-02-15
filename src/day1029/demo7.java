package day1029;

import java.util.Scanner;

public class demo7 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);		
		double qk = 0,dk = 0,yk=10000,ATM=20000;//每次取钱金额  取到手中金额 余额  ATM机中金额
		String yhm="****";
		int mm=111111;
		int kh=123456789;
		String yes="y";
		System.out.println("欢迎登录系统");
		for(int j=2;j>=0;j--)
		{
			System.out.print("请输入卡号：");
			kh=I.nextInt();
			System.out.print("输入密码：");
			mm=I.nextInt();
			if(kh==111111&&mm==123456789)
			{	
				do
				{
					System.out.println("1、查询\n2、取款\n3、退出");
					System.out.print("选择要办理的业务：");
					int num=I.nextInt();										
						switch(num)
						{
						case 1:
							System.out.println("您的用户名为："+yhm+"，"+"卡上金额为"+yk);
						break;
						case 2:				
							do
							{
								System.out.println("输入取款金额：");
								qk=I.nextInt();			
								if(qk%100==0)
								{				
									if(qk>3000)
									{					
										System.out.println("取钱失败，超出额度！");	
										continue;
									}
									else
									{	
										if(yk>=100&&qk<=yk&&qk<=ATM)
										{		
											dk=dk+qk;						
											System.out.println("取钱:"+qk+"，余额"+(yk-qk));
											yk=yk-qk;
										}
										else 
										{		
											System.out.println("取钱失败，余额不足！");
											continue;
										}																									
									}								
								}
								else
								{
									System.out.println("输入失败，输入正确金额！");				
								}							
								System.out.println("是否继续取款（y/n）:");
								yes=I.next();
								
							}
							while(yes.equals("y"));																	
							break;																			
					case 3:
						System.out.println("安全退出，谢谢使用！");
						break;
					default:
						System.out.println("输入失败，输入正确选择！");
					}						
				System.out.println("是否继续业务（y/n）:");
				 yes=I.next();
				 break;
				}
				while(yes.equals("y"));										
				System.out.println("安全退出，谢谢使用！");				
			}
			else
			{			
				System.out.println("输入有误，输入正确卡号和密码！还有"+j+"次机会");
				if(j==0)
				{
					System.out.println("机会用光，联系柜台解锁");
					continue;
				}														
			}
		}
		
	}
}
