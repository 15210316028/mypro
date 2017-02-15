package day1024;

import java.util.Scanner;

public class demo4 {
	public static void main(String[] zhu)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入消费金额：");
		double money1=input.nextDouble();
		double daZhe=0.8;
		double money2=money1*daZhe;
		System.out.println("本次消费"+daZhe*10+"折\n打折后价格："+money2+"元");
		
		
	}
	

}
