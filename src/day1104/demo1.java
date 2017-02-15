package day1104;

import java.util.Scanner;

public class demo1
{
	public static void main(String[] args)
	{			
		Scanner I=new Scanner(System.in);		
		String name = null,lei = null,kind = null;
		int age = 0,health = 0;		
		System.out.println("欢迎来到本宠物店");					
		chongWu a=new chongWu(name, lei, kind, age,health);
		chongWuBiz b=new chongWuBiz();
		b.name(a);		
	}
}
