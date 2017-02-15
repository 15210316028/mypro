package day1022;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] zhu)

	{
		Scanner input= new Scanner(System.in);
		System.out.println("请输入姓名和成绩：");
		String name1="张三";
		double score1=input.nextDouble();
		System.out.println("请输入姓名和成绩：");
		String name2="李四";
		double score2=input.nextDouble();
		System.out.println("请输入姓名和成绩：");
		String name3="王五";
		double score3=input.nextDouble();
		System.out.println("请输入姓名和成绩：");
		String name4="小明";
		double score4=input.nextDouble();
		System.out.println("请输入姓名和成绩：");
		String name5="小红";
		double score5=input.nextDouble();
		System.out.println(name1+score1);
		System.out.println(name2+score2);
		System.out.println(name3+score3);
		System.out.println(name4+score4);
		System.out.println(name5+score5);
		System.out.println("张三\t李四\t王五\t小明\t小红");
		System.out.println(score1+"\t"+score2+"\t"+score3+"\t"+score4+"\t"+score5);
		double sumScore=score1+score2+score3+score4+score5;
		System.out.println("总成绩："+sumScore);
		double avgScore=sumScore/5;
		System.out.println("平均成绩："+avgScore);
				
	}

}
