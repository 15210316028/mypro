package day1106;

import java.util.Scanner;

public class demo 
{
	public static void main(String[] args) 
	{
		Scanner I=new Scanner(System.in);
		int num;//选择数字（1，2，3）
		int sum = 0;//玩家分数
		int SUM = 0;//电脑分数
		int count = 0;//记录次数
		String quan = null;//电脑出拳
		String NAME = null;
		String yes;
		System.out.println("欢迎进入游戏世界");
		System.out.println("***********");
		System.out.println("**猜拳，开始**");
		System.out.println("***********");
		System.out.println("出拳规则：1、剪刀 2、石头 3、布");
		System.out.print("选择对战角色（1、刘备 2、孙权 3、曹操）：");
		num=I.nextInt();		
		System.out.print("输入玩家姓名：");
		String name=I.next();
		while(true)
		{
			switch(num)
			{
			case 1:
				NAME="刘备";
				break;
			case 2:
				NAME="孙权";
				break;
			case 3:
				NAME="曹操";
				break;
			default:
				System.out.print("选择有误，重新选择！");
			}
			System.out.println(name+"VS"+NAME+"对战");				
			do
			{
				System.out.print("请出拳：1、剪刀 2、石头 3、布（输入相应数字）：");
				num=I.nextInt();
				switch(num)
				{
				case 1:
					quan="剪刀";
					break;
				case 2:
					quan="石头";
					break;
				case 3:
					quan="布";
					break;
				default:
					System.out.print("选择有误，重新选择！");
				}
				System.out.print(name+"出拳："+quan);
				int random = (int)(Math.random()*10%3+1);
				switch(random)
				{
				case 1:
					System.out.print(NAME+"出拳：剪刀");
					break;
				case 2:
					System.out.print(NAME+"出拳：石头");
					break;
				case 3:
					System.out.print(NAME+"出拳：布");
					break;									
				}
				if(((num==random-1)&&num!=3)||(num==3&&random==1))
				{
					System.out.print("玩家输！");
					SUM++;
				}
				else if(num==random)
				{
					System.out.print("平局，和！");
				}
				else
				{
					System.out.print("玩家赢！");
					sum++;
				}
				System.out.print("是否继续（y/n）");
				yes=I.next();
				count++;
			}													
			while(yes.equals("y"));
			if(SUM>sum)
				System.out.print("笨笨，你输了！");
			else if(SUM<sum)
				System.out.print("恭喜，你赢了！");
			else
				System.out.print("真衰，平了！");
			System.out.println(name+"VS"+NAME);
			System.out.println("对战次数："+count);
			System.out.println("姓名\t得分");
			System.out.println(name+"\t"+sum+"\n"+NAME+"\t"+SUM);
			System.out.println("游戏结束！");
			break;
		}
	}
}
