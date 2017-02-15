package day1103;

import java.util.Scanner;

public class zhuCe1
{
	String name;
	String pwd1;
	String pwd2;
	public void luRu()
	{
		Scanner I=new Scanner(System.in);		
		System.out.print("输入用户名（至少3个长度）：");
		name=I.next();
		System.out.print("输入密码（至少6个长度）：");
		pwd1=I.next();
		System.out.print("重新输入密码（至少6个长度）：");
		pwd2=I.next();
	}
	public boolean verify()
	{																	
		if(name.length()<3||pwd1.length()<6)
		{		
			System.out.println("注册失败，用户名不小于3个长度，密码不小于6个长度，重新注册！");
			return false;
		}
		else
		{
			if(!pwd2.equals(pwd1))
			{
				System.out.println("两次密码不同，重新注册！");	
				return false;
			}				
			else
			{				
				System.out.println("注册成功！");
				return true;
			}						
		}		 				
	}
}
