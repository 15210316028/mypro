package day1021;

import java.util.Scanner;

public class demo4 {
	public static void main(String[] zhu)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("������java�ɼ���");
		double javaScore=input.nextDouble();
		System.out.println("������stb�ɼ���");
		double stbScore=input.nextDouble();
		System.out.println("������.net�ɼ���");
		double netScore=input.nextDouble();
		System.out.println("java:"+javaScore);
		System.out.println("stb:"+stbScore);
		System.out.println(".net:"+netScore);
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("java\tstb\t.net");
		System.out.println(javaScore+"\t"+stbScore+"\t"+netScore);
		System.out.println("--------------------------------------------------------------------------------------------------");
		double diffentScore=javaScore-netScore;
		double avgScore=(javaScore+stbScore+netScore)/3;
		System.out.println("java��.net�ĳɼ��"+diffentScore);
		System.out.println("ƽ���ɼ���"+avgScore);
	}

}
