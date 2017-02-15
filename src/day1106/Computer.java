package day1106;

import java.util.Scanner;

public class Computer 
{
	Scanner I=new Scanner(System.in);
	 String name;//电脑姓名
	int num;//选择数字（1，2，3）
	public boolean initialGame()
	{
		System.out.println("选择对战角色（1、刘备 2、孙权 3、曹操）：");
		num=I.nextInt();
		switch(num)
		{
		case 1:
			name="刘备";
			break;
		case 2:
			name="孙权";
			break;
		case 3:
			name="曹操";
			break;
		default:
			System.out.print("选择有误，重新选择！");
			return initialGame();
		}
		return false ;
	}
	public boolean showFist()
	{
		num = (int)(Math.random()*10%3+1);
		switch(num)
		{
		case 1:
			System.out.println(name+"出拳：剪刀");
			break;
		case 2:
			System.out.println(name+"出拳：石头");
			break;
		case 3:
			System.out.println(name+"出拳：布");
			break;
		default:
			System.out.println("选择有误，重新选择！");
			return showFist();
		}
		return false;
	}
}
