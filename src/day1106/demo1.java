package day1106;

import java.util.Scanner;

public class demo1 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		User u=new User();
		Computer c=new Computer();
		Game g=new Game();
		g.startGame();
		c.initialGame();
		u.name();
		String yes;
		do{		
			System.out.print("");
			u.showFist();
			c.showFist();
			if(((u.num==c.num-1)&&u.num!=3)||(u.num==3&&c.num==1))
			{
				System.out.println("你输了，真笨！");
				g.SUM++;
			}
			else if(u.num==c.num)
			{
				System.out.println("平局！");
			}
			else
			{
				System.out.println("恭喜，你赢了！");
				g.sum++;
			}
			System.out.print("是否继续（y/n）");
			yes=I.next();
			g.count++;
		}
		while(yes.equals("y"));
		System.out.println("--------");
		System.out.println(u.name+"\tVS\t"+c.name);
		System.out.println("对战次数："+g.count);
		System.out.println("姓名\t得分");
		System.out.println(u.name+"\t"+g.sum+"\n"+c.name+"\t"+g.SUM);
		g.showResult();		
		System.out.println("游戏结束！");
	}
}
