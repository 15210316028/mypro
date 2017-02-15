package day1107;

import java.util.Scanner;

public class dengLu 
{

	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);	
		xiTong a=new xiTong();
		System.out.println("»¶Ó­µÇÂ¼ÏµÍ³£¡");
		while(true)
		{
			System.out.println("Ñ¡Ôñ·þÎñ£º");
			System.out.println("1¡¢×¢²á\n2¡¢µÇÂ½\n3¡¢ÐÞ¸ÄÃÜÂë");			
			int num=I.nextInt();
			switch(num)
			{
			case 1:
				a.zhuCe();
				break;
			case 2:
				a.dengLu();
				break;
			case 3:
				a.xiuGai();
				break;
			}		
		}
	}
}
