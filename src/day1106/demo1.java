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
				System.out.println("�����ˣ��汿��");
				g.SUM++;
			}
			else if(u.num==c.num)
			{
				System.out.println("ƽ�֣�");
			}
			else
			{
				System.out.println("��ϲ����Ӯ�ˣ�");
				g.sum++;
			}
			System.out.print("�Ƿ������y/n��");
			yes=I.next();
			g.count++;
		}
		while(yes.equals("y"));
		System.out.println("--------");
		System.out.println(u.name+"\tVS\t"+c.name);
		System.out.println("��ս������"+g.count);
		System.out.println("����\t�÷�");
		System.out.println(u.name+"\t"+g.sum+"\n"+c.name+"\t"+g.SUM);
		g.showResult();		
		System.out.println("��Ϸ������");
	}
}
