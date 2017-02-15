package day1106;

import java.util.Scanner;

public class Game 
{
	Scanner I=new Scanner(System.in);
	String name;//电脑姓名
	int count;//游戏次数
	int result;//记录猜拳结果
	int sum;//记录玩家总分数	
	int SUM;//记录电脑总分数	
	public int calcResult()//总分数比较
	{
		if(sum>SUM)
			result=1;
		else if(sum<SUM)
			result=2;
		else
			result=3;
		return result;		
	}
	public void showResult()
	{
		switch(calcResult())
		{
		case 1:
			System.out.print("恭喜恭喜！");
			break;
		case 2:
			System.out.print("呵呵，笨笨，下次加油啊！");
			break;
		case 3:
			System.out.print("和局，真衰！嘿嘿，等着瞧吧！");
			break;
		}
	}
	public void startGame()
	{
		System.out.println("欢迎进入游戏世界");
		System.out.println("***********");
		System.out.println("**猜拳，开始**");
		System.out.println("***********");
		System.out.println("出拳规则：1、剪刀 2、石头 3、布");
	}
}
