package phone1;

import java.util.Scanner;
public class Text 
{
	public static void main(String[] zhu) throws Exception 
	{		
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到本手机店");
		System.out.println("*****************");		
		String color = null;
		System.out.print("请选择你想要的手机品牌(1:三星(s)    2：苹果(p)    3：小米(m))：");
		String kind= input.next();
		if(!("s".equals(kind))&&!("p".equals(kind))&&!("m".equals(kind)))
		{
			throw new Exception("输入错误");
		}
		System.out.println("输入颜色(1、黑色 2、白色 3、金色)");
		int num=input.nextInt();
		PhoneFactory pf=new PhoneFactory();		
		try 
		{
			if(num==1||num==2||num==3)
			{
				switch(num)
				{
				case 1:
					color="黑色";
					break;
				case 2:
					color="白色";
					break;
				case 3:
					color="金色";
					break;
				}
			}
			else
			{
				throw new Exception("输入错误");
			}	
			phone  p=pf.kind(color, kind);
			p.show();											
		} 
		catch (Exception e) 
		{			
			System.err.println(e.getMessage());
		}		
				
	}
}
