package day1103;

import java.util.Scanner;

public class demo2 
{
	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);		
		System.out.println("*****欢迎登录系统*****");
		boolean find;
		do
		{
			zhuCe2 A=new zhuCe2();
			System.out.print("输入身份证号(16或18位)：");
			String zh=I.next();
			System.out.print("输入手机号（11位）：");
			String sjh=I.next();
			System.out.print("输入座机号（区号4位，机号7位）：");
			String zjh=I.next();					
			find=A.length(zh, sjh, zjh);
		}
		while(!find);									
	}	
}
