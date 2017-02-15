package day1031;

import java.util.Scanner;

public class demo3 
{
	public static void main(String[] zhu) 
	{
		Scanner I=new Scanner(System.in);
		System.out.println("迷你游戏平台》游戏币支付\n");
		System.out.println("选择游戏类型:");
		System.out.println("\t1、牌类\n\t2、休闲竞技");
		int yx=I.nextInt();
		System.out.println("输入游戏时长");
		int sj=I.nextInt();
		switch(yx)
		{
		case 1:
			if(sj>=10)
			{
				System.out.println("玩的是"+yx+"游戏，时长是："+sj+"，享受"+5+"折优惠");
				System.out.println("支付"+sj*10*0.5+"游戏币");
			}
			else
			{
				System.out.println("玩的是"+yx+"游戏，时长是："+sj+"，享受"+5+"折优惠");
				System.out.println("支付"+sj*10*0.5+"游戏币");
			}			
		break;
		default:
			if(sj>=10)
			{
				System.out.println("玩的是"+yx+"游戏，时长是："+sj+"，享受"+5+"折优惠");
				System.out.println("支付"+sj*10*0.5+"游戏币");
			}
			else
			{
				System.out.println("玩的是"+yx+"游戏，时长是："+sj+"，享受"+5+"折优惠");
				System.out.println("支付"+sj*10*0.5+"游戏币");
			}			
			
		}
	}
}
