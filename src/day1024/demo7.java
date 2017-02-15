package day1024;

import java.util.Scanner;

public class demo7
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);		
		System.out.println("输入消费金额:");
		double money=I.nextDouble();		
		System.out.println("是（y）否参加优惠换购活动：");
		String yes=I.next();
		if(yes.equals("y"))
		{
			String a="1：满50元，加2元换购可乐一瓶";
			String b="2：满100元，加3元换购500ml可乐一瓶";
			String c="3：满100元，加10元换购5公斤面粉";
			String d="4：满200元，加10元换购锅1个";
			String e="5：满200元，加20元换购爽肤水1瓶";
			System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
			{				
				System.out.println("请选择：");
				if(money>=200)
				{
					int xz=I.nextInt();
					switch(xz)
					{
					case 1:
						System.out.println("消费总金额："+(money+2)+"\n成功换购可乐一瓶");
					break;
					case 2:
						System.out.println("消费总金额："+(money+3)+"\n成功换购500ml可乐一瓶");
					break;
					case 3:
						System.out.println("消费总金额："+(money+10)+"\n成功换购5公斤面粉");
					break;
					case 4:
						System.out.println("消费总金额："+(money+10)+"\n成功换购锅1个");
					break;
					case 5:
						System.out.println("消费总金额："+(money+20)+"\n成功换购爽肤水一瓶");
					break;							
					}
				}
				else if(money>=100)
				{
					int xz=I.nextInt();
					switch(xz)
					{
					case 1:
						System.out.println("消费总金额："+(money+2)+"\n成功换购可乐一瓶");
					break;
					case 2:
						System.out.println("消费总金额："+(money+3)+"\n成功换购500ml可乐一瓶");
					break;
					case 3:
						System.out.println("消费总金额："+(money+10)+"\n成功换购5公斤面粉");
					break;
					case 4:
						System.out.println("不满足换够条件");
					break;
					case 5:
						System.out.println("不满足换够条件");
					break;							
					}
				}
				else if(money>=50)
				{
					int xz=I.nextInt();
					switch(xz)
					{
					case 1:
						System.out.println("消费总金额："+(money+2)+"\n成功换购可乐一瓶");
					break;
					case 2:
						System.out.println("不满足换够条件");
					break;
					case 3:
						System.out.println("不满足换够条件");
					break;
					case 4:
						System.out.println("不满足换够条件");
					break;
					case 5:
						System.out.println("不满足换够条件");
					break;							
					}
				}
				else
				{
					System.out.println("不满足换够条件");
				}
			}
		}
		else
		{
			System.out.println("不换购");
		}
		
	}

}
