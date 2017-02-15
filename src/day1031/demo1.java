package day1031;

import java.util.Scanner;

public class demo1 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		System.out.println("欢迎进入\n\n选择喜爱的游戏：");
		String a="***********************************";
		String b="1、斗地主";
		String c="2、斗牛";
		String d="3、泡泡龙";
		String e="4、连连看";
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+a);
		System.out.println("选择输入的数字：");
		int s=I.nextInt();
		switch(s)
		{
		case 1:
			System.out.print("欢迎进入斗地主房间！");
			break;
		case 2:
			System.out.print("欢迎进入斗牛房间！");
			break;
		case 3:
			System.out.print("欢迎进入泡泡龙房间！");
			break;
		default:
			System.out.print("欢迎进入连连看房间！");										
		}
		

	}
}
