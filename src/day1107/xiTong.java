package day1107;

import java.util.Scanner;

public class xiTong 
{
	Scanner I=new Scanner(System.in);
	String name = null,Name;		
	int miMa = 0,MiMa,nmiMa;		
	public void zhuCe()
	{
		/*
		 *注册
		 *
		 */		
		System.out.println("输入用户名：");
		name=I.next();
		System.out.println("输入密码：");
		miMa=I.nextInt();
		System.out.println("注册成功！");
		System.out.println("用户名是："+name+"密码是："+miMa);
	}
	public boolean dengLu()
	{
		/*
		 * 登陆
		 * 
		 */
		System.out.println("请输入用户名：");
		Name=I.next();
		System.out.println("请输入密码：");
		MiMa=I.nextInt();		
		if(Name.equals(name))
		{
			if(miMa==MiMa)
			{				
				System.out.println("登陆成功！");			
			}
			else if(miMa==nmiMa)
			{				
				System.out.println("登陆成功！");
			}			
			else
			{
				System.out.println("用户名或密码错误，请重新登录！");
				return dengLu();
			}
		}
		return false;
	}
	public void xiuGai()
	{
		/*
		 * 修改密码
		 * 
		 */
		dengLu();
		System.out.println("请输入新密码：");
		nmiMa=I.nextInt();
		System.out.println("修改成功，新密码是："+nmiMa);					
		miMa=nmiMa;		
		dengLu();
	}				
}			
		

