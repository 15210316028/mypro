package phone1;

import java.util.Scanner;
public class Text 
{
	public static void main(String[] zhu) throws Exception 
	{		
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�������ֻ���");
		System.out.println("*****************");		
		String color = null;
		System.out.print("��ѡ������Ҫ���ֻ�Ʒ��(1:����(s)    2��ƻ��(p)    3��С��(m))��");
		String kind= input.next();
		if(!("s".equals(kind))&&!("p".equals(kind))&&!("m".equals(kind)))
		{
			throw new Exception("�������");
		}
		System.out.println("������ɫ(1����ɫ 2����ɫ 3����ɫ)");
		int num=input.nextInt();
		PhoneFactory pf=new PhoneFactory();		
		try 
		{
			if(num==1||num==2||num==3)
			{
				switch(num)
				{
				case 1:
					color="��ɫ";
					break;
				case 2:
					color="��ɫ";
					break;
				case 3:
					color="��ɫ";
					break;
				}
			}
			else
			{
				throw new Exception("�������");
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
