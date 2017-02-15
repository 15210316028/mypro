package day1026;

import java.util.Scanner;

public class demo2 
{

	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		int hyh=0000,hysr=0000,hyjf=0000;
		for(int i=1;i<=3;i++)
		{
			System.out.println("\n输入会员号(四位整数):");		
			hyh=I.nextInt();
			System.out.println("输入会员生日:");		
			hysr=I.nextInt();
			System.out.println("输入会员积分:");		
			hyjf=I.nextInt();			
			if(hyh<1000||hyh>=10000)
			{
				break;
			}											
				System.out.println("录入信息是"+"\n"+hyh+"\t"+hysr+"\t"+hyjf);
		}
			System.out.println("程序失败!");				
	}

}
