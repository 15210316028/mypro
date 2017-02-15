package day1026;

import java.util.Scanner;

public class demo7
{

	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);		
		double qk = 0,dk = 0,yk=10000;//每次取钱金额  取到手中金额 余额		
		for(int i=0;i<=100;i++)//取款次数
		{
			System.out.println("输入取款金额：");
			qk=I.nextInt();			
			if(qk%100==0)
			{				
				if(qk>3000)
				{					
					System.out.println("取钱失败，超出额度");	
					continue;
				}
				else
				{	
					if(yk>=100&&yk>qk)
					{		
						dk=dk+qk;						
					System.out.println("取钱:"+qk+"，余额"+(yk-qk));
					yk=yk-qk;
					}
					else
					{		
						System.out.println("取钱失败，余额不足");
						break;
					}					
				}								
			}
			else
			{
				System.out.println("输入失败，输入正确金额！");				
			}
		}		
	}

}
