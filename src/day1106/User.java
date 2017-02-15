package day1106;

import java.util.Scanner;

public class User 
{
	Scanner I=new Scanner(System.in);
	String name;//玩家姓名
	int num;//选择数字（1，2，3）	
	public void name()
	{
		System.out.print("输入玩家姓名：");
		name=I.next();
	}
	public boolean showFist()
	{			
		System.out.println("请出拳：1、剪刀 2、石头 3、布（输入相应数字）：");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			System.out.println(name+"出拳：剪刀"+"\t\t");
			break;
		case 2:
			System.out.println(name+"出拳：石头"+"\t\t");
			break;
		case 3:
			System.out.println(name+"出拳：布"+"\t\t");
			break;
		default:
			System.out.println("选择有误，重新选择！"+"\t");
			return showFist();
		}
		return false;
	}
}
