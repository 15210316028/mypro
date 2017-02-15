package day1024;

import java.util.Scanner;

public class demo6 {

	public static void main(String[] zhu)
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("请输入会员号：");
		double hao=input1.nextDouble();
		Scanner input2=new Scanner(System.in);
		System.out.println("请输入会员生日：");
		String shengRi=input2.next();
		Scanner input3=new Scanner(System.in);
		System.out.println("请输入积分：");
		double fen=input3.nextDouble();
		System.out.println("会员号\t\t"+"生日\t\t"+"积分\n"+hao+"\t\t"+shengRi+"\t\t"+fen);
		int gewei = (int) (hao%10); 
		int shiwei = (int) (hao/10%10); 
		int baiwei = (int) (hao/100%10); 
		int qianwei = (int) (hao/1000);
		int num=gewei+shiwei+baiwei+qianwei;
		System.out.println(num);				
		int random=(int) (Math.random()*40);		
		if(random==num)
		{
			System.out.println("是幸运用户，奖励MP3一个");
		}
		else
		{
			System.out.println("谢谢惠顾");
		}
	}

}
