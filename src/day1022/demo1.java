package day1022;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] zhu)

	{
		Scanner input= new Scanner(System.in);
		System.out.println("�����������ͳɼ���");
		String name1="����";
		double score1=input.nextDouble();
		System.out.println("�����������ͳɼ���");
		String name2="����";
		double score2=input.nextDouble();
		System.out.println("�����������ͳɼ���");
		String name3="����";
		double score3=input.nextDouble();
		System.out.println("�����������ͳɼ���");
		String name4="С��";
		double score4=input.nextDouble();
		System.out.println("�����������ͳɼ���");
		String name5="С��";
		double score5=input.nextDouble();
		System.out.println(name1+score1);
		System.out.println(name2+score2);
		System.out.println(name3+score3);
		System.out.println(name4+score4);
		System.out.println(name5+score5);
		System.out.println("����\t����\t����\tС��\tС��");
		System.out.println(score1+"\t"+score2+"\t"+score3+"\t"+score4+"\t"+score5);
		double sumScore=score1+score2+score3+score4+score5;
		System.out.println("�ܳɼ���"+sumScore);
		double avgScore=sumScore/5;
		System.out.println("ƽ���ɼ���"+avgScore);
				
	}

}
